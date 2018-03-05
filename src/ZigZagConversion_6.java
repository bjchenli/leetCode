import java.util.Arrays;

public class ZigZagConversion_6 {


    public String convert(String s, int numRows){
        if (s.length() == 0 || numRows == 1) return s;

        String[] arr = new String[numRows];
        //初始化数组的每个位置为一个空字符串，便于后面拼接字符串
        Arrays.fill(arr,"");

        int row=0;
        //delta作为一个标志符，1表示从上往下，-1表示从下往上
        int delta =1;
        for (int i = 0; i < s.length(); i++) {
            arr[row] += s.charAt(i);
            row += delta;

            if (row >= numRows){
                //这里为啥是减2，因为从第二列开始要往上移一个位置，最大的位置为numRows-1，所以这里是减2
                row = numRows -2;
                //在这里要开始转向，向上
                delta = -1;
            }
            if (row < 0){
                //因为0的位置已经有了，下一个就是1的位置
                row =1;
                //开始转向，向下
                delta =1;
            }
        }
        String ss = "";
        for (int i = 0; i< arr.length; i++){
            ss += arr[i];
        }
        return ss;
    }
}
