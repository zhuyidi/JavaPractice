package com.zhuyidi.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by dela on 3/14/17.
 */
public class Average {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while(true){
            try{
                int number = inputNum.nextInt();
                if(number == 0){
                    break;
                }
                sum += number;
                count++;
            }
            catch(InputMismatchException ex){
                System.out.printf("略过非整数输入:%s%n", inputNum.next());
            }
        }
        System.out.printf("平均:%.2f\n", sum / count);
    }
}

