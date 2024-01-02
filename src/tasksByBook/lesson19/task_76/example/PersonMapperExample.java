package tasksByBook.lesson19.task_76.example;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PersonMapperExample {

    public static final String PATH_TO_MAPPING = "src\\tasksByBook\\lesson19\\task_76\\example\\person.txt";
    public static final String PATH_TO_WRITING = "src\\tasksByBook\\lesson19\\task_76\\example\\personOut.txt";

    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get(PATH_TO_MAPPING));
        ObjectMapper objectMapper = new ObjectMapper();
        //Person person = objectMapper.readValue(jsonData, Person.class);
        JsonParser jsonParser = objectMapper.createParser(jsonData);
        MappingIterator<Person> personMappingIterator = objectMapper.readValues(jsonParser, Person.class);

        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter stringAllPerson = new StringWriter();

        int count = 1;
        while (personMappingIterator.hasNext()) {
            Person person = personMappingIterator.next();
            System.out.println("Person Object " + person);
            StringWriter writer = new StringWriter();
            objectMapper.writeValue(writer, person);

            System.out.println(count++ + ") Person JSON is:\n" + writer);
            stringAllPerson.append(writer.toString());
        }


        FileWriter fileWriter = new FileWriter(PATH_TO_WRITING, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(stringAllPerson.toString());
        bw.flush();
        bw.close();
    }
}
