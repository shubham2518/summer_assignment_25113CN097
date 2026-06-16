import java.util.Scanner;

public class Function_for_armstrong {

  static boolean isArmstrong(int n){
    int temp = n;
    int sum = 0, r;
    
    while (temp > 0) {
      r = temp % 10;
      sum = sum + (r * r * r);
      temp = temp / 10;
    }
    return n == sum;
  }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = input.nextInt();

    if (isArmstrong(num)) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not an armstrong number");
    }
  }  
}
