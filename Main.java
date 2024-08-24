import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> myarray = new ArrayList<String>();
    myarray.add("demo");
    myarray.add("sdk");
    myarray.add("funz");
    for (int i = 0; i < myarray.size(); i++) {
      System.out.println(myarray.get(i));
    }
  }
}