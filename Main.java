
public class Main {
    public static void main(String[] args) {
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        float avg, sum = 0;

        int length = ages.length;

        int lowestAge = ages[0];

        for (int age : ages) {
            // The condition checking the lowestage greater than current age.
            if (lowestAge > age) {

                // Assigning the lowest age in lowestAge.
                lowestAge = age;
            }
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);
    }
}