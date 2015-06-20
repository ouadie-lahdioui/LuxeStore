package technoway.formation.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Technoway Foundation
 * 
 */
//@WebServlet("/Cookies")
public class Cookies extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Cookies() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		
		String valeur = "";
		
		if(cookies != null) {
			
			for(int i=0; i < cookies.length; i++) {
				
				Cookie MonCookie = cookies[i];
				
				if (MonCookie.getName().equals("fabricationDate")) {
					
					valeur = cookies[i].getValue();
					
				}
				
			}
			
		}
	
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();		
		
		out.println("<html><head>"); 

		out.println("<title>Mon Cookie</title>");

		out.println("</head><body>");

		out.println("Voici la valeur de mon cookie : " + valeur );

		out.println("</body></html>"); 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie MonCookie = new Cookie("fabricationDate", new Date().toString());
		
		response.addCookie(MonCookie);
		
	}
	
}
