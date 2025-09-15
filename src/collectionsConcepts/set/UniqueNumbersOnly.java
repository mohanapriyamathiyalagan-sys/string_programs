package collectionsConcepts.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNumbersOnly {
        public static void main(String[] args) {
            int[] arr = {3, 4, 4, 3, 5, 2};
            Set<Integer> unique = new LinkedHashSet<>();
            Set<Integer> duplicates = new HashSet<>();

            for(int num : arr){
                if(!unique.contains(num) && !duplicates.contains(num)){
                    unique.add(num);
                }
                else{
                    unique.remove(num);
                    duplicates.add(num);
                }
            }
            for(int num:unique){
                System.out.println("Unique elements are: "+num);
            }
        }
    }
