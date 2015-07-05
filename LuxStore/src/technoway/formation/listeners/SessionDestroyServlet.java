package technoway.formation.listeners;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDestroyServlet extends HttpServlet { 

	private static final long serialVersionUID = 1L;

	public void doGet (HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException
      {
         //Get the session object
         HttpSession session = req.getSession(true);
         // Invalidate Session
         session.invalidate(); 

         // set content type and other response header fields first
         res.setContentType("text/html");

         // then write the data of the response
         PrintWriter out = res.getWriter();

         out.println("<HEAD><TITLE> " + "Session Destroyed Successfully .. Look at Console to see whether the HttpSessionEvent invoked " 
           + "</TITLE></HEAD><BODY>");
         out.println("<P>[<A HREF=\"../index.jsp\">Restart</A>]");
         out.println("<h2> Session Destroyed Successfully</h2>");
         out.println("Look at the OC4J Console to see whether the HttpSessionEvent was invoked");
         out.close();
   }
}