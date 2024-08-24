import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("volvo");
    cars.add("BMW");
    cars.add("Ford");

    // access the array element with index.

    System.out.println(cars.get(2));
  }
}