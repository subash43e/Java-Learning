import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateFile {
  public static void main(String[] args) {

    try {
      File myObj = new File("filetext.txt");
      Scanner myRead = new Scanner(myObj);
      while (myRead.hasNextLine()) {
        String data = myRead.nextLine();
        System.out.println(data);
      }
      myRead.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
}