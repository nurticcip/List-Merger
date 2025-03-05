import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        //ArrayList
        /*ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(5);
        arraylist.add(10);
        arraylist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for(int i=0; i<arraylist.size();i++){
            if(arraylist.get(i) %2 == 0){
                arraylist.remove(i);
            }
        }
        arraylist.set(0,-1);
        arraylist.add(3,100);
        arraylist.addLast(-1);
        ArrayList<Integer> arraylist2 = new ArrayList<>(Arrays.asList(200,300,400));
        arraylist.remove(Integer.valueOf(-1));
        arraylist.addAll(arraylist2);
        System.out.println(arraylist);

         */

        //LinkedList
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("name","surname","zipcode"));
        ll.add("address");
        ll.offer("city");
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.pop());
        System.out.println(ll);

        System.out.println("using iterator");
        Iterator<String> iterator = ll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ll.add(1,"email");
        ll.remove(ll.size()-2);
        ll.remove("zipcode");
        System.out.println(ll);

    }
}
