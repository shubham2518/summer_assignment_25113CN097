import java.util.Scanner;
public class Decimal_to_Binary {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Decimal Number : ");

    int n = input.nextInt();

    int binary = 0;
    int place = 1;

    System.out.print("BINARY NUMBER IS ");

    while(n > 0){
      int rem = n % 2;
      binary = binary + (rem * place);
      place = place * 10;
      n = n / 2;
    }
    System.out.print(binary);
  }
  
}
