import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        App A1 = new App();
        A1.setApp("Google map", 5, 600);

        App A2 = new App();
        A2.setApp("Talabat", 4, 300);

        App A3 = new App();

        System.out.println("Enter Name, Rate, Downloads");
        String na = input.next();
        double ra = input.nextDouble();
        int d = input.nextInt();


        if (A1.isTopApp()) {
            System.out.println(A1.getName() +
                    " one of the top apps? : " + A1.isTopApp());

        } else if (A2.isTopApp()) {
            System.out.println(A2.getName() +
                    " one of the top apps? : " + A2.isTopApp());

        } else if (A3.isTopApp()) {
            System.out.println(A3.getName() +
                    " one of the top apps? : " + A3.isTopApp());
        }
    }
    // Isa Ebrahim (0xRar)
}
