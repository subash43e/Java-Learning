import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("volvo");
    cars.add("BMW");
    cars.add("Ford");

    //Remove the all element in the array list.
    cars.clear();

    System.out.println(cars);
  }
}