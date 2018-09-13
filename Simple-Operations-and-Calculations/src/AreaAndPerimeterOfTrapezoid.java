import java.util.Scanner;

public class AreaAndPerimeterOfTrapezoid {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double sideA = Double.parseDouble(scanner.nextLine());
    double sideB = Double.parseDouble(scanner.nextLine());
    double height = Double.parseDouble(scanner.nextLine());

    double area = (sideA + sideB) * height / 2;

    System.out.println(area);
  }
}
