import java.util.Scanner;

public class LetterCombination {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char startLetter = scanner.nextLine().charAt(0);
    char stopLetter = scanner.nextLine().charAt(0);
    char letterToSkip = scanner.nextLine().charAt(0);

    int count = 0;

    for (char firstLetter = startLetter; firstLetter <= stopLetter; firstLetter++) {
      for (char secondLetter = startLetter; secondLetter <= stopLetter; secondLetter++) {
        for (char thirdLetter = startLetter; thirdLetter <= stopLetter; thirdLetter++) {
          String combination = String.format("%c%c%c", firstLetter, secondLetter, thirdLetter);

          if (!(combination.contains(String.valueOf(letterToSkip)))) {
            count++;
            System.out.printf("%c%c%c ", firstLetter, secondLetter, thirdLetter);
          }
        }
      }
    }
    System.out.println(count);
  }
}
