import java.util.*;

class Employee {
    String name;
    String job;
    double salary;

    Employee(String n, String j, double s) {
        name = n;
        job = j;
        salary = s;
    }

    void calculate(int d) {
        salary = (salary * d) / 30;
    }

    public void display() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee job: " + job);
        System.out.println("Employee salary: " + salary);
    }
}

public class A7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        System.out.println("Enter employee details: ");
        
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee " + (i + 1) + ";");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Job : ");
            String job = sc.next();
            System.out.print("Salary: ");
            double s = sc.nextDouble();
            System.out.print("Days worked : ");
            int days = sc.nextInt();
            
            emp[i] = new Employee(name, job, s);
            emp[i].calculate(days);
            System.out.println();
        }
        
        System.out.println("Displaying employee details!");
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee " + (i + 1));
            emp[i].display();
        }
        sc.close();
    }
}