import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Iterator<String> my = cars.iterator();

    while (my.hasNext()) {
      System.out.println(my.next());
    }
    System.out.println(my.next());
  }
}