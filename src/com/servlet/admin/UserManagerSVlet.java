package com.servlet.admin;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDAO;
import com.entity.User;


@WebServlet("/admin/users")
public class UserManagerSVlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	public UserManagerSVlet() {
		this.userDAO = new UserDAO();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pageStr = req.getParameter("page");
		String limitStr = req.getParameter("limit");

		int page = pageStr == null ? 1 : Integer.parseInt(pageStr);
		int limit = limitStr == null ? 10 : Integer.parseInt(limitStr);

		int offset = limit * (page - 1);
		
//			TypedQuery<User> query =HibernateUtils.getSession()
//					.createNamedQuery("User.getListActive", User.class);
//			List<User> listUser = query.getResultList();
		List<User> listUser = this.userDAO.paginate(offset, limit);

		req.setAttribute("listUser", listUser);
		req.setAttribute("page", page);
        String view ="/view/admin/users/UserManagerSVL.jsp";
        req.setAttribute("view", view);
		req.getRequestDispatcher("/view/layout.jsp").forward(req, resp);
	}
	
}
