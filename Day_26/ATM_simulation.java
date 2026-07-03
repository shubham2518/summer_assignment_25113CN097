import java.util.Scanner;

public class ATM_simulation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your PIN : ");
    int pin = input.nextInt();

    if (pin == 6525) {
      System.out.println("Welcome to the ATM!");
      System.out.println("1. Check Balance");
      System.out.println("2. Withdraw Money");
      System.out.println("3. Deposit Money");
      System.out.print("Choose an option : ");
      int option = input.nextInt();

      switch (option) {
        case 1:
          System.out.println("Your balance is : $1000");
          break;
        case 2:
          System.out.print("Enter the amount to withdraw : ");
          int withdrawAmount = input.nextInt();
          if (withdrawAmount <= 1000) {
            System.out.println("You have withdrawn : $ " + withdrawAmount);
            System.out.println("Your new balance is : $ " + (1000 - withdrawAmount));
          } else {
            System.out.println("Insufficient balance.");
          }
          break;
        case 3:
          System.out.print("Enter the amount to deposit : ");
          int depositAmount = input.nextInt();
          System.out.println("You have deposited : $ " + depositAmount);
          System.out.println("Your new balance is : $ " + (1000 + depositAmount));
          break;
        default:
          System.out.println("Invalid option.");
      }
    } else {
      System.out.println("Incorrect PIN. Access denied.");
    }
  }
}
