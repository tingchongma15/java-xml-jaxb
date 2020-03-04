

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ws")
public class Ws {
	private Propertytcstore propertytcstore;

	public Propertytcstore getPropertytcstore() {
		return propertytcstore;
	}

	public void setPropertytcstore(Propertytcstore propertytcstore) {
		this.propertytcstore = propertytcstore;
	}
}