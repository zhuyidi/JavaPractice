package July.seventeenth;

import java.util.Scanner;

/**
 * Created by dela on 7/17/17.
 */
public class IOthree {
    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        while(num1 != 0 || num2 != 0){
            sum = num1 + num2;
            System.out.println(sum);
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }
    }
}
