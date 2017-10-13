package com.zhuyidi.chapter4.AboutCopy;

import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * Created by dela on 3/3/17.
 */
public class ShallowCopy {
    public static void main(String[] args){
        Cloths[] c1 = {
                new Cloths("red", 'l'),
                new Cloths("blue", 's')
        };
        Cloths[] c2 = new Cloths[c1.length];

        c2 = Arrays.copyOf(c1, c1.length);
        c2[0].color = "yellow";

        System.out.println(c1[0].color);
    }
}
