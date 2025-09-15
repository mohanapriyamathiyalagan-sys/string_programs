package practiceJavaPrograms;

import java.util.Map;
import java.util.TreeMap;

public class AnagramsChecker {

   public boolean anagramChecker(String word1, String word2) {

       Map<Character, Integer> map1 = buildFrequencyMap(word1);
       System.out.println("1. "+map1);
       Map<Character, Integer> map2 = buildFrequencyMap(word2);
       System.out.println("2. "+map2);
       boolean result = map1.equals(map2);
       System.out.println(result);
       return result;
   }

    public Map<Character, Integer> buildFrequencyMap(String word){

        Map<Character,Integer> map = new TreeMap<>();

        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        return map;

    }

}
