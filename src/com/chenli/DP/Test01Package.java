package com.chenli.DP;

import org.junit.Test;

import java.util.Arrays;

public class Test01Package {

    @Test
    public void getMaxValue(){

        Package[] pg = {
                new Package("e",4,6),
                new Package("d",5,4),
                new Package("c",6,5),
                new Package("b",2,3),
                new Package("a",2,6)
        };

        // 第一个参数表示从pg[0]开始依次放入的物品，
        // 第二个参数代表背包的承重,放弃第0列数组
        int[][] state = new int[pg.length][11];
        int newValue =0;

        /**
         *  01背包的状态转换方程
         *  f[i,j] = Max{
         *               f[i-1,j-Wi]+Pi( j >= Wi ),
         *               f[i-1,j] }
         */

        //表示从pg0开始依次放入pg1、pg2...
        for (int i = 0; i < pg.length; i++) {
            //表示背包的承重从1开始一次增长
            for (int j=1; j < state[i].length;j++){
                if (i==0){
                    if (j>pg[i].getWeight()){
                        state[i][j] = pg[i].getValue();
                    }
                }else {
                    if (j < pg[i].getWeight()){
                        continue;
                    }
                        newValue = state[i-1][j-pg[i].getWeight()] + pg[i].getValue();
                        state[i][j] = Math.max(newValue, state[i-1][j]);
                }
            }
        }

        for (int i = 0; i < state.length; i++) {
            System.out.println(Arrays.toString(state[state.length-1-i]));
        }
    }
}
