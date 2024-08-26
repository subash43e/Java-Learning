public class Main {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 5, 6, 2, 8, 3 };
        int sum = 0;
        int i;
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("The sum is " + sum);
    }
}