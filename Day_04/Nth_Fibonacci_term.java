import java.util.Scanner;
public class Nth_Fibonacci_term {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the term number : ");

    int n = input.nextInt();

    int a=0, b=1, c=0;  // c=0 because java requires local variables to be initialized before use

    if(n==1)
      System.out.print("Fibonacci term : " +a);
    else if(n==2)
      System.out.print("Fibonacci term : " +b);
    else{
      for(int i=2; i<n; i++) {
        c = a + b;
        a = b;
        b = c;
      }
      System.out.print("Fibonacci term : " +c);
    }
  }
}