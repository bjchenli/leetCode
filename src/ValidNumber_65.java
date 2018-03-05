/**
 * Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true

 Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 * */


/*
* 记住几个特例：
* 1、e9不是数字，确定e前面必须得有数字或者小数点
* 2、46.e9是数字，所以e前面有小数点也可以是数字
* 3、.e9不是数字
* */
public class ValidNumber_65 {

    public boolean isNumber(String s){
        //若输入字符串为空，则直接返回false
        if (s == null || s.trim().length() == 0){
            return false;
        }
        //去除字符串s前后的空格
        s = s.trim();

        //定义数字、小数点和e的标志位，其中e是科学计数法中必要的字母
        boolean numberIs = false;
        boolean pointIs = false;
        boolean eIs = false;

        //开始遍历字符串s
        for (int i = 0; i < s.length(); i++) {
            //1、判断字符串中的字符是否是数字
            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                numberIs = true;
            }else if (s.charAt(i) == '.'){
                //2、判断字符是否为小数点，且判断前一位字符是否为小数点或者字母e
                if (eIs || pointIs){
                    return false;
                }
                pointIs = true;
            }else if (s.charAt(i) == 'e'){
                //3、判断字符是否为字母e，且判断前一位字符是否为小数点或者字母e
                if (eIs || !numberIs){
                    return false;
                }
                numberIs = false;
                eIs = true;
            }else if (s.charAt(i) == '-' || s.charAt(i) == '+'){

                //4、判断字符是否为正负号，且判断正负号是否位于第一位或者字母e的后面一位
                if (i != 0 && s.charAt(i-1) != 'e'){
                    return false;
                }
            }else
                return false;
        }
        return numberIs;
    }
}
