package ClassOne;

import java.util.Scanner;

/**
 * Created by dela on 10/18/17.
 */
public class NumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (scanner.hasNext()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(sum(a, b));
        }
    }

    public static String sum(int a, int b) {
        if(a > 1000){
            return "a<=1000";
        }
        return String.valueOf(a+b);
    }
}