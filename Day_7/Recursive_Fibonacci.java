import java.util.Scanner;

public class Recursive_Fibonacci {

  static int fib(int n) {

    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else
      return fib(n - 1) + fib(n - 2);
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = input.nextInt();
    
    System.out.print("Fibonacci series = ");
    for(int i = 0; i < n; i++)
    System.out.print(fib(i) + " ");
  }  
  
}
