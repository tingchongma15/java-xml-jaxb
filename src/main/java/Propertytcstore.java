

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Propertytcstore {
	@XmlElementWrapper(name = "propertytcList") 
	@XmlElement(name = "propertytc")
	private ArrayList<Propertytc> propertytcList;

	public void setPropertytcList(ArrayList<Propertytc> propertytcList) {
		this.propertytcList = propertytcList;
	}

	public ArrayList<Propertytc> getPropertytcsList() {
		return propertytcList;
	}

	public void addPropertytc(Propertytc propertytc) {
		try {
			if (propertytcList == null) {
				propertytcList = new ArrayList<Propertytc>();
			}
			propertytcList.add(propertytc);

		} catch (Exception e) {
		}
	}
}