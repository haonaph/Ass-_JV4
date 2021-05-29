package com.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDAO;
import com.entity.User;


@WebServlet("/admin/users/delete")
public class DeleteUserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	public DeleteUserServlet() {
		this.userDAO = new UserDAO();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String idStr = req.getParameter("id");
		
		if (idStr == null) {
			// 400 Bad Request
		}

		int id = Integer.parseInt(idStr);
		User entity = new User();
		entity.setId(id);
		
		 this.userDAO.delete(entity);
		
		resp.sendRedirect(req.getContextPath() + "/admin/users");
	}

}
