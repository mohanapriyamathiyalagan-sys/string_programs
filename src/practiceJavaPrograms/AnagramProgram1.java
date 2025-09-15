package practiceJavaPrograms;

import java.util.Map;
import java.util.TreeMap;

public class AnagramProgram1 {
    public boolean AnagramCheck(String str1, String str2){
        Map<Character, Integer> map1 = buildFrequencyMap(str1);
        Map<Character, Integer> map2 = buildFrequencyMap(str2);
        return map1.equals(map2);



    }

    public Map<Character, Integer> buildFrequencyMap(String word){
        Map<Character, Integer> map = new TreeMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        return map;

    }

}
