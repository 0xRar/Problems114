import java.util.Scanner;

public class ArrayPractice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Arr[] = new int[5];
        
        int i;
        for (i=0; i < Arr.length; i++) {

            System.out.print(i +" Enter an integer number 5 times: ");
            Arr[i] = input.nextInt();
        }

        for (i=0; i < Arr.length; i++) {

            if (Arr[i] % 2 == 1) {
                System.out.println("The First odd number is: " + Arr[i]);
            } else {
                System.out.println("No odd numbers found.");
            }
            return;
        }

        // Isa Ebrahim (0xRar)
    }
}
