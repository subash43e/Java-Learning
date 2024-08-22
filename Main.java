import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter the userName: ");
    Scanner myObj = new Scanner(System.in);

    String username = myObj.nextLine();
    System.out.println(" Username is :" + username);
  }
}