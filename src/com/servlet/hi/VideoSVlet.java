

package com.servlet.hi;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.VideoDAO;
import com.entity.Video;

/**
 * Servlet implementation class VideoManagerSVlet
 */
@WebServlet("/Home/VideoSVlet")
public class VideoSVlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public VideoDAO videoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoSVlet() {
       this.videoDAO =new VideoDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id"));
		Video entipy = this.videoDAO.findbyid(id);
		request.setAttribute("video", entipy);
			
		String view = "/view/paragr/form.jsp";
		request.setAttribute("view", view);
		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}

	

}
