public class PalindromeNumber_9 {

    public boolean isPalindrome(int x){
/*        if (x < 0 || (x>0 && x%10 == 0)) return false;

        int div = 1;
        while (div <= x/10){
            div = div*10;
        }

        while (x >0){
            if (x/div != x%10){
                return false;
            }
            x = (x%div)/10;
            //因为前后两位数都要比较，所以一下去掉前后两位数
            div = div/100;
        }
        return true;*/

        if (x<0 || (x>0 && x%10 == 0)) return false;

        int num = 0;
        while (x > num){
            int d = x %10;
            num = num*10+d;
            x = x/10;
        }
        return num==x || num/10 == x;
    }
}
