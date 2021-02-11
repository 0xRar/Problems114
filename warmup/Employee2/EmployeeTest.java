public class EmployeeTest {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2();
        Employee2 employee2 = new Employee2();

        employee1.setFirstName("John");
        employee1.setLastName("Smith");
        employee1.setMonthlySalary(250.00);

        employee2.setFirstName("Jane");
        employee2.setLastName("Doe");
        employee2.setMonthlySalary(300.00);


        System.out.println("\n#Employee1");
        System.out.println("Employee Name : " + employee1.getFirstName() +" "+ employee1.getLastName()); // Display Employee1 name & last name
        System.out.println("Initial Salary : " + employee1.getMonthlySalary()); // Display Employee1 initial salary

        System.out.println("\n#Employee2");
        System.out.println("Employee Name : " + employee2.getFirstName() +" "+ employee2.getLastName()); // Display Employee2 name & last name
        System.out.println("Initial Salary : " + employee2.getMonthlySalary()); // Display Employee2 initial salary

        System.out.println("\n------------------- After 10% Salary Raise  -------------------");
        System.out.println("\n#Employee1");
        System.out.println("Employee Name : " + employee1.getFirstName() +" "+ employee1.getLastName());
        System.out.println("Initial Salary : " + employee1.getMonthlySalary() * 1.1);

        System.out.println("\n#Employee2");
        System.out.println("Employee Name : " + employee2.getFirstName() +" "+ employee2.getLastName());
        System.out.println("Initial Salary : " + employee2.getMonthlySalary() * 1.1);

        // Isa Ebrahim (0xRar)
    }
}
