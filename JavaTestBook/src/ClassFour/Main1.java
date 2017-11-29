package ClassFour;

import java.util.Scanner;

/**
 * Created by dela on 11/29/17.
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try{
            System.out.println(a + "/" + b + "=" + a/b);
        }catch (Exception e){
            System.out.println("Not divided by 0");
        }finally {
            System.out.println("must process");
        }

        System.out.println("END");
    }
}
