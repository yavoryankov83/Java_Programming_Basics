import java.util.Scanner;

public class GreetingByGenderAndAge {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double age = Double.parseDouble(scanner.nextLine());
    String gender = scanner.nextLine();

    String temp = "";

    if ("m".equals(gender)) {
      if (age >= 16) {
        temp = "Mr.";
      } else {
        temp = "Master";
      }
    } else {
      if (age >= 16) {
        temp = "Ms.";
      } else {
        temp = "Miss";
      }
    }
    System.out.println(temp);
  }
}
