import java.util.Scanner;

public class Countdigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //Scanner sc
    
    System.out.print("Enter a number : ");
    int n = input.nextInt();                //int n = sc.nextInt()
    int count = 0;
    if (n == 0){
      count = 1;
    }
    else{
      while (n!=0) {
        n = n/10;
        count++;
      }
    }
    System.out.println("Number of digits : " + count);  //count=count+1
  }
}
