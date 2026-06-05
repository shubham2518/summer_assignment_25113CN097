import java.util.Scanner;

public class Largest_prime_factor {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number : ");

    int n = input.nextInt();

    int largest = 1;
   

    for(int i = 1; i <= n; i++){

      if(n % i == 0){
       int count = 0;

        for(int j = 1; j <= i; j++){
          if(i % j == 0){
            count++;
          }
        }
        if(count == 2){
          largest = i;
        }
      }
    }
    System.out.print("Largest Prime Factor = " + largest);
  }
  
}
