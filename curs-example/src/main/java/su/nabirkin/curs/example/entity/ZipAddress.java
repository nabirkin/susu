package su.nabirkin.curs.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class ZipAddress {
	@Id  
    @GeneratedValue
    public Integer id; 
	
	String zipCode;
	@Transient Address address;
	
	public ZipAddress() {
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
