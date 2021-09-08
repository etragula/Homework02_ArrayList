package homework;

public class LinkedList<T> implements List<T> {

    public static class Node<V> {
        V value;
        Node<V> next;

        public Node(V value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;

    private int count;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (count == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        count++;
    }

    @Override
    public T get(int index) {

        Node<T> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {

        Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.value;

            current = current.next;

            return value;
        }
    }
}
