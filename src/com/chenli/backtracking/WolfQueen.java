package com.chenli.backtracking;

public class WolfQueen {
    //定义为8个皇后
    static int max = 8;
    //该数组保存结果，第一个皇后在array[0]列，也就是这个数组存储的是皇后所在列的值
    static int[] array = new int[max];

    private static void check(int n){
        //终止条件是最后一行已经摆完，由于每摆一步都会校验是否有冲突，
        // 所以只要最后一行摆完，说明已经得到了一个正确解
        if (n == max){
            printQueen();
            return;
            }

        //从第一列开始放值，然后判断是否和本行本列本斜线有冲突，
        // 如果OK，就进入下一行的逻辑
        for (int i = 0; i < max; i++){
            array[n] = i;
            if (judge(n)){
                check(n+1);
            }
        }
    }

    private static boolean judge(int n) {
        for (int i = 0; i< n; i++){
            if (array[i]==array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }

    private static void printQueen() {
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+1+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        check(0);
    }
}
