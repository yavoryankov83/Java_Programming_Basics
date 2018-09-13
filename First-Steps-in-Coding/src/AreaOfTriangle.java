import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());

        double area = sideA * sideB;

        System.out.printf("%.0f%n", area);
    }
}
