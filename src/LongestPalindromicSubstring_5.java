public class LongestPalindromicSubstring_5 {

    /**
     *这里解决的主要是找出一个字符串中最长的回文子串
     */
/*
    int start = 0;
    int maxLength = 0;

    public String longestPalindrome(String s){
        //如果字符串的长度小于2，则不能构成回文
        if (s.length() < 2) return s;

        for (int i = 0; i < s.length(); i++){
            //针对回文子串的长度为奇数的情况
            isPalindrom(s, i, i);
            //针对回文子串的长度为偶数的情况
            isPalindrom(s, i, i+1);
        }

        return s.substring(start, start+maxLength);
    }

    private void isPalindrom(String s, int m, int n) {

        while (m >= 0 && n < s.length()&&s.charAt(m) == s.charAt(n)){
            m--;
            n++;
        }
        if (maxLength < n-m-1){
            start = m+1;
            maxLength = n-m-1;
        }

    }*/

    int maxLength = 0;
    String subs;
    public String longestPalindrome(String s){
        if (s.length() < 2) return s;

        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length();j++){
                String ss = s.substring(i,j+1);
                if (isPalindrom(s,i,j)){
                    if(ss.length() > maxLength){
                        maxLength = ss.length();
                        subs = ss;
                    }
                }
            }
        }
        return subs;
    }

    private boolean isPalindrom(String s, int i, int j) {
        while (j>=i){
            if (s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
