package collectionsConcepts.set;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbersUsingSet {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,2,3,4};

        Set<Integer> set = new HashSet<>();
        for(int num: array){
            set.add(num);
        }

        System.out.println("Unique numbers are: ");
        for(int num : set){
            System.out.print(num+" ");
        }
    }
}
