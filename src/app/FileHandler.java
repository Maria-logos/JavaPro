package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileName, String fileContent) {
        try  {
            FileWriter fw = new FileWriter(BASE_PATH + fileName + ".txt");
            fw.write(fileContent);
            fw.close();
            return "Success.";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;
            StringBuilder str = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                str.append((char) sym);
            }
            return str.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
