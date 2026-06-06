import java.util.Scanner;
public class Binary_to_Decimal {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Decimal Number : ");

    int n = input.nextInt();

    int decimal = 0;
    int power = 1;

    System.out.print("BINARY NUMBER IS ");

    while(n > 0){
      int r = n % 2;
      decimal = decimal + (r * power);
      power = power * 2;
      n = n / 10;
    }
    System.out.print(decimal);
  }
  
}
