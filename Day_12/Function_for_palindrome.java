import java.util.Scanner;

public class Function_for_palindrome {

  static boolean isPalindrome(int n) {
    int temp = n;
    int rev = 0;

    while (temp > 0) {
      int lastDigit = temp % 10;
      rev = rev * 10 + lastDigit;
      temp = temp / 10;
    }
    return n == rev;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = input.nextInt();

    if (isPalindrome(num)) {
      System.out.println("Palindrome number");
    } else {
      System.out.println("Not a palindrome number");
    }
  }
}