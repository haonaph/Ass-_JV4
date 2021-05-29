package com.servlet.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.UserDAO;
import com.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		this.userDAO = new UserDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = request.getParameter("message");
		String alert = request.getParameter("alert");
		if (message != null && alert != null) {
			request.setAttribute("message", message);
			request.setAttribute("alert", alert);
		}

		String view = "/view/auth/Login.jsp";
		request.setAttribute("view", view);
		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}

	//Authorization --> u-q
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User entipy = this.userDAO.login(email, password);
		if (entipy == null) {
			response.sendRedirect(request.getContextPath() + "/Login?role=login&message=Email or Password is invalid!&alert=danger");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("user", entipy);
			if (entipy.getRole().equals(true)) {
				response.sendRedirect(request.getContextPath() + "/Home");
			} else {
				response.sendRedirect(request.getContextPath() + "/admin/VideoManagerSVlet");
			}

		}
	}

}
