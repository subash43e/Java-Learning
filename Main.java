import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi" };
        //Array is class Name.
        Arrays.sort(cars);
        for(String car : cars){
            System.out.println(car);
        }
    }
}