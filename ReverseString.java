public class ReverseString {
    public static void main(String[] args) {
        String str = "Hari";
        StringBuilder sb = new StringBuilder();
        int len = str.length()-1;
        while(len>=0){
            sb.append(str.charAt(len));
            len--;
        }
        System.out.println(sb);
    }
}
