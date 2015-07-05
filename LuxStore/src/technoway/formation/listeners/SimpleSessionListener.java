package technoway.formation.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SimpleSessionListener implements HttpSessionListener
{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("[" + getClass().getName() + "] " + arg0);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		HttpSession session = arg0.getSession();
        long start = session.getCreationTime();
        long end = session.getLastAccessedTime();
        String counter = (String)session.getAttribute("counter");
        System.out.println("DESTROY, Session Duration:" + (end - start) + "(ms) Counter:" + counter +  arg0);		
	}


}
