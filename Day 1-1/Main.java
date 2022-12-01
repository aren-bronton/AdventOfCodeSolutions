import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

class Main {
  public static void main(String[] args) throws IOException {
    Path PATH = FileSystems.getDefault().getPath("input.txt");
    try {
      BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
      long lines = Files.lines(PATH).parallel().count();
      String line = "";
      int largest = Integer.MIN_VALUE;
      int total = 0;

      for(int i = 0; i < lines; i++) {
        line = reader.readLine();
        if(line != null && line.length() > 0) {
          total = 0;
          while(line != null && line.length() > 0) {
            total += Integer.parseInt(line);
            line = reader.readLine();
          }
        }
        if(total > largest) {
          largest = total;
        }
      }

      System.out.println(largest);
    } catch(Exception e) {
      e.printStackTrace();
    }

    
  }
}