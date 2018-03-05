public class StringtoInteger_8 {

    public static  int myAtoi(String str){

        str = str.trim();
        if (str.isEmpty()){
            return 0;
        }
        //表示正负号
        int sign = 1;
        int start = 0;

        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            if (str.charAt(0) == '+') sign=1;
            else sign=-1;
            if (str.length() < 2 || !Character.isDigit(str.charAt(1))){
                    return 0;
            }
            start++;
        }

        long sum = 0;
        while (start < str.length()){
            if (!Character.isDigit(str.charAt(start))){
                break;
            }else {
                int d = str.charAt(start)-'0';
                sum = sum*10 + d;
                long a= sum*sign;
                if (sum*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sum*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            start++;
        }
        return (int) sum * sign;
    }

    public static void main(String[] args){
        String s = "1";
        System.out.println(myAtoi(s));

    }
}
