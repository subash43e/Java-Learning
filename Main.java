
public class Main {
    public static void main(String[] args) {
        int ages[] = { 23, 34, 53, 12, 33 };

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);
    }
}