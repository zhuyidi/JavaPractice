package ClassFour;

import java.util.Scanner;

/**
 * Created by dela on 11/29/17.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int[][] array = new int[row][];
        int[] col = new int[row];

        for (int i = 0; i < row; i++) {
            col[i] = scanner.nextInt();
            array[i] = new int[col[i]];
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col[i] && scanner.hasNextInt(); j++) {
                array[i][j] = scanner.nextInt();
                System.out.print(array[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
