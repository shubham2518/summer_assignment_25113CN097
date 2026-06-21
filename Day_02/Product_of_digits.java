import java.util.Scanner;

public class Product_of_digits {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");

    int n = input.nextInt();
    int i, product = 1;

    while(n!=0){
      i = n % 10;
      product = product * i;
      n = n / 10;
    }
    System.out.print("Product of digits = " +product);
  }
}