package July.nineteenth;

import java.util.Scanner;

/**
 * Created by dela on 7/19/17.
 */
public class one {
    public static void main(String args[]){
        int[] count = new int[55];
        int i = 0;
        int n;
        Scanner scanner = new Scanner(System.in);

        while(i < 4){
            count[i] = i+1;
            i++;
        }
        while(i < 54){
            count[i] = count[i-1] + count[i -3];
            i++;
        }

        n = scanner.nextInt();
        while(n != 0){
            System.out.println(count[n-1]);
            n = scanner.nextInt();
        }
    }
}