public class PersonMain {
    public static void main(String[] args) {
        // Creating & Setting the values of name, email, phone
        Person P1 = new Person("Ahmed", "ahmed@uob.edu.bh", "66655544");
        Person P2 = new Person("Huda", "huda@uob.edu.bh", "64436988");

        // Changing the value of P1 phone as required in the problem
        P1.setPhone("33399988");

        // Printing Person Information
        P1.Print();
        P2.Print();

        // Getting the personCounter and printing it
        System.out.println("Number of Objects Created: " +P1.getPersonCounter());
    }
    // Isa Ebrahim (0xRar)
}
