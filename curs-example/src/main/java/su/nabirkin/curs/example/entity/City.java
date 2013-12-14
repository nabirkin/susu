package su.nabirkin.curs.example.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {
	private static final long MEGAPOLICE_SETTLERS_COUNT = 10000000L;
	
	Region region;
	String name;
	long settlersCount;
	
	
	
	public City() {
		super();
	}
	
	public City(Region region, String name, long settlersCount) {
		super();
		this.region = region;
		this.name = name;
		this.settlersCount = settlersCount;
	}
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSettlersCount() {
		return settlersCount;
	}
	public void setSettlersCount(long settlersCount) {
		this.settlersCount = settlersCount;
	} 
	
	public boolean isMegapolice() {
		return settlersCount > MEGAPOLICE_SETTLERS_COUNT;
	}
	
}
