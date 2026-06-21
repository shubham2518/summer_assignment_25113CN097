import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter two numbers : ");

    int a = input.nextInt();
    int b = input.nextInt();

    while(b!=0){
      int temp = b;
      b = a % b;
      a = temp;
    }

    System.out.print("GCD of given numbers = " +a);

  }
  
}
