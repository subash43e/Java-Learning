import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> myArray = new ArrayList<String>();
    myArray.add("z");
    myArray.add("a");
    myArray.add("g");

    Collections.sort(myArray);

    for (String d : myArray) {
      System.out.println(d);
    }
  }
}