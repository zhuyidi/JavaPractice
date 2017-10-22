package ClassOne;

/**
 * Created by dela on 10/22/17.
 */
public class FormatStringTest {
    public static void main(String [] args){
        int a = 10;
        System.out.printf("-" + String.format("%-10s", String.valueOf(a)) + "-");
    }
}
