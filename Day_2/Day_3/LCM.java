import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");

    int a = input.nextInt();
    int b = input.nextInt();

    int x = a;
    int y = b;

    while(y!=0){
      int temp = y;
      y = x % y;
      x = temp;
    }
    int gcd = x;

    int lcm = (a*b)/gcd;

    System.out.print("LCM of given numbers = " +lcm);
  }
}