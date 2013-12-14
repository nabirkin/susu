package su.nabirkin.curs.example.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ZipAddress {
	String zipCode;
	Address address;
	
	private ZipAddress() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ZipAddress(String zipCode, Address address) {
		super();
		this.zipCode = zipCode;
		this.address = address;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}



	
}
