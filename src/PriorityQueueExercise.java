import java.util.*;

public class PriorityQueueExercise {
    // 1 Write a Java program to count the number of elements in a priority queue.
    public static void first(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("nurti");
        pq.add("altyn");
        pq.add("jumu");
        pq.add("aiat");

        System.out.println(pq.size());
    }

    // 2 Write a Java program to compare two priority queues.
    public static void second(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("nurti");
        pq1.add("altyn");
        pq1.add("jumu");
        pq1.add("aiat");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("adina");
        pq2.add("jaina");
        pq2.add("sumaia");
        pq2.add("nazima");

        for(String el:pq1){
            System.out.println(pq2.contains(el) ? "Yes" : "No");
        }
    }

    // 3 Write a Java program to compare two priority queues.
    public static void third(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("nurti");
        pq1.add("altyn");
        pq1.add("jumu");
        pq1.add("aiat");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("adina");
        pq2.add("jaina");
        pq2.add("sumaia");
        pq2.add("nazima");

        for(String el:pq1){
            System.out.println(pq2.contains(el) ? "Yes" : "No");
        }
    }

    // 4 Write a Java program to retrieve the first element of the priority queue.
    public static void fourth(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);

        System.out.println(pq1.peek());
    }

    // 5 Write a Java program to retrieve and remove the first element.
    public static void fifth(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);

        System.out.println(pq1.poll());
        System.out.println(pq1);
    }

    // 6 Write a Java program to convert a priority queue to an array containing all its elements.
    public static void sixth(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);

        String[] arr = pq1.toArray(new String[0]);
        for (String el: arr){
            System.out.println(el);
        }
    }
}
