package homework;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T> {

    private Object[] array;
    private int countElements;

    public ArrayList() {
        this.array = new Object[0];
        this.countElements = 0;
    }

    public ArrayList(int capacity) {
        this.array = new Object[capacity];
        this.countElements = 0;
    }

    public void add(T element) {
        if (array.length == 0) {
            this.array = new Object[10];
        }

        if (countElements == array.length) {
            array = Arrays.copyOf(array, array.length * 3 / 2 + 1);
        }

        array[countElements] = element;
        countElements++;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        int iter = 0;

        @Override
        public boolean hasNext() {
            return iter != countElements;
        }

        @Override
        public T next() {
            if (hasNext()) {
                iter++;
                return (T) array[iter - 1];
            }
            throw new NoSuchElementException();
        }
    }
}
