import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("volvo");
    cars.add("BMW");
    cars.add("Ford");

    // Remove the specific index element with remove(); method.
    cars.remove(1);

    System.out.println(cars);
  }
}