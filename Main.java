import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myArray = new ArrayList<Integer>();
  myArray.add(4);
  myArray.add(5);
  myArray.add(3);
  myArray.add(2);
    Collections.sort(myArray);

    for (int d : myArray) {
      System.out.println(d);
    }
  }
}