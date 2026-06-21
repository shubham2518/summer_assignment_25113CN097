import java.util.Scanner;

public class Recursive_Reverse {

  static int rev = 0; 

  static void reverse(int n) {
  
    if (n == 0)
      return;
    else{
      rev = rev * 10 + (n % 10);
      reverse(n / 10);
    }  
  }
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = input.nextInt();
    
    reverse(n);

    System.out.print("Reversed number = " +rev);
  }
}