import java.util.Scanner;

public class MainFruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fruit F1 = new fruit();

        // taking input from the user
        System.out.println("Enter the name of the fruit : ");
        String n = input.next();

        System.out.println("Enter the price of the fruit : ");
        double p = input.nextDouble();

        fruit F2 = new fruit();
        // setting the data
        F1.setData(n, p);
        F2.setData("Orange" ,3.5);


        // printing the data of F1, F2
        System.out.println("Fruit 1 name : "+ F1.getName() +"\nFruit 1 price : "+ F1.getPrice());
        System.out.println("\n--------------------");
        System.out.println("Fruit 2 name : "+ F2.getName() +"\nFruit 2 price : "+ F2.getPrice());

        // changing the price value of F2
        F2.setData(F2.getName(), 36.5);

        // printing again after changing the price value of F2
        System.out.println("\n---- updated ----\n");
        System.out.println("Fruit 1 name : "+ F1.getName() +"\nFruit 1 price : "+ F1.getPrice());
        System.out.println("\n--------------------");
        System.out.println("Fruit 2 name : "+ F2.getName() +"\nFruit 2 price : "+ F2.getPrice());

        // Isa Ebrahim(0xRar)
    }
}
 
