package aed;

public class StackSimpleLinked<T> implements StackTAD<T> {
    ListSimpleLinked<T> lst = new ListSimpleLinked<>();

    @Override
    public void push(T d) {
        lst.add(d);
    }

    @Override
    public T pop() {
        if(lst.isEmpty()){ throw new NullPointerException(); }

        T aux = lst.getLast();

        lst.removeLast();

        return aux;
    }

    @Override
    public T top() {
        if(lst.isEmpty()){ throw new NullPointerException(); }

        return lst.getLast();
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
