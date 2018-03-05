import java.util.Stack;

public class ReverseInteger_7 {

    public int reverse(int x){

/*        String s = "";
        String result = "";
        s = s + x;
        char symbol = ' ';
        Stack stack = new Stack();

        for (int i = 0;  i<s.length(); i++){
            if (s.charAt(i) == '-'){
                symbol = s.charAt(i);
            }else {
                stack.push(s.charAt(i));
            }
        }
        if (symbol == '-'){
            result += symbol;
        }
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        long num = Long.parseLong(result);
        if (num>=Integer.MAX_VALUE || num <= Integer.MIN_VALUE){
            return 0;
        }
        return (int) num;*/

        long num = 0;
        while (x != 0){
            num = num*10 + x%10;
            x = x/10;
        }

        if (num <= Integer.MIN_VALUE || num>=Integer.MAX_VALUE){
            return 0;
        }
        return (int) num;
    }
}
