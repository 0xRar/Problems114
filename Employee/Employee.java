import java.util.Scanner;

public class Employee {
    private int Id;
    private String FirstName;
    private String LastName;
    private double Salary;

    public Employee(int I, String first, String last, double salary) {
        Id = I;
        FirstName = first;
        LastName = last;
        Salary = salary;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getSalary() {
        return Salary;
    }


    public static Employee[] EnterArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int arrSize = input.nextInt();

        Employee[] arr = new Employee[arrSize];

        for(int i = 0; i < arr.length;i++) {
            System.out.println("## ---- Employee Info ----##");
            System.out.println("\n");

            System.out.println("Employee number: ");
            int empNum = input.nextInt();

            System.out.print("Enter the ID: ");
            int Id = input.nextInt();

            System.out.print("Enter the First Name: ");
            String FirstName = input.next();

            System.out.print("Enter the Last Name: ");
            String LastName = input.next();

            System.out.print("Enter the Salary: ");
            double Salary = input.nextDouble();

            arr[i] = new Employee(Id, FirstName, LastName, Salary);
        }
        return arr;
    }


    public static String HighestSalary(Employee[] array) {
        double Max = array[0].getSalary();
        String str = array[0].getFirstName() +" "+ array[0].getLastName();

        for (int i=1; i<array.length; i++) {
            if (array[i].getSalary() > Max) {
                Max = array[i].getSalary();
                str = array[i].getFirstName() +" "+ array[i].getLastName();
            }
        }
        return str;
    }


    public static void display(Employee[] array, double x) {
        System.out.print("Names of the employess with a salary greater than " + x + " are: ");

        for(int i = 0; i< array.length; i++) {
            if(array[i].getSalary() > x) {
                System.out.println(array[i].getFirstName() + " " + array[i].getLastName());
            }
        }
    }


    public static void main(String[] args) {
        Employee[] List;
        List = EnterArray();
        String MaxName = HighestSalary(List);
        System.out.println("The name of the highest salary is: " +MaxName);
        display(List, 500);
    }
    // I didint solve the problem my self this one was an advanced problem
    // Isa Ebrahim (0xRar)
}
