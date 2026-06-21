import java.util.Scanner;

public class Recursive_Factorial {

  static int factorial(int n){

    if(n == 0 || n == 1)
      return 1;
    else
      return n * factorial(n - 1);
  }
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = input.nextInt();

    System.out.print("Factorial = " +factorial(n));
  }  
}
