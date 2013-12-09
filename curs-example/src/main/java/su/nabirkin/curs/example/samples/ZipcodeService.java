package su.nabirkin.curs.example.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("zip")
public class ZipcodeService {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public ZipAddress[] list() {
		return new ZipAddress[] {
				new ZipAddress("454000", "chelyabinsk"), 
				new ZipAddress("111000", "Unknown")};
	}
}
