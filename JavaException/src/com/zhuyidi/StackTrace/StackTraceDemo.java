package com.zhuyidi.StackTrace;

/**
 * Created by dela on 3/15/17.
 */
public class StackTraceDemo {
    static String a(){
        String test = null;
        return test.toUpperCase();
    }

    static void b(){
        a();
    }

    static void c(){
        try{
            b();
        }catch(NullPointerException ex){
            ex.printStackTrace();
            Throwable t = ex.fillInStackTrace();
            throw (NullPointerException)t;
        }
    }

    public static void main(String[] args){
        try{
            c();
        }catch(NullPointerException ex){
            ex.printStackTrace();
        }
    }
}
