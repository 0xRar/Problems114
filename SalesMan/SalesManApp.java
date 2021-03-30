// Part B
import java.util.Scanner;

public class SalesManApp {

    public static String BestSales(SalesMan[] BestSalesMan) {
        int max = 0;

        for (int i = 1; i < BestSalesMan.length; i++)
            if (BestSalesMan[max].getSalesAmount() < BestSalesMan[i].getSalesAmount())
                max = i;
                return BestSalesMan[max].getFirstName() + " " + BestSalesMan[max].getLastName();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of SalesMan : ");
        int sm = input.nextInt();

        SalesMan[] ArrObj = new SalesMan[sm];


        for (int i=0; i < ArrObj.length; i++) {
            System.out.print("("+ (i + 1) +"). " +
                    "Enter the SalesMan First Name: ");
            String fn = input.next();

            System.out.print("("+ (i + 1) +"). " +
                    "Enter the SalesMan Last Name: ");
            String ln = input.next();

            System.out.print("("+ (i + 1) +"). " +
                    "Enter the SalesMan Sales Amount: ");
            double sa = input.nextDouble();

            ArrObj[i] = new SalesMan(fn, ln, sa);
        }

        System.out.print("Enter value of d: ");
        double d = input.nextDouble();

        System.out.println("Names of salesman with sales higher than " + d + ":");

        for (int i = 0; i < ArrObj.length; i++) {

            if(ArrObj[i].getSalesAmount() > d) {
                System.out.println(ArrObj[i].getFirstName() + " "
                        + ArrObj[i].getLastName());
            }
        }

        System.out.println("Names of SalesMan with the best sales amount: "
                + BestSales(ArrObj));

        // Isa Ebrahim (0xRar)
    }
}
