package tasksByBook.lesson19;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Task_74byBook {

    public static final String UNITS = "mm";
    public static final String PATH_TO_XML_FILE = "src\\tasksByBook\\lesson19\\pointList.xml";
    public static final String POINT = "point";
    public static final String X = "x";
    public static final String Y = "y";
    public static final String DELIMITER_BETWEEN_COORDINATES = ", ";
    public static final String DELIMITER_BETWEEN_POINTS = "\n";


    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            doc = builder.parse(new File(PATH_TO_XML_FILE));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NodeList points = doc.getElementsByTagName(POINT);

        for (int i = 0; i < points.getLength(); i++) {
            Node node = points.item(i);
            NodeList list = node.getChildNodes();

            String x = null;
            String y = null;
            for (int j = 0; j < list.getLength(); j++) {

                if (list.item(j) instanceof Element) {
                    if (list.item(j).getNodeName().equals(X)) {
                        x = list.item(j).getFirstChild().getNodeValue();
                    } else if (list.item(j).getNodeName().equals(Y)) {
                        y = list.item(j).getFirstChild().getNodeValue();
                    }
                }
            }
            System.out.print(x + UNITS + DELIMITER_BETWEEN_COORDINATES + y + UNITS + DELIMITER_BETWEEN_POINTS);
        }
    }
}
