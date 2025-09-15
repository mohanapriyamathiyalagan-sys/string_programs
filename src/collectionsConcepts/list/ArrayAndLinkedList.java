package collectionsConcepts.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");

        System.out.println("Array List are: ");

        for(String str : list){
            System.out.println(str);
        }

        List<String> list1 = new LinkedList<>();
        list1.add("Watermelon");
        list1.add("Cucumber");

        System.out.println("Linked List are: ");

        for(String str1 : list1){
            System.out.println(str1);
        }
    }

}
/*Use ArrayList when:
You need fast random access (e.g., get(index))
Insertions/deletions are rare or at the end

Use LinkedList when:
You frequently insert/remove elements at the beginning or middle
You’re working with large lists and memory isn't a major constraint*/