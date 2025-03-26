import java.util.*;
public class TreeSetExercise {

    // 1 Write a Java program to get the element in a tree set which is greater than or equal to the given element.
    public static void firsth(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.ceiling(30));
    }

    // 2 Write a Java program to get the element in a tree set less than or equal to the given element.
    public static void second(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.floor(30));
    }

    // 3 Write a Java program to get an element in a tree set that has a lower value than the given element.
     public static void third(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);
            set.add(50);

            System.out.println(set.lower(30));
        }

    // 4 Write a Java program to retrieve and remove the first element of a tree set.
    public static void fourth(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.pollFirst());
    }

    // 5 Write a Java program to retrieve and remove the last element of a tree set.
    public static void fifth(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.pollLast());
    }

    // 6 Write a Java program to remove a given element from a tree set.
    public static void sixth(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.remove(40));
    }
}
