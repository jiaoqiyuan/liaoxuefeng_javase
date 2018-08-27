package fourteen_XMLJSON.two_XMLSax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

	void print(Object... objs) {
		for (Object obj : objs) {
			System.out.print(obj);
			System.out.print(" ");
		}
		System.out.println();
	}

	@Override
	public void startDocument() throws SAXException {
		print("start document");
	}

	@Override
	public void endDocument() throws SAXException {
		print("end document");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		print("start element:", localName, qName);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		print("end element:", localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		print("characters:", new String(ch, start, length));
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		print("error:", e);
	}

}
