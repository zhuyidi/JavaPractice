package July.seventeenth;

import java.util.Scanner;

/**
 * Created by dela on 7/17/17.
 */
public class IOfive {
    public static void main(String args[]){
        int count1 = 0;
        int count2 = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        count1 = scanner.nextInt();
        while(count1 != 0){
            count2 = scanner.nextInt();
            while(count2 != 0){
                sum += scanner.nextInt();
                count2--;
            }
            System.out.println(sum);
            sum = 0;
            count1--;
            if(count1 != 0){
                System.out.println();
            }
        }
    }
}
