package July.seventeenth;

import java.util.Scanner;

/**
 * Created by dela on 7/17/17.
 */
public class IOsix {
    public static void main(String args[]){
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            count = scanner.nextInt();
            while(count != 0){
                sum += scanner.nextInt();
                count--;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}