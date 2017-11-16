package ClassOne;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dela on 10/22/17.
 */
public class MyRandom {
    public static void main(String[] args){
        int n;
        int m;
        int k;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();


        Random random = new Random(k);
        for(int i = 0; i < n ; i++){
            result = random.nextInt(m);
        }

        System.out.print(result);

        Map map = new HashMap();
        HashMap a = new HashMap();
        a = (HashMap)map;
    }
}
