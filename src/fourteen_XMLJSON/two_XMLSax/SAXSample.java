package fourteen_XMLJSON.two_XMLSax;

import fourteen_XMLJSON.two_XMLSax.MyHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXSample {

	static final String XML_URL = "http://rss.sina.com.cn/tech/internet/home28.xml";

	public static void main(String[] args) throws Exception {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser saxParser = spf.newSAXParser();
		saxParser.parse(XML_URL, new MyHandler());
	}
}
