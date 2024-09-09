package vn.iostar.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home", "/trangchu" })

public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -307497019368282837L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		PrintWriter printW = resp.getWriter();
		printW.println("Xin Chao "+ holot+" " + ten);
		
		printW.close();

	}
}
