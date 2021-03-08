/*
Exercise 1

Create a class named fruit with two private data members:
    name: representing a fruit name. Default value is “Fruit”.
    price: representing a fruit price as a non-negative floating point number. Default value is 1.0.

Additionally, the class should also include the following methods:
    A default constructor to initialize the data members.
    A set method with parameters to set name and price.
    Two get methods to return values of name and price.

write a java program that the following :
    define an object of type fruit  named F1 and ask the user to enter its name and price
    define an object of type fruit named F2 with name "Orange" and price "3.5"
    print the data of  F1 and F2.
    change F2 price to be 36.5
    print the data of  F1 and F2.
 */
public class Fruit {
    private String name;
    private double price;

    public fruit() {
        name = "Fruit";
        price = 1.0;

        if(price < 0) {
            price = 1.0;
        }
    }

    public void setData(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    // Isa Ebrahim(0xRar)
}
 
