import java.util.Scanner;

public class WholeNums {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    int maxNum = Integer.MIN_VALUE;
    int minNum = Integer.MAX_VALUE;

    while (!("END".equals(input = scanner.nextLine()))) {

      int num = Integer.parseInt(input);

      if (num > maxNum) {
        maxNum = num;
      }
      if (num < minNum) {
        minNum = num;
      }
    }

    System.out.printf("Max number: %d%n", maxNum);
    System.out.printf("Mix number: %d%n", minNum);
  }
}
