package su.nabirkin.curs.example.samples;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ZipAddress {
	String zipCode;
	String address;
	
	private ZipAddress() {
		// TODO Auto-generated constructor stub
	}

	
	
	public ZipAddress(String zipCode, String address) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
