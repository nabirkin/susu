package su.nabirkin.curs.example.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
	City city;
	Street street;
	String house;
	
	
	public Address() {
		super();
	}

	
	public Address(City city, Street street, String house) {
		super();
		this.city = city;
		this.street = street;
		this.house = house;
	}
	
	
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	
}
