import java.util.Scanner;

public class Profits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] profit = new int[4][12];
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the profits for branch number: " + (i + 1));

            for (int x = 0; x < 12; x++) {
                profit[i][x] = input.nextInt();
            }
        }

        int Psum = 0; // Profit Sum
        int Count_Zeros = 0;

        for (int i = 0; i < 4; i++) {
            Psum = 0;
            Count_Zeros = 0;

            for (int x = 0; x < 12; x++) {
                Psum += profit[i][x];

                if (profit[i][x] == 0) {
                    Count_Zeros++;
                }
            }


            if (Psum >= 7000 && Count_Zeros == 0) {
                counter++;
                System.out.println("Branch number: " + (i + 1) + " is productive");
            }
        }
      

        System.out.println("Number of productive branches: " + counter);
    }
    // Isa Ebrahim(0xRar)
}
