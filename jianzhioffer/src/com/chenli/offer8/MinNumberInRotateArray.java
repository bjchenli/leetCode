package com.chenli.offer8;

public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int[] array){

        if (array == null || array.length <= 0) return 0;

        if (array.length == 1) return array[0];

        int index1 = 0;
        int index2 = array.length-1;
        //初始化indexMid为index1的意图是为了防止旋转了0个数字
        int indexMid = index1;

        while (array[index1]>=array[index2]){
            if (index2-index1 == 1){
                indexMid = index2;
                break;
            }

            //如果index1、index2和indexMid指向的三个数相等，则进行顺序查找
            if(array[index1]==array[indexMid] && array[index2] == array[indexMid]){
                return MinInorder(array, index1, index2);
            }

            indexMid = (index1 +index2)/2;
            if (array[indexMid] >= array[index1]){
                index1 = indexMid;
            }
            if (array[indexMid] <= array[index2]) {
                index2 =indexMid;
            }
        }
        return array[indexMid];
    }

    private int MinInorder(int[] array, int index1, int index2) {
        int result = array[index1];
        for (int i = index1+1;i<array.length;i++){
            if (result > array[i]){
                result = array[i];
                break;
            }
        }
        return result;
    }

}
