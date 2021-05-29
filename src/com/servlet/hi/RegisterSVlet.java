package com.servlet.hi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import com.Dao.UserDAO;
import com.entity.User;


/**
 * Servlet implementation class RegisterSVlet
 */
@WebServlet("/register")
public class RegisterSVlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterSVlet() {
    this.userDAO =new UserDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

        String view ="/view/auth/register.jsp";
        request.setAttribute("view", view);
		request.getRequestDispatcher("/view/layout.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User entipy = new User();
		entipy.setRole(true);
		try {
			BeanUtils.populate(entipy, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.userDAO.store(entipy);
		response.sendRedirect(request.getContextPath() + "/register");
		

	}
	
	

}
