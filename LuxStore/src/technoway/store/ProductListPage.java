package technoway.store;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.Headers;

@WebServlet("/plp")
public class ProductListPage extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ProductListPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        PrintWriter printWriter  = response.getWriter();
        printWriter.println("<h1> Bonjour, c'est une méthode GET !</h1>");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
        PrintWriter printWriter  = resp.getWriter();
        printWriter.println("<h1> Bonjour, c'est une méthode PUT !</h1>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
        PrintWriter printWriter  = resp.getWriter();
        printWriter.println("<h1> Bonjour, c'est une méthode POST !</h1>");
        
        
        String contentType = req.getHeader("Accept");
        printWriter.println("Content-Type:" + contentType);
        
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter printWriter  = resp.getWriter();
        printWriter.println("<h1> Bonjour, c'est une méthode DELETE !</h1>");
	}
	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		PrintWriter printWriter  = arg1.getWriter();
        printWriter.println("<h1> Bonjour, c'est une méthode HEAD !</h1>");
	}
	
	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		PrintWriter printWriter  = arg1.getWriter();
        printWriter.println("<h1> Bonjour, c'est une méthode OPTIONS !</h1>");
	}
	
}
