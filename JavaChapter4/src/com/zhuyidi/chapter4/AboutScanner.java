package com.zhuyidi.chapter4;

import java.util.Scanner;

/**
 * Created by dela on 3/3/17.
 */
public class AboutScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random() * 10);
        int guess;

        do {
            System.out.print("猜数字:");
            guess = scanner.nextInt();
        }while(guess != number);

        System.out.println("猜中了!");
    }
}
