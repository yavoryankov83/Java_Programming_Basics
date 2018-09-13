import java.util.Scanner;

public class Graduate {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
    int years = 12;
    double sumOfGrades = 0;

    while (years > 0) {
      double grade = Double.parseDouble(scanner.nextLine());

      if (grade >= 4) {
        sumOfGrades += grade;
        years--;
      }
    }

    System.out.printf("%.2f%n", sumOfGrades / 12);
  }
}
