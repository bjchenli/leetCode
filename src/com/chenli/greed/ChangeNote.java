package com.chenli.greed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeNote {
    public static int MAX=10;
    public static double  Value[]={100,50,20,10,5,2,1,0.5,0.2,0.1};
    public static int num[]=new int[MAX];
    public static void main(String[] args) {
        List ag=new ArrayList();
        for(int i=0;i<Value.length;i++){
            ag.add(Value[i]);
        }

        System.out.println("请输入要换的数值");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        conver(a);
        System.out.println("找零");
        for(int i=0;i<MAX;i++){
            if(num[i]>0){
                System.out.println("面值"+Value[i]+"一共需要 "+num[i]+"张");
            }

        }
    }
    private static void conver(double a) {
        // TODO Auto-generated method stub
        int i,j;
        for( i=0;i<MAX;i++)
            if (a>Value[i])
                break;


        while (a>0&&i<MAX){
            if(a>=Value[i]){
                a-=Value[i];
                num[i]++;
            }else if(a<0.1&&a>=0.05){
                num[MAX-1]++;
                break;
            }else
                i++;
        }
    }
}
