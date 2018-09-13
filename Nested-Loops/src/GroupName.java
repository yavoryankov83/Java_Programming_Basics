import java.util.Scanner;

public class GroupName {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char capsLetter = scanner.nextLine().charAt(0);
    char smallLetter1 = scanner.nextLine().charAt(0);
    char smallLetter2 = scanner.nextLine().charAt(0);
    char smallLetter3 = scanner.nextLine().charAt(0);
    int digit = Integer.parseInt(scanner.nextLine());

    int count = -1;

    for (char firstCaps = 'A'; firstCaps <= capsLetter; firstCaps++) {
      for (char firstSmall = 'a'; firstSmall <= smallLetter1; firstSmall++) {
        for (char secondSmall = 'a'; secondSmall <= smallLetter2; secondSmall++) {
          for (char thirdSmall = 'a'; thirdSmall <= smallLetter3; thirdSmall++) {
            for (int digit1 = 0; digit1 <= digit; digit1++) {
              count++;
            }
          }
        }
      }
    }
    System.out.println(count);
  }
}
