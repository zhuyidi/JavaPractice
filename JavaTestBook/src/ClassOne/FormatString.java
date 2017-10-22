package ClassOne;


import java.util.Scanner;

/**
 * Created by dela on 10/22/17.
 */
public class FormatString {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String cho;

        while(scanner.hasNext()){
            cho = scanner.nextLine();
            System.out.printf("choice=%s\n", cho);
            Choice(cho);
        }
    }

    public static void Choice(String cho){
        Scanner scanner = new Scanner(System.in);
        if(cho.equals("double")){
            String[] dou = new String[3];
            dou = scanner.nextLine().split("\\s+");

            System.out.printf("%-5.2f,%5.2f,%.2f\n", Double.parseDouble(dou[0]), Double.parseDouble(dou[1]), Double.parseDouble(dou[2]));
        }else if(cho.equals("int")){
            String[] num =  new String[3];
            num = scanner.nextLine().split("\\s+");

            System.out.printf("%d\n", Integer.parseInt(num[0]) + Integer.parseInt(num[1]) + Integer.parseInt(num[2]));
        }else if(cho.equals("str")){
            String[] str = new String[3];
            str = scanner.nextLine().split("\\s+");

            System.out.printf("%s\n", str[2] + str[1] + str[0]);
        }else if(cho.equals("line")){
            System.out.printf("%s\n", scanner.nextLine().toUpperCase());
        }else{
            System.out.printf("other\n");
        }
    }
}
