import java.util.Scanner;

public class Function_check_prime {
  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i < n; i++) {
      if (n % i == 0) 
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = input.nextInt();

    if (isPrime(num)) {
      System.out.println("Prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }
}