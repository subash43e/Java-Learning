public class Main {
  static void output1() {
    System.out.println("Output - 1");
  }

  public void output2() {
    System.out.println("Output - 2");
  }

  public static void main(String[] args) {
    output1();
    Main op2 = new Main();
    op2.output2();
  }
}