package July.nineteenth;


import java.util.Scanner;

/**
 * Created by dela on 7/19/17.
 */
public class two {
    public static void main(String args[]){
        int[] num = new int[100];
        int count = 0;
        int i = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            i = 0;
            count = scanner.nextInt();
            while(i != count){
                num[i] = scanner.nextInt();
                i++;
            }

            if(count == 1){
                System.out.println(num[0]);
            }else{
                result = minBs(num[0], num[1]);
                for(i = 2; i < count; i++){
                    result = minBs(result, num[i]);
                }
                System.out.println(result);
            }
        }
    }

    private static int minBs(int num1, int num2){
        int temp1 = num1;
        int temp2 = num2;
        int result = 1;

        while((result = temp1 % temp2) != 0){
            temp1 = temp2;
            temp2 = result;
        }
        result = num1 * num2 / temp2;

        return result;
    }
}