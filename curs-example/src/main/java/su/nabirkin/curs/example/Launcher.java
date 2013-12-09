package su.nabirkin.curs.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import su.nabirkin.curs.example.samples.HelloWorldServlet;
import su.nabirkin.curs.example.samples.JettyService;
import su.nabirkin.curs.example.samples.ZipcodeService;

import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

public class Launcher {
	
	static final ServletContainer jettyService = new ServletContainer(new DefaultResourceConfig(
			JettyService.class));

	static final ServletContainer zipcodeService = new ServletContainer(new DefaultResourceConfig(
			ZipcodeService.class));

	public static void main(String[] args) throws Exception {
		
		
		ServletContextHandler helloApp = new ServletContextHandler();
		helloApp.setContextPath("/curs_example");
		helloApp.addServlet(new ServletHolder(jettyService), "/*");
		helloApp.addServlet(new ServletHolder(new HelloWorldServlet()), "/hello");

		ServletContextHandler zipcodeApp = new ServletContextHandler();
		zipcodeApp.setContextPath("/zipcode");
		zipcodeApp.addServlet(new ServletHolder(zipcodeService), "/*");


		
		HandlerCollection handler = new HandlerCollection();
		handler.addHandler(helloApp);
		handler.addHandler(zipcodeApp);
		
		Server server = new Server(8080);
		server.setHandler(handler);
		server.start();
	}
}
