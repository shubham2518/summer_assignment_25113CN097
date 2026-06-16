import java.util.Scanner;

public class Function_for_Fibonacci {
  
  static void fibonacci(int n) {
      int a = 0, b = 1;
      System.out.print("Fibonacci series up to " + n + " terms: ");
      for (int i = 1; i <= n; i++) {
          System.out.print(a + " ");
          int c = a + b;
          a = b;
          b = c;
      }
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number of terms for Fibonacci series: ");
      int numTerms = input.nextInt();

      fibonacci(numTerms);
  }
}