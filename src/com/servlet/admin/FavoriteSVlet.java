package com.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.FavoriteDAO;
import com.entity.Favorite;


/**
 * Servlet implementation class FavoriteSVlet
 */
@WebServlet("/FavoriteSVlet")
public class FavoriteSVlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public FavoriteDAO favoriteDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FavoriteSVlet() {
		this.favoriteDAO = new FavoriteDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String pageStr = request.getParameter("page");
		String limitStr = request.getParameter("limit");

		int page = pageStr == null ? 1 : Integer.parseInt(pageStr);
		int limit = limitStr == null ? 10 : Integer.parseInt(limitStr);

		int offset = limit * (page - 1);

		List<Favorite> listfavorite = this.favoriteDAO.paginate(offset, page);
		
		request.setAttribute("listfavorite", listfavorite);
		request.setAttribute("page", page);
		String view = "/view/listUs/CreateFavorite.jsp";
		request.setAttribute("view", view);
		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}
	

}
