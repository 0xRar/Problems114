// Assignment 1
// this problem was taken from a friend, but the solution is written by me (0xRar).
public class FruitTest {
    public static void main(String[] args) {
        Fruit Mango = new Fruit("Mango", "India", 0.95, 100);
        Fruit Apple = new Fruit("Apple", "Italia", 0.8, 150);
        Fruit Orange = new Fruit("Orange", "Tunisia", 1.1, 200);

        // Display Fruit Orange
        System.out.println("Name: "+Orange.getName() + "\nCountry: "+Orange.getCountry()
                + "\nPrice: "+Orange.getPrice() + "\nQuantity: " +Orange.getQuantity());

        Mango.setPrice(1.5);

        System.out.println("\nTotal Number Of Fruits: " +
                (Orange.getQuantity() + Apple.getQuantity() + Mango.getQuantity()) + "\n");


        System.out.println("Name: "+Mango.getName() + "\nCountry: "+Mango.getCountry()
                + "\nPrice: "+Mango.getPrice() + "\nQuantity: " +Mango.getQuantity());
    }
    // Isa Ebrahim (0xRar)
}
