package com.zhuyidi.chapter4;

import java.util.Arrays;

/**
 * Created by dela on 3/3/17.
 */
public class AboutArray {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = array1;
        int[] array3 = {3,2,1};
        int[] array4 = new int[array3.length];
        double[] c1 = {0.1, 0.2, 0.3};
        double[] c2 = Arrays.copyOf(c1, c1.length);
        int[][] c3 = new int[2][];
        int[][] c4 = new int[2][];

        array2[0] = 0;
        System.out.println(array1[0]); //array1[0]的值会被改变

        array4 = Arrays.copyOf(array3, array3.length);
        array4[0] = 6;
        System.out.println(array3[0]); //array3[0]的值不会被改变

        c2[0] = 0.6;
        System.out.println(c1[0]);

        c3[0] = new int[]{1, 2, 3};
        c3[1] = new int[]{4, 5};
        c4 = Arrays.copyOf(c3, c3.length);
        c4[0][0] = 6;
        System.out.println(c3[0][0]);
    }
}
