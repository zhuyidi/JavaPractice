package ClassTwo;

import java.util.Scanner;

/**
 * Created by dela on 11/14/17.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        FenShu A = new FenShu(a, b);
        FenShu B = new FenShu(c, d);
        A.cheng(B);
    }
}

class FenShu{
    private int zi;
    private int mu;

    public FenShu(int zi, int mu){
        this.zi = zi;
        this.mu = mu;
    }

    public FenShu(){}

    public void cheng(FenShu o){
        int zi = this.zi * o.zi;
        int mu = this.mu * o.mu;

        int t = gcd(zi, mu);

        System.out.printf("%d/%d\n", zi/t, mu/t);
    }

    private static int gcd(int x, int y){
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }
}
