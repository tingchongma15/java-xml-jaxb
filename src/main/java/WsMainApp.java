

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

/**
 * This example shows how to map nested java object in jaxb 2.0
 * 
 * @author 
 *
 */
public class WsMainApp {
	private static final String SEPARATOR = File.separator;
	private static final String PATH_PROPERTYSTORE = getPathToXmlResource().concat("ws.xml");
	private static JaxbClient jaxbClient = new JaxbClient();
	private static File file1 = new File(PATH_PROPERTYSTORE);

	public static void testUnmarshaller() {
		Object object = jaxbClient.unmarshaller(file1);
		if (object instanceof Ws) {
			Ws ws = (Ws)object;
			Propertytcstore propertytcstore = ws.getPropertytcstore();
			ArrayList<Propertytc> propertytcList = propertytcstore.getPropertytcsList();
			for (Propertytc propertytc : propertytcList) {
				/*
				System.out.println("propertytc " 
						+ propertytc.getName()
						+ " Name " + propertytc.getName()
						+ " Value " + propertytc.getValue()
						);
						*/
			}
		}
		else
			if (object instanceof Propertytc) {
				Propertytc propertytc = (Propertytc)object;
				/*
				System.out.println("propertytc "
						+ propertytc.getName()
						+ " Value " + propertytc.getValue()
						);
						*/
			}
	}
		
	public static void main(String[] args) throws JAXBException, IOException {
		testUnmarshaller();
	}
	
	private static String getPathToXmlResource() {
		return new StringBuilder().append("src").append(SEPARATOR)
				.append("main").append(SEPARATOR).append("resources")
				.append(SEPARATOR).toString();
	}
}