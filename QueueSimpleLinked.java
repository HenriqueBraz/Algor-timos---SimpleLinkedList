package aed;

public class QueueSimpleLinked<T> implements QueueTAD<T> {
    ListSimpleLinked<T> lst = new ListSimpleLinked<>();
    @Override
    public void enqueue(T d) {
        lst.add(d);
    }

    @Override
    public T dequeue() {

        T aux = lst.getFirst();
        lst.removeFirst();
        return aux;
    }

    @Override
    public T first() {
        return lst.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return lst.isEmpty();
    }

    @Override
    public int size() {
        return lst.size();
    }
}
