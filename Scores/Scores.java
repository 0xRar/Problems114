import java.util.Scanner;

public class Scores.java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int [4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter values for row " + i + ": ");

            for (int x = 0; x < 3; x++) {
                scores[i][x] = input.nextInt();
            }
        }

        // get the max value
        int maxVal = 0;
        for (int i = 0; i < 3; i++)
            maxVal += scores[0][i];

        // get the index of the max value
        int maxIndex = 0;
        for (int i = 1; i < 4; i++) {

            int sum = 0;
            for (int x = 0; x < 3; x++)
                sum += scores[i][x];
          
            if (sum > maxVal) {
                maxVal=sum;
                maxIndex = i;
            }
        }

        System.out.println("Row " + maxIndex + " has the maximum sum");
        System.out.println("Row " + maxIndex + " has the following values: ");

        for(int i = 0; i < 3; i++) {
            System.out.print(scores[maxIndex][i] + " ");
        }
    }
    // Isa Ebrahim (0xRar)
}
