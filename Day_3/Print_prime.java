import java.util.Scanner;

public class Print_prime {
  
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    System.out.print("Enter starting number : ");
    int start = input.nextInt();

    System.out.print("Enter ending number : ");
    int end = input.nextInt();
    
    int i, j;

    for(i=start; i<=end; i++){
      int count = 0;

      for(j=1; j<=i; j++){
        if(i % j ==0){
          count++;
        }
      }
      if(count == 2){
        System.out.print(i + " ");     // "\t" -- one tab space
      }
    }
  } 
}
