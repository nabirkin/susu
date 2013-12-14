package su.nabirkin.curs.example.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import su.nabirkin.curs.example.entity.Address;
import su.nabirkin.curs.example.entity.City;
import su.nabirkin.curs.example.entity.Region;
import su.nabirkin.curs.example.entity.Street;
import su.nabirkin.curs.example.entity.StreetType;
import su.nabirkin.curs.example.entity.ZipAddress;

@Path("zip")
public class ZipcodeService {
	
	private static Region region = new Region(74, "Челябинская область");
	private static City chelCity = new City(region , "Челябинск", 1500000L);
	private static City kopCity = new City(region , "Копейск", 123000L);
	private static Street leninStreet = new Street(StreetType.PROSPECT, "Ленина");
	private static Street stalinStreet = new Street(StreetType.ULICA, "Сталина");
	
	private final static Address chelAdr = new Address(chelCity , leninStreet , "20а");
	private final static Address kopAdr = new Address(kopCity , stalinStreet  , "65");
	
	private static ZipAddress zip1 = new ZipAddress("454000", chelAdr);
	private static ZipAddress zip2 = new ZipAddress("450100", kopAdr);
	
	private static ZipAddress[] list = new ZipAddress[] {zip1, zip2};
	
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public ZipAddress[] list() {
		return list;
	}
}
