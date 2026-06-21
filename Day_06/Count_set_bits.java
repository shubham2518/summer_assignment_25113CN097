import java.util.Scanner;

public class Count_set_bits {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");

    int n = input.nextInt();

    int count = 0;

    while(n > 0){
      int rem = n % 2;

      if(rem == 1){
        count++;
      }
      n = n / 2;
    }
    System.out.print("SET BITS = " + count);
  }  
}