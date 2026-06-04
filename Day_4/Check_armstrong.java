import java.util.Scanner;

public class Check_armstrong {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive number : ");

    int n = input.nextInt();

    int temp = n, sum = 0, r;

    while(temp != 0){
      r = temp % 10;
     /*  sum = sum + (r*r*r);//Applicable for 3 digit numbers.For n digit numbers,use sum = sum + (int)Math.pow(r, n);*/
     sum = sum + (int)Math.pow(r, 4);
      temp = temp / 10;
    }
    if(sum == n)
      System.out.print("AN ARMSTRONG NUMBER");
    else
      System.out.print("NOT AN ARMSTRONG NUMBER");
  }
}
