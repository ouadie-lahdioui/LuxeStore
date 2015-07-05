package technoway.formation.listeners;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionCreateServlet extends HttpServlet { 

	private static final long serialVersionUID = 1L;

	public void doGet (HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException
      {
         //Get the session object
         HttpSession session = req.getSession(true);
        
        // set content type and other response header fields first
        res.setContentType("text/html");

        // then write the data of the response
        PrintWriter out = res.getWriter();
     
        String _sval = (String)session.getAttribute("counter");
        int _counter=1;
     
        if(_sval!=null)
        {
           _counter=Integer.parseInt(_sval);
           _counter++;
      }
   
       
      session.setAttribute("counter",String.valueOf(_counter));

      out.println("<HEAD><TITLE> " + "Session Created Successfully .. Look at Console to see whether the HttpSessionEvent invoked " 
         + "</TITLE></HEAD><BODY>");
      out.println("<P>[<A HREF=\"SessionCreateServlet\">Reload</A>]&nbsp;");   
      out.println("[<A HREF=\"SessionDestroyServlet\">Destroy Session</A>]");   
      out.println("<h2>Session created Successfully</h2>");
      out.println("Look at the OC4J Console to see whether the HttpSessionEvent was invoked");
      out.println("<h3>Session Data:</h3>");
      out.println("New Session: " + session.isNew());
      out.println("<br>Session ID: " + session.getId());
      out.println("<br>Creation Time: " + new Date(session.getCreationTime()));
      out.println("<br>Last Accessed Time: " + 
                   new Date(session.getLastAccessedTime()));
      out.println("<BR>Number of Accesses: " + session.getAttribute("counter"));
      
   }
}