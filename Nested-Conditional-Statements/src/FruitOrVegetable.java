import java.util.Scanner;

public class FruitOrVegetable {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    //banana, apple, kiwi, cherry, lemon и grapes
    boolean isFruit = "banana".equals(input) || "apple".equals(input) || "kiwi".equals(input) || "cherry".equals(input)
      || "lemon".equals(input) || "grapes".equals(input);

    //tomato, cucumber, pepper и carrot
    boolean isVegetable = "tomato".equals(input) || "cucumber".equals(input) || "pepper".equals(input)
      || "carrot".equals(input);

    if (isFruit) {
      System.out.println("fruit");
    } else if (isVegetable) {
      System.out.println("vegetable");
    } else {
      System.out.println("unknown");
    }
  }
}
