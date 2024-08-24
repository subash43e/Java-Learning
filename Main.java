import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myarray = new ArrayList<Integer>();
    myarray.add(89);
    myarray.add(32);
    myarray.add(323232);

    for (Integer word : myarray) {
      System.out.println(word);
    }
  }
}