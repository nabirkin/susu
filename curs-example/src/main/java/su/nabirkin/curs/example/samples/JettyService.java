package su.nabirkin.curs.example.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("jetty")
public class JettyService {
	
	@GET
	public String sayHello() {
		return "Hello Jetty";
	}
}
