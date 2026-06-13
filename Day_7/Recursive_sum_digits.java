import java.util.Scanner;

public class Recursive_sum_digits {

  static int sumDigits(int n) {

    if(n == 0)
      return 0;

    else
      return (n % 10) + sumDigits(n / 10);
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = input.nextInt();

    System.out.print("Sum of digits = " +sumDigits(n));
  }
}