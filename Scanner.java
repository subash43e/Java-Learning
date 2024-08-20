import java.util.Scanner;

class Myscanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Tought");

        String userIdea = myObj.nextLine();
        System.out.println("userIdea is: " + userIdea);
    }
}
