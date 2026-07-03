import java.util.Scanner;

public class Employee_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        int id[] = new int[n];
        String name[] = new String[n];
        int age[] = new int[n];
        String village[] = new String[n];
        double salary[] = new double[n];

        // Input
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Age: ");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Village: ");
            village[i] = sc.nextLine();

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Display
        System.out.println("\n========== EMPLOYEE DETAILS ==========");

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("ID      : " + id[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Age     : " + age[i]);
            System.out.println("Village : " + village[i]);
            System.out.println("Salary  : " + salary[i]);
        }
    }
}