import java.util.Scanner;

public class BonusPoints {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int num = Integer.parseInt(scanner.nextLine());
    double bomusPoint = 0;

    if (num <= 100) {
      bomusPoint = 5;
    } else if (num > 100 && num <= 1000) {
      bomusPoint = num * 0.2;
    } else if (num > 1000) {
      bomusPoint = num * 0.1;
    }

    if (num % 2 == 0) {
      bomusPoint += 1;
    } else if (num % 10 == 5) {
      bomusPoint += 2;
    }

    double allPoints = bomusPoint + num;

    System.out.println(bomusPoint);
    System.out.println(allPoints);
  }
}
