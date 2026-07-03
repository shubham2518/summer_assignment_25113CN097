import java.util.Scanner;

public class Salary_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double ta = basic * 0.05;
        double pf = basic * 0.08;

        double grossSalary = basic + hra + da + ta;
        double netSalary = grossSalary - pf;

        System.out.println("\n========== SALARY SLIP ==========");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("TA (5%)       : " + ta);
        System.out.println("PF (8%)       : " + pf);
        System.out.println("-------------------------------");
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Net Salary    : " + netSalary);

        if (netSalary >= 50000)
            System.out.println("Salary Grade  : A");
        else if (netSalary >= 30000)
            System.out.println("Salary Grade  : B");
        else
            System.out.println("Salary Grade  : C");
    }
}