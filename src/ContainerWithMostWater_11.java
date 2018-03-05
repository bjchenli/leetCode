public class ContainerWithMostWater_11 {

    public int maxArea(int[] height){

        if (height.length <2 ) return 0;

        int maxS = 0;
        int i=0;
        int j = height.length-1;

        while (j>i){
            int curS = Math.min(height[i],height[j])*(j-i);
            maxS = Math.max(maxS,curS);
            //突破点在高的柱子上
            if (height[i]>height[j]){
                j--;
            }else {
                i++;
            }
        }
        return maxS;
    }
}
