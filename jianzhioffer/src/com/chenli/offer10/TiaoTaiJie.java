package com.chenli.offer10;

public class TiaoTaiJie {
    public int JumpFloor(int target) {

        if(target <= 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int n0 = 1;
        int n1 = 2;
        int n2 = 0;

        for (int i = 2; i < target; i++){
            n2 = n0 + n1;
            n0 = n1;
            n1 =n2;
        }
        return n2;
    }
}
