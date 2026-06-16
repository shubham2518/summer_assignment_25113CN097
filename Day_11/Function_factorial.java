import java.util.Scanner;

public class Function_factorial {

  static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
    
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = input.nextInt();

    int result = factorial(num);
    System.out.println("Factorial = " + result);
  }
}