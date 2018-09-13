import java.util.Scanner;

public class LeftAndRightSum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int sum = 0;
    int leftSum = 0;

    for (int i = 0; i < 2 * n; i++) {
      int currentNum = scanner.nextInt();
      sum += currentNum;

      if (i == n - 1) {
        leftSum = sum;
      }
    }

    if (sum - leftSum == leftSum) {
      System.out.printf("Yes, sum = %d", leftSum);
    } else {
      int diff = Math.abs((sum - leftSum) - leftSum);
      System.out.printf("No, diff = %d", diff);
    }
  }
}
