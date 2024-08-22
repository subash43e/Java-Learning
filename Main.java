import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateTime = LocalDateTime.now();
    System.out.println(myDateTime);
    DateTimeFormatter myCorrectDateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
    String formatedDate = myDateTime.format(myCorrectDateFormat);

    System.out.println(formatedDate);
  }
}