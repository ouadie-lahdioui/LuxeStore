package technoway.formation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Formateur
 * 
 */
public class Formateurs extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public Formateurs() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1> Bonjour formateur, c'est une méthode GET !</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1> Bonjour formateur, c'est une méthode POST !</h1>");
	}

}
