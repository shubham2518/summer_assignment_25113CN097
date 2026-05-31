import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer : ");

    int n = input.nextInt();

    int i, fact = 1;

    for(i=1; i<=n; i++){
      fact = fact * i;
    }
    System.out.print("Factorial of " + n + " = " + fact);

  }
}
