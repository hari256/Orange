import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        lengthOfLongestSubstring("adcbabca");
    }

    public static int lengthOfLongestSubstring(String s) {
        int start =0, end =0;
        int max=0;
        Set<Character> set = new HashSet<>();
        while(end<s.length()){
            char c = s.charAt(end);
            if(!set.contains(c)){
                set.add(c);
                max = Math.max(max, end-start+1);
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
