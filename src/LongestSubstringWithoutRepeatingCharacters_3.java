import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    /**
     * 这里主要解决的是求一个字符串的最大长度子串，且不包含重复的字母
     * @param s
     */
    public int lengthOfLongestSubstring(String s){
/*        if (s == null || s.length() == 0) return 0;
       //存储字符和对应位置的map
        HashMap<Character, Integer> character = new HashMap();
        //初始化最长子串的长度
        int max = 0;

        for (int i = 0, j= 0; i < s.length(); i++){
            if (character.containsKey(s.charAt(i))){
                //移动j的位置到上个相同字符的右边一个位置
                  j = Math.max(j, character.get(s.charAt(i))+1);
            }
            //将现在的字符放入hashmap中
            character.put(s.charAt(i), i);
            //更新现在最长子串的长度
            max = Math.max(max, i-j+1);
        }
        return max;*/

        if (s == null || s.length()==0) return 0;

        HashSet<Character> set = new HashSet();
        int max = 0;
        for (int i = 0, j=0; j < s.length(); j++){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            }else {
                set.remove(s.charAt(i++));
            }
            max  = Math.max(max, set.size());
        }
        return max;
    }
}
