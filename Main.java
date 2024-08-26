public class Main {
    public static void main(String[] args) {
        // How to find Average of the Average of Array Elements

        int[] tokens = { 2, 3, 11, 6, 7, 8, 9 };
        float avg, sum = 0;

        int length = tokens.length;

        for (int token : tokens) {
            sum += token;
        }
        ;

        avg = sum / length;

        System.out.println("Total average token number :" + avg);
    }
}