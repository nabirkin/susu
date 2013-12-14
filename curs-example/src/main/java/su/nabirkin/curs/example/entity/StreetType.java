package su.nabirkin.curs.example.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum StreetType {
	
	ULICA("улица"),
	PROSPECT("проспект"),
	
	;
	
	public final String shortName;
	
	StreetType(String shortName) {
		this.shortName = shortName;
	}
}
