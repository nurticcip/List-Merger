import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> data;

    public Storage() {
        data = new ArrayList<>();
    }

    public void add(T item) {
        data.add(item);
    }

    public T get(int index) {
        if (index >= 0 && index < data.size()) {
            return data.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    public int count() {
        return data.size();
    }

    public void display() {
        System.out.println("Stored data: " + data);
    }

    public static <T> void displayElements(List<T> elements) {
        System.out.println("Elements in the list: " + elements);
    }

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        Storage<String> strStorage = new Storage<>();
        Storage<Double> floatStorage = new Storage<>();

        intStorage.add(5);
        intStorage.add(10);
        strStorage.add("Hello");
        strStorage.add("World");
        floatStorage.add(3.14);
        floatStorage.add(2.718);

        intStorage.display();
        strStorage.display();
        floatStorage.display();

        System.out.println("Element at index 1 in intStorage: " + intStorage.get(1));
        intStorage.remove(0);
        intStorage.display();

        System.out.println("Number of elements in floatStorage: " + floatStorage.count());

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Storage.displayElements(numbers);
    }
}
