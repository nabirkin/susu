package su.nabirkin.curs.example.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Region {
	int code;
	String name;
	
	public Region() {
		super();
	}
	public Region(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
