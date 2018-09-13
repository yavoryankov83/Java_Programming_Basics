import java.util.Scanner;

public class BiggestNum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int maxNum = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int num = scanner.nextInt();
      if (num > maxNum) {
        maxNum = num;
      }
    }

    System.out.println(maxNum);
  }
}
