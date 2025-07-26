import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber extends Object{
    public static void main(String[] arr){
        getAns();
    }
    public static void getAns(){
        Integer[] arr = {23, 5, 1, 23, 234, 233};
        List<Integer> ansList = Arrays.stream(arr).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(ansList.size());
        System.out.println(ansList);
        System.out.println(ansList.get(ansList.size() - 2));

        //used Skip and reverse order
        System.out.println(Arrays.stream(arr).sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }

}
