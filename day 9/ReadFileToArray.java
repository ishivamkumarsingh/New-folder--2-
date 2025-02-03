import java.io.*;
import java.util.*;


public class ReadFileToArray {
    public static void main(String[] args) {
        String filePath = "E:/New folder (2)/day 9/readme.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }

        String[] linesArray = lines.toArray(new String[0]);

        for (String content : linesArray) {
            System.out.println(content);
        }
    }
}