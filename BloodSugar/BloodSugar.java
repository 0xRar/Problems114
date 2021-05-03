// assignment 4

import java.io.*;
import java.util.Scanner;

public class BloodSugar {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("patients.txt"));

            int counter = 0, low = 0, normal = 0, high = 0;

            while (input.hasNextLine()) {
                String[] str = input.nextLine().split(";");

                System.out.print("Name: " + str[0] + " " + str[1] + "\n"
                        + "Age: " + str[2] + "\nRate: " + str[3]);


                int rate = Integer.parseInt(str[3]);

                if (rate < 140 && rate > 70) {

                    normal++;
                    System.out.print(" {Normal}\n");
                    System.out.println("-----------------");

                } else if (rate >= 140) {

                    high++;
                    System.out.print(" {High}\n");
                    System.out.println("-----------------");

                } else if (rate <= 70) {

                    low++;
                    System.out.print(" {Low}\n");
                    System.out.println("-----------------");

                }
                counter++;
            }

            System.out.println("\n");
            System.out.println("+-++-++-++-++-++-++-++-++-++-++-+");
            System.out.println("Patients with normal blood sugar: " + normal);
            System.out.println("Patients with high blood sugar: " + high);
            System.out.println("Patients with low blood sugar: " + low);
            System.out.println("Total patients: " + counter);
            System.out.println("+-++-++-++-++-++-++-++-++-++-++-+");


        } catch(FileNotFoundException ex) {
            System.out.println("File not found.");
            System.exit(0);
        }
        // Isa Ebrahim (0xRar)
    }
}
