import java.util.HashSet;
import java.util.Set;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        //System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0, max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                area = height[left] * height[right];
                left++;
            } else if (height[left] > height[right]) {
                area = height[left] * height[right];
                right--;
            }
            if (area > max)
                max = area;
        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
        int end =0;
        int res=0, max=0;
        Set<Character> set = new HashSet<>();
        for(int start=0;start<s.length();start++){
            res=0;
            char c = s.charAt(end);
            while(!set.add(c)){
                res = set.size();
            }
            end++;
            if(res>max)
                max=res;
        }
        return max;
    }
}
