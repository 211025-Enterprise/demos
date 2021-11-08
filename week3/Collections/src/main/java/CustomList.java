import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomList<T> implements Iterable<T>{

    private int size;
    private T[] arrayList;


    public CustomList(T[] arrayList) {
        this.arrayList = arrayList;
        this.size = arrayList.length;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {

            int currentIndex = 0;

            @Override
            public boolean hasNext() { // checks if there is a next value in the array
                return currentIndex < size && arrayList[currentIndex] != null;
                // if within the bounds && current is not null
            }

            @Override
            public T next() { // returns the next value
                return arrayList[currentIndex++];
            }
        };
        return iterator;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
