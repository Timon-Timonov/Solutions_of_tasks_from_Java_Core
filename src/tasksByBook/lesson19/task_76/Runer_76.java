package tasksByBook.lesson19.task_76;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;

public class Runer_76 {
    public static final String PATH_TO_MAPPING = "src\\tasksByBook\\lesson19\\task_76\\tester.txt";
    public static final String PATH_FOR_WRITING = "src\\tasksByBook\\lesson19\\task_76\\testerOut.txt";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Tester tester = mapper.readValue(new File(PATH_TO_MAPPING), Tester.class);
        StringWriter writer = new StringWriter();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.writeValue(writer, tester);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_FOR_WRITING, true))) {
            bw.write(writer.toString());
        }
        System.out.println("Tester from JSON:\n" + writer);
    }
}
