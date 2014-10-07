package me.CaptainElliott.Schema;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Validator {
	
	public static void main(String[] args) {
		
		gui gui = new gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(450,250);
		gui.setVisible(true);
		
	
		
	}
	

	public static void validate(String xmlFile, String xsdFile) throws SAXException, IOException {
		SchemaFactory schemafactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		((schemafactory.newSchema(new File(xsdFile))).newValidator()).validate(new StreamSource(new File(xmlFile)));
	}

}