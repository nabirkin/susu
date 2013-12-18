package su.nabirkin.curs.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class ZipAddress {
	@Id  
    @GeneratedValue
    public Integer id; 
	
	String zipCode;
	@OneToMany(cascade = CascadeType.ALL)
	List<Address> addresses = new ArrayList<Address>();
	
	public ZipAddress() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ZipAddress(String zipCode) {
		super();
		this.zipCode = zipCode;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	



	
}
