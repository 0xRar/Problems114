public class Person {
    // Private data members
    private String name, email, phone;
    private static int personCounter=0;

    // Constructor
    public Person(String na, String em, String ph) {
        name = na;
        email = em;
        phone = ph;
        personCounter++;
    }

    // Setter methods
    public void setName(String na) {
        name = na;
    }

    public void setEmail(String em) {
        email = em;
    }

    public void setPhone(String ph) {
        phone = ph;
    }

    // Getter only for personCounter
    public int getPersonCounter() {
        return personCounter;
    }

    // A Printing method
    public void Print() {
        System.out.println("-- Person Information --");
        System.out.println("Person Name: " +name);
        System.out.println("Person Email: " +email);
        System.out.println("Person Phone: " +phone);
        System.out.println("\n");
    }
}
