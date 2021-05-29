package com.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;


/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter({ "/admin/*" })
public class AuthenticationFilter implements Filter {

	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String message = request.getParameter("message");
		String alert = request.getParameter("alert");
		if (message != null && alert != null) {
			request.setAttribute("message", message);
			request.setAttribute("alert", alert);
		}
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		User user = (User) httpServletRequest.getSession().getAttribute("user");

		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		if (user == null) {	
			httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/Login?role=login&message=Fail is invalid!&alert=danger");
		} else {
			if(user.getRole().equals(true)) {
				httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/Login?role=User&message=Fail is invalid!&alert=danger");
			}else {
				chain.doFilter(httpServletRequest, response);
			}
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
