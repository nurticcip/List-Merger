import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {

    // 1) Write a Java program that swaps two elements in an array list.
    public static void first(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        for(String i: arr){
            System.out.println(i);
        }

        Collections.swap(arr, 0, 2);

        for(String j: arr){
            System.out.println(j);
        }
    }

    // 2) Write a Java program to join two array lists.
    public static void second(String[]args){
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("nurti");
        arr1.add("altyn");
        arr1.add("jumu");
        arr1.add("aiat");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("adina");
        arr2.add("jaina");
        arr2.add("sumaia");
        arr2.add("nazima");

        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(arr1);
        arr.addAll(arr2);
    }

    // 3 Write a Java program to print all the elements of an ArrayList using the elements' position.
    public static void third(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        int e = arr.size();
        for (int i = 0; i < e; i++){
            System.out.println(arr.get(i));
        }
    }

    // 4 Write a Java program for trimming the capacity of an array list.
    public static void fourth(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");
        arr.trimToSize();
        System.out.println(arr);
    }

    // 5 Write a Java program to replace the second element of an ArrayList with the specified element.
    public static void fifth(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        String name = "emil";
        arr.set(1, name);

        int num = arr.size();
        for (int i = 0; i < num; i++) {
            System.out.println(arr.get(i));
        }
    }

    // 6 Write a Java program to reverse elements in an array list.
    public static void sixth(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nurti");
        arr.add("altyn");
        arr.add("jumu");
        arr.add("aiat");

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
