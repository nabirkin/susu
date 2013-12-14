package su.nabirkin.curs.example.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Street {
	StreetType type;
	String name;
	
	public Street() {
		super();
	}
	public Street(StreetType type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public StreetType getType() {
		return type;
	}
	public void setType(StreetType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
