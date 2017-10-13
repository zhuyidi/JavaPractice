package July.seventeenth;

import java.util.Scanner;

/**
 * Created by dela on 7/17/17.
 */
public class IOfour {
    public static void main(String args[]){
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();
        while(count != 0 && scanner.hasNextInt()){
            sum += scanner.nextInt();
            count--;
            if(count == 0){
                System.out.println(sum);
                count = scanner.nextInt();
                sum = 0;
            }
        }

    }
}
