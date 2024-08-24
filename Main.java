import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("volvo");
    cars.add("BMW");
    cars.add("Ford");

//Modifiy the specific index element with set(); method.
cars.set(1,"bmw");

    System.out.println(cars);
  }
}