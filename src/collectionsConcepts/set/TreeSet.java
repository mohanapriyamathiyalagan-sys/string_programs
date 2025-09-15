package collectionsConcepts.set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.TreeSet<>();
        set.add(10);
        set.add(90);
        set.add(20);
        set.add(9);

        for(int num : set){
            System.out.println(num);
        }
    }
}
