public class Employee2 {
    // Variable Declaration
    private String FirstName;
    private String LastName;
    private double MonthlySalary;

    // Constructor
    public Employee2() {
        FirstName = "";
        LastName = "";
        MonthlySalary = 0;
    }

    // Setters
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        MonthlySalary = monthlySalary;

        //If the monthly salary is not positive, set it to 0.0.

        if (MonthlySalary < 0) {
            MonthlySalary = 0.0;
        } else
            this.MonthlySalary = MonthlySalary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }
    // Isa Ebrahim (0xRar)
}
