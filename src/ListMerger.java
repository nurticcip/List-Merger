import java.util.*;

class ListMerger{
    public static <T> List <T> mergeList(List<T> list1, List<T> list2){
        List<T> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() || j < list2.size()){
            if (i < list1.size()) res.add(list1.get(i++));
            if (j < list2.size()) res.add(list2.get(j++));
        }
        return res;
    }
}

class MapPrinter{
    public static <K, V> void printMap(Map<K, V> map){
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

class Task implements Comparable<Task>{
    String taskName;
    int priority;
    int duration;

    public Task(String taskName, int priority, int duration){
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public int compareTo(Task other){
        if(this.priority != other.priority){
            return Integer.compare(other.priority, this.priority);
        }
        return Integer.compare(this.duration, other.duration);
    }

    public String toString(){
        return "[Priority " + priority + "] " + taskName + " Duration: " + duration + "mins)";
    }
}

class TaskScheduler{
    private PriorityQueue<Task> scheduledTasks = new PriorityQueue<>();
    private Queue<Task> pendingTasks = new LinkedList<>();

    public void addTaks(Task task){
        scheduledTasks.offer(task);
        System.out.println("Added: " + task);
    }

    public void processTask(){
        if (!scheduledTasks.isEmpty()){
            Task task = scheduledTasks.poll();
            System.out.println("Processing Task: " + task);
        } else if (!pendingTasks.isEmpty()) {
            Task task= pendingTasks.poll();
            System.out.println("Processing Pending Task: " + task);
        }else{
            System.out.println("No tasks to process.");
        }
    }

    public void delayTask(String taskName){
        Iterator<Task> iterator = scheduledTasks.iterator();
        while (iterator.hasNext()){
            Task task = iterator.next();
            if (task.taskName.equals(taskName)){
                iterator.remove();
                pendingTasks.offer(task);
                System.out.println("Delaying Task: " + taskName);
                return;
            }
        }
        System.out.println("Task not found: " + taskName);
    }

    public void showTasks(){
        System.out.println("\nScheduled Tasks:");
        for (Task task : scheduledTasks) System.out.println(task);
        System.out.println("\nPending Tasks:");
        for (Task task : pendingTasks) System.out.println(task);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        System.out.println("Merged List: " + ListMerger.mergeLists(list1, list2));


        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("A", 1);
        sampleMap.put("B", 2);
        sampleMap.put("C", 3);
        System.out.println("\nMap Content:");
        MapPrinter.printMap(sampleMap);

        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new Task("Programming Language", 3, 20));
        scheduler.addTask(new Task("English", 5, 45));
        scheduler.addTask(new Task("Computer Science", 2, 30));
        scheduler.addTask(new Task("Discrate Math", 5, 50));
        scheduler.addTask(new Task("Linear Algebra", 4, 25));

        scheduler.showTasks();
        scheduler.processTask();
        scheduler.delayTask("Programming Language");
        scheduler.showTasks();
        scheduler.delayTask("Computer Science");
        scheduler.showTasks();
        scheduler.processTask();
        scheduler.processTask();
        scheduler.processTask();
        scheduler.processTask();
        scheduler.processTask();
    }
}





