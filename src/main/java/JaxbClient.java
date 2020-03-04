

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbClient {
	public Object unmarshaller(File file) {
		System.out.println("JaxbClient unmarshaller");
		Object outputObject = new Object();
		try {
			JAXBContext jc = JAXBContext.newInstance(Ws.class, Propertytcstore.class, Propertytc.class);
			Unmarshaller u = jc.createUnmarshaller();
			outputObject = u.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return outputObject;
	}
}