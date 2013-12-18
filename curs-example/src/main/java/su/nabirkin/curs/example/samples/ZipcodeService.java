package su.nabirkin.curs.example.samples;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import su.nabirkin.curs.example.dao.ZipAddressDAO;
import su.nabirkin.curs.example.entity.ZipAddress;

@Path("zip")
public class ZipcodeService {

	private final ZipAddressDAO zipAddressDAO = new ZipAddressDAO();

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ZipAddress[] list() {
		return zipAddressDAO.list().toArray(new ZipAddress[0]);
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public ZipAddress get(@PathParam("id") Integer id)
			throws Exception {
		ZipAddress e = zipAddressDAO.retrieveZipAddress(id);
		if (e != null) {
			return e;
		} else {
			throw new WebApplicationException(404);
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ZipAddress post(ZipAddress zipAddress) throws Exception {
		return zipAddressDAO.createZipAddress(zipAddress);
	}
}
