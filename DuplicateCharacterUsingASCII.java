import java.lang.reflect.Array;

public class DuplicateCharacterUsingASCII {
    public  static  boolean hasRepeatedCharacter(String str){
        boolean[] charASCII = new boolean[256];
        return str.chars().anyMatch((charValue) ->{
            if(charASCII[charValue])
                return true;
            charASCII[charValue] = true;
            return  false;
        });
    }
    public static void main(String args[]){
        System.out.println(DuplicateCharacterUsingASCII.hasRepeatedCharacter("Harii"));
    }

}
