package technoway.formation.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter( urlPatterns = "/log/*", 
	initParams = {
		    @WebInitParam(name = "level", value = "DEBUG", description = "niveau de journalisation"),
		    @WebInitParam(name = "encoding", value = "UTF-8", description = "Encodage")
    }  
)
public class LogFilter implements Filter {

	private FilterConfig filterConfig = null;
	
	public void init(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;
	}

	public void destroy() {
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		
		System.out.println("Le niveau de journalisation est : " + filterConfig.getInitParameter("level"));
		filterChain.doFilter(request, response);
	}

}
