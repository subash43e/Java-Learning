public class Main {
    public static void main(String[] args) {
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();

        for (char letter : myArray) {
            System.out.println(letter);
        }
    }
}