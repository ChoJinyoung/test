package test;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class test2 {

	public static void main(String[] args) {

		try {

			new test2().start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void start() throws Exception {
		URL url = new URL(
				"http://openapi.tago.go.kr/openapi/service/TrainInfoService/getCtyAcctoTrainSttnList?ServiceKey=rf8h5nHqKpp9A%2Babq%2FQxu9vBC4N9S82ZPguUarHzZevdW2BEl7fks1Vx2DQHWVaEZ1nfgZfQKwucluBjFwo7qw%3D%3D");
		URLConnection connection = url.openConnection();

		Document doc = parseXML(connection.getInputStream());
		NodeList descNodes = doc.getElementsByTagName("items");

		for (int i = 0; i < descNodes.getLength(); i++) {

			for (Node node = descNodes.item(i).getFirstChild(); node != null; 
					node=node.getNextSibling()) { // 첫번째 자식을 시작으로 마지막까지 다음 형제를 실행
				if (node.getNodeName().equals("nodeid")) {
					System.out.println(node.getTextContent());
				} else if (node.getNodeName().equals("nodename")) {
					System.out.println(node.getTextContent());
				}
			}

		}
	}

	private Document parseXML(InputStream stream) throws Exception {

		DocumentBuilderFactory objDocumentBuilderFactory = null;
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;

		try {
			
			objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

			doc = objDocumentBuilder.parse(stream);

		} catch (Exception ex) {
			throw ex;
		}

		return doc;
	}
}
