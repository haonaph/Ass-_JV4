package com.servlet.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.VideoDAO;
import com.entity.Video;

/**
 * Servlet implementation class DeleteVideo
 */
@WebServlet("/admin/VideoManagerSVlet/DeleteVideo")
public class DeleteVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public VideoDAO videoDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteVideo() {
		this.videoDAO = new VideoDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idStr = req.getParameter("id");

		if (idStr == null) {
			// 400 Bad Request
		}

		int id = Integer.parseInt(idStr);
		Video entity = new Video();
		entity.setId(id);

		this.videoDAO.delete(entity);

		resp.sendRedirect(req.getContextPath() + "/admin/VideoManagerSVlet");
	}

}
