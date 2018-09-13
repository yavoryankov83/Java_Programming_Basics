import java.util.Scanner;

public class AreaOfSquare {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double side = Double.parseDouble(scanner.nextLine());

    double area = side * side;

    System.out.printf("%.0f%n", area);
  }
}
