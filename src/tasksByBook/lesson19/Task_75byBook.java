package tasksByBook.lesson19;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task_75byBook {

    public static final String UNITS = "mm";
    public static final String PATH_TO_XML_FILE = "src\\tasksByBook\\lesson19\\pointList.xml";
    public static final String POINT_LIST = "pointList";
    public static final String POINT = "point";
    public static final String X = "x";
    public static final String Y = "y";
    public static final String DELIMITER_BETWEEN_COORDINATES = ", ";
    public static final String DELIMITER_BETWEEN_POINTS = "\n";
    public static final String BEFORE_FIRST_POINT = "";

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        StringBuilder stringBuilder = new StringBuilder();

        boolean isFirstPoint = false;
        boolean isPoint = false;
        boolean isCoordinate = false;
        boolean isPreviosCoordinate = false;

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(
                new FileInputStream(PATH_TO_XML_FILE));

        while (reader.hasNext()) {

            int result = reader.next();

            if (result == reader.START_ELEMENT) {

                if (reader.getLocalName().equals(POINT_LIST)) {
                    isFirstPoint = true;
                } else if (reader.getLocalName().equals(POINT)) {
                    isPoint = true;
                } else if (reader.getLocalName().equals(X) || reader.getLocalName().equals(Y)) {
                    isCoordinate = true;
                }

            } else if (result == reader.CHARACTERS) {

                if (isPoint) {
                    if (isFirstPoint) {
                        stringBuilder.append(BEFORE_FIRST_POINT);
                        isFirstPoint = false;
                    } else {
                        stringBuilder.append(DELIMITER_BETWEEN_POINTS);
                    }
                    isPoint = false;
                    isPreviosCoordinate = false;
                }
                if (isCoordinate) {
                    if (isPreviosCoordinate) {
                        stringBuilder.append(DELIMITER_BETWEEN_COORDINATES);
                    }
                    stringBuilder.append(reader.getText() + UNITS);
                    isCoordinate = false;
                    isPreviosCoordinate = true;
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
