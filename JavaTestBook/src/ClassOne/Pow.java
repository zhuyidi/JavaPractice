package ClassOne;


import java.util.Scanner;

/**
 * Created by dela on 10/22/17.
 */
public class Pow {
    public static void main(String [] args){
        double num = 0;
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            num = scanner.nextDouble();
            System.out.printf("%.6f\n", result(num));
        }
    }

    public static double result(double num){
        double x = 0;
        if(num < 0){
            return Double.NaN;
        }

        while(x*x < num && Math.abs(num - x*x) > 0.0001){
            x += 0.0001;
        }
        return x;
    }
}
