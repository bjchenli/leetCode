package com.chenli.offer9;

public class Fibonacci {

    public static int fibonacci(int n){

        if (n <=0) return 0;
        if (n==1 || n ==2) return 1;

        int [] farr = new int[n];
        farr[0]=1;farr[1]=1;
        int i =2;
        for (; i<n; i++){
            farr[i] = farr[i-1] + farr[i-2];
        }
        return farr[i-1];
    }

    public static void main(String[] args){
        System.out.println(fibonacci(3));
    }
}
