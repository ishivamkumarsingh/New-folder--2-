import java.util.*;

public class Word_count {
    public static void main(String[] args) {
        String s = "hello world efw hh5 wgui g4og4o g4og";
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(count+1);
    } 
   
}
