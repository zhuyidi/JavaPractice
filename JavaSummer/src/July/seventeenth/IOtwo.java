package July.seventeenth;

import java.util.Scanner;

/**
 * Created by dela on 7/17/17.
 */
public class IOtwo {
    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        while(count != 0){
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(sum = num1 + num2);
            count--;
        }
    }
}
