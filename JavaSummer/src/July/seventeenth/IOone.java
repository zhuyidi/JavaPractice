package July.seventeenth;

import java.util.Scanner;

/**
 * Created by dela on 7/17/17.
 */
public class IOone {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        while(scanner.hasNextInt()){
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println(sum);
            System.out.println();
        }
    }
}
