import java.math.BigDecimal;
import java.util.Scanner;

public class NullInput {
  public static void main(String[] args) {
    BigDecimal num = new BigDecimal("34.4556");
    BigDecimal sum = num.add(new BigDecimal("34.33"));

    System.out.println(sum);

    Integer num1 = null;

    System.out.println(num1);

    Scanner scanner = new Scanner(System.in);

    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();

    System.out.printf("%d-----%d", firstNum, secondNum);

    String word1 = scanner.next("\\w+");
    String word2 = scanner.next("\\w+");

    System.out.println(word1 + " " + word2);
  }
}
