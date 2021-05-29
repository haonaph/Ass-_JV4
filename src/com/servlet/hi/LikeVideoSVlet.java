package com.servlet.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.FavoriteDAO;
import com.entity.Favorite;


/**
 * Servlet implementation class LikeVideoSVlet
 */
@WebServlet("/LikeVideoSVlet")
public class LikeVideoSVlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public FavoriteDAO favoriteDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LikeVideoSVlet() {
        this.favoriteDAO =new FavoriteDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userIDstr = request.getSession().getAttribute("user").toString();
		String videoIDstr = request.getParameter("video");
		System.out.println("vidID: " + videoIDstr +", user: " + userIDstr);
		try {
			int UsId = Integer.parseInt(userIDstr);
			int VdId = Integer.parseInt(videoIDstr);
			
			Favorite favo = this.favoriteDAO.findbyVideo(UsId, VdId);
			
			if(favo != null) {
				request.setAttribute("favoNull", favo);
				response.sendRedirect(request.getContextPath() + "/Home");
			}else {
				this.favoriteDAO.saveLike(UsId, VdId);
				response.sendRedirect(request.getContextPath() + "/FavoriteSVlet");	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
			
//		String view = "/view/videos/Index.jsp";
//		request.setAttribute("view", view);
//		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}
	


}
