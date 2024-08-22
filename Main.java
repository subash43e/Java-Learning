enum level {
  HIGH,
  MEDIUM,
  NORMAL
}

public class Main {
  public static void main(String[] args) {
    for (level myVar1 : level.values()) {
      System.out.println(myVar1);
    }
  }
}
