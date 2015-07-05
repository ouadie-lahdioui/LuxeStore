package technoway.formation.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class ActiveUser implements HttpSessionBindingListener {

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("ActiveUser Object is added to session: Key is :" + arg0.getName());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("ActiveUser Object is removed from session: Key is :" + arg0.getName());		
	}

}
