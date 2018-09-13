import java.util.Scanner;

public class FromInchToSantimeter {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double inch = Double.parseDouble(scanner.nextLine());
    double santimeter = inch * 2.54;

    System.out.printf("%.2f%n", santimeter);
  }
}
