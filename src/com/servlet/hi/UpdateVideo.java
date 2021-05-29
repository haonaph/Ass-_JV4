package com.servlet.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.Dao.VideoDAO;
import com.entity.Video;

/**
 * Servlet implementation class UpdateVideo
 */
@WebServlet("/admin/VideoManagerSVlet/UpdateVideo")
public class UpdateVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public VideoDAO videoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateVideo() {
        this.videoDAO =new VideoDAO();
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
		Video entipy = this.videoDAO.findbyid(id);
		req.setAttribute("video", entipy);

        String view ="/view/admin/videos/CreateVD.jsp";
        req.setAttribute("view", view);
		req.getRequestDispatcher("/view/layout.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Video entipy = new Video();
		try {
			BeanUtils.populate(entipy, req.getParameterMap());
			this.videoDAO.update(entipy);
			System.out.println("Thành công.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
        resp.sendRedirect(req.getContextPath() + "/admin/VideoManagerSVlet"); 
	}

}
