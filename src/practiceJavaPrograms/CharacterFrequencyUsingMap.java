package practiceJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyUsingMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "Mohanapriya";
        char[] charArray = str.toCharArray();
        for(int i =0;i<charArray.length;i++){
            map.put(charArray[i], map.getOrDefault(charArray[i],0)+1);
        }
        System.out.println(map);
    }
}
