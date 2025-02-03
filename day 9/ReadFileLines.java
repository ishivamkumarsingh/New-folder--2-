import java.io.*;

public class ReadFileLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("E:/New folder (2)/day 9/readme.txt"))) {
            for (int i = 0; i < 3; i++) {
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}
