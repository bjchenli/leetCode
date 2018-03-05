package com.chenli.DC;

public class Hano {

    /**
     * 若要让第n个圆盘成功从A移动到C，需要让前n-1个圆盘先从A移动到B，然后让第n个圆盘从A移动到C，
     * 最后让第n-1个圆盘从B移动到C，至于如何将前n-1个圆盘从A移动到B或者从A移动到C，仅仅是和父问
     * 题相同的子问题，采用父问题的解决方案即可。
     */
    private static void hanoi(int n, String a, String b, String c){
        if (n == 1){
            // 只有一个圆盘时直接从A石柱移动到C石柱
            move(n,a,c);
        }else {
            // 将前n-1个圆盘从石柱A移动到石柱B
            hanoi(n - 1, a, c, b);
            // 将第n号圆盘从石柱A移动到石柱C
            move(n, a, c);
            // 将前n-1个圆盘从石柱B移动到石柱C
            hanoi(n - 1, b, a, c);
        }
    }

    private static void move(int n, String i, String j){
        System.out.println("第"+n+"个圆盘，从"+i+"移动到"+j);
    }

    public static void main(String[] args){
        hanoi(3,"A","B","C");
    }
}
