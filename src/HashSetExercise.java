import java.util.*;

public class HashSetExercise {
    // 1 Write a Java program to clone a hash set to another hash set.
    public static void first(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("nurti");
        set.add("altyn");
        set.add("jumu");
        set.add("aiat");

        HashSet<String> new_set = (HashSet<String>) set.clone();
        System.out.println(new_set);
    }

    // 2 Write a Java program to convert a hash set to an array.
    public static void second(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("nurti");
        set.add("altyn");
        set.add("jumu");
        set.add("aiat");

        String[] arr = set.toArray(new String[0]);
        for (String el: arr){
            System.out.println(el);
        }
    }

    // 3 Write a Java program to convert a hash set to a tree set.
    public static void third(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("nurti");
        set.add("altyn");
        set.add("jumu");
        set.add("aiat");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
    }

    // 4 Write a Java program to convert a hash set to a List/ArrayList.
    public static void fourth(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("nurti");
        set.add("altyn");
        set.add("jumu");
        set.add("aiat");

        ArrayList<String> arr = new ArrayList<>(set);
        System.out.println(arr);
    }

    // 5 Write a Java program to compare two hash sets.
    public static void fifth(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("nurti");
        set.add("altyn");
        set.add("jumu");
        set.add("aiat");

        HashSet<String> set2 = new HashSet<>();
        set2.add("adina");
        set2.add("jaina");
        set2.add("sumaia");
        set2.add("nazima");

        for (String el: set){
            System.out.println(set2.contains(el) ? "Yes" : "No");
        }
    }

    // 6 Write a Java program to remove all elements from a hash set.
    public static void sixth(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("nurti");
        set.add("altyn");
        set.add("jumu");
        set.add("aiat");

        set.clear();

        System.out.println(set);
    }
}
