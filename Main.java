import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myArray = new LinkedList<String>();
        myArray.add("demo");
        myArray.add("run");
        myArray.add("quit");
        myArray.add("both");

        Collections.sort(myArray);

        System.out.println(myArray);
    }
}