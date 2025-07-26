

public class Palindrome {

    public static void  main(String ab[]){
        System.out.println(Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        char[] arr = s.toCharArray();
        System.out.println(arr.length);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1-i; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                } else {
                    System.out.println(i+" and "+j);
                    System.out.println(arr[i]+" and "+arr[j]);
                    return false;
                }
            }
        }
        System.out.println(count);
        if (count == arr.length)
            return true;
        else
            return false;
    }
}
