package com.josefina.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		if ("admin".equals(user) && "admin".equals(pass)) {
			response(resp, "Login Ok");
		} else {
			response(resp, "Login Invalido");
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		if ("admin".equals(user) && "admin".equals(pass)) {
			response(resp, "Login Ok");
		} else {
			response(resp, "Login Invalido");
		}
	}

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + msg + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}