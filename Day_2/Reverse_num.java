import java.util.Scanner;

public class Reverse_num {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");

    int n = input.nextInt();
    int i, rev = 0;
    while(n!=0){
      i = n % 10;
      rev = rev * 10 + i;
      n = n / 10;
    }
    System.out.print("Reverse of the number : " + rev);
            
  }
  
}
