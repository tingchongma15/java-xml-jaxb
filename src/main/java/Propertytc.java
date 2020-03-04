

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "propertytc")
public class Propertytc {

	private String name;
	private String value;

	@XmlAttribute
	public String getName() {
		return name;
	}

	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}
}