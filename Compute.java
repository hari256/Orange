import java.util.*;
import java.util.stream.Collectors;

public class Compute {
    // compute - default method in java 8 -> new value for given key
    public static void main(String args[]) {
        String str[] = {"Apple", "Mango", "Apple"};
        Map<String, Integer> count = new HashMap<>();
        for (String fruit : str) {
            count.compute(fruit, (key, value) -> (value == null) ? 1 : value + 1);
        }
        System.out.println(count);

        //count each character
        String name = "Haslkasndasdn ahdghjs askjbfjk";
        char[] arr = name.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : arr) {
            charCount.compute(c, (key, value) -> {
                return value == null ? 1 : value + 1;
            });
        }
        System.out.println(charCount);


        //need to process only the name starts with A
        String names[] = {"Arman", "Ankit", "Xi", "Trumph"};

        List<String> nameList = new ArrayList<>();
        nameList = Arrays.stream(names).filter(a -> {
            return a.startsWith("A");
        }).toList();
        System.out.println("Name starts with A " + nameList);

        System.out.println("Name starts with A and appended singh " + Arrays.stream(names).filter(nm -> nm.startsWith("A")).map(nm -> {
            return nm + "Singh";
        }).toList());

        //merge function
        String testStr[] = {"Tamil", "English", "Tamil"};
        Map<String, Integer> testMap = new HashMap<>();
        for (String abc : testStr) {
            testMap.merge(abc, 1, Integer::sum);
        }
        System.out.println("TestMap -> " +testMap);


        //Arrays.stream(testStr).toList()
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : testStr){
            countMap.merge(s,1,Integer::sum);
        }
        int max =0;
        String ans = "";
        for (Map.Entry<String, Integer> ent: countMap.entrySet()){
                if(ent.getValue()>max) {
                    max = ent.getValue();
                ans = ent.getKey();
                }
        }
        System.out.println("Max count : "+ max); System.out.println("Max count key: "+ ans);

        countMap.entrySet().stream().max(Map.Entry.comparingByKey()).orElse(null);

        String[] cities = {"Delhi", "Mumbai", "Delhi", "Kolkata", "Mumbai", "Delhi"};

        // Stream processing to count occurrences
        Map<String, Long> cityCountMap = Arrays.stream(cities)
                .collect(Collectors.groupingBy(city -> city, Collectors.counting()));
    }
}
