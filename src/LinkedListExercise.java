import java.util.*;

public class LinkedListExercise {
    // 1 Write a Java program to retrieve, but not remove, the first element of a linked list.
    public static void first(String[] args){
        LinkedList<String> arr = new LinkedList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        if (!arr.isEmpty()){
            String first = arr.getFirst();
            System.out.println(first);
        }
    }

    // 2 Write a Java program to replace an element in a linked list.
    public static void second(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        arr.set(1, "emil");

        System.out.println(arr);
    }

    // 3 Write a Java program that swaps two elements in a linked list.
    public static void third(String[] args){
        LinkedList<String> arr = new LinkedList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        Collections.swap(arr, 0 , 2);

        System.out.println(arr);
    }

    // 4 Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    public static void fourth(String[] args){
        LinkedList<String> arr = new LinkedList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        Object first = arr.getFirst();
        Object last = arr.getLast();

        System.out.println("First Element is: " + first);
        System.out.println("Last Element is: " + last);

    }

    // 5 Write a Java program to display elements and their positions in a linked list.
    public static void fifth(String[] args){
        LinkedList<String> arr = new LinkedList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i + ": " + arr.get(i));
        }
    }

    // 6 Write a Java program to remove a specified element from a linked list.
    public static void sixth(String[] args){
        LinkedList<String> arr = new LinkedList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        arr.remove(2);
        System.out.println(arr);
    }
}
