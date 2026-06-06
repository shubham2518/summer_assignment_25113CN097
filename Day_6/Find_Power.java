import java.util.Scanner;

public class Find_Power {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the base : ");
    int x  = input.nextInt();

    System.out.print("Enter the exponent : ");
    int n = input.nextInt();

    int power = 1;

    for(int i = 1; i <= n; i++){
      power = power * x;
    }
    System.out.print("The power of given number = " +power);
  }
}
