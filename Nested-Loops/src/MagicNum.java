import java.util.Scanner;

public class MagicNum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());

    for (int a = 1; a <= 9; a++) {
      for (int b = 0; b <= 9; b++) {
        for (int c = 0; c <= 9; c++) {
          for (int d = 0; d <= 9; d++) {
            for (int e = 0; e <= 9; e++) {
              for (int j = 0; j <= 9; j++) {
                if (a * b * c * d * e * j == n) {
                  System.out.printf("%d%d%d%d%d%d ", a, b, c, d, e, j);
                }
              }
            }
          }
        }
      }
    }
  }
}
