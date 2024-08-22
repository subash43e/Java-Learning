enum level {
  HIGH,
  MEDIUM,
  NORMAL
}

public class Main {
  public static void main(String[] args) {
    level myvar = level.HIGH;

    switch (myvar) {
      case HIGH:
        System.out.println("High level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case NORMAL:
        System.out.println("Low level");
        break;

      default:
        break;
    }
  }
}
