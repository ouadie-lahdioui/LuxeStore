package technoway.formation.listeners;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "HttpSessionBindingServlet", urlPatterns = {"/HttpSessionBindingServlet"})
public class HttpSessionBindingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("stringvalue1", "hello");
        session.setAttribute("stringvalue2", "world");
        session.setAttribute("objvalue1", new ActiveUser());
    }

}