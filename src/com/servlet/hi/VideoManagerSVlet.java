package com.servlet.hi;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.Dao.VideoDAO;
import com.entity.Video;

/**
 * Servlet implementation class VideoSVlet
 */
@WebServlet("/admin/VideoManagerSVlet")
public class VideoManagerSVlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public VideoDAO videoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoManagerSVlet() {
        this.videoDAO =new VideoDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pageStr = request.getParameter("page");
		String limitStr = request.getParameter("limit");

		int page = pageStr == null ? 1 : Integer.parseInt(pageStr);
		int limit = limitStr == null ? 8 : Integer.parseInt(limitStr);

		int offset = limit * (page - 1);

		List<Video> listVideo =this.videoDAO.paginate(offset, limit);
		
		request.setAttribute("listVideo", listVideo);
		request.setAttribute("page", page);
		String view = "/view/admin/videos/CreateVD.jsp";
		request.setAttribute("view", view);
		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Video entipy = new Video();
		try {
			BeanUtils.populate(entipy, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.videoDAO.store(entipy);
		response.sendRedirect(request.getContextPath() + "/admin/VideoManagerSVlet");
		

	}

}
