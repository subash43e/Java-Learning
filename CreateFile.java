import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class CreateFile {
  public static void main(String[] args) {
 
    // Writing file
    try {
      FileWriter myWriter = new FileWriter("filetexts.txt");
      myWriter.write("I love to write doc on java");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
}