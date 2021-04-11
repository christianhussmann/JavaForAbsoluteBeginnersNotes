package schoolNotes.iteratorPattern;

public class MainClassForIterator {
    public static void main(String[] args) {
        Integer[] intArr = {5, 4, 6, 5, 2, 13};
        IterableCollection arr = new MyArray(intArr);
        printArray(arr);
    }

    public static void printArray(IterableCollection collection) {
        IMyIterator mi = collection.createIterator();

        while (mi.hasMore()) {
            System.out.println(mi.getNext());
        }

    }
}

