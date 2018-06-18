package aed;

public class ListSimpleLinked<E> implements ListTAD<E> {

    private Node<E> prim;
    private Node<E> ult;
    private int totalElementos;

    private class Node<E> {
        public E element;
        public Node<E> next;

        public Node(E e) {
            element = e;
            next = null;
        }
    }
    // Construtor
    public ListSimpleLinked() {
        clear();
    }

    @Override
    public void add(E e) {
        Node<E> novo = new Node<>(e);
        if (isEmpty()) {
            prim = novo;
        } else {
            ult.next = novo;
        }
        ult = novo;
        totalElementos++;
    }

    @Override
    public void add(int index, E element) {

        if (index < 0 || index > totalElementos)
            throw new IllegalArgumentException("Indice invalido: " + index);

        Node<E> novo = new Node<>(element);

        if (isEmpty()) {
            prim = novo;
            ult = novo;
        } else if (index == 0) {
            novo.next = prim;
            prim = novo;
        } else {
            Node<E> ant = prim;
            Node<E> target;
            for (int i = 0; i < index - 1; i++) {
                ant = ant.next;
            }
            target = ant.next;
            ant.next = novo;
            novo.next = target;
            if (target == null) {
                ult = novo;
            }
        }
        totalElementos++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= totalElementos)
            throw new IllegalArgumentException("Indice invalido: " + index);

        Node<E> n = prim;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }

        return n.element;
    }

    @Override
    public int indexOf(E e) {
        Node<E> n = prim;
        int c = 0;
        while (n != null) {
            if (e.equals(n.element))
                return c;
            c = c + 1;
            n = n.next;
        }
        return -1;
    }

    @Override
    public void set(int index, E element) {
        if (index < 0 || index >= totalElementos)
            throw new IllegalArgumentException("Indice invalido: " + index);

        Node<E> n = prim;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }

        n.element = element;

    }

    public boolean removeLast() {
        if(isEmpty()) return false;

        if(size() ==1){
            clear();
        }else {

            Node<E> nodo = prim;

            while (nodo.next != null) {


                if (nodo.next.next == null) {

                    ult = nodo;
                    ult.next = null;
                    totalElementos--;
                    return true;
                }

                nodo = nodo.next;
            }
        }
        return true;
    }
    @Override
    public boolean remove(E e) {
        return remove(indexOf(e)) != null;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= totalElementos)
            throw new IllegalArgumentException("Indice invalido: " + index);

        E elemento;

        if (prim == ult) {
            elemento = prim.element;
            prim = ult = null;
        } else if (index == 0) {
            elemento = prim.element;
            prim = prim.next;
        } else {
            Node<E> ant = prim;
            Node<E> target;
            for (int i = 0; i < index - 1; i++) {
                ant = ant.next;
            }
            target = ant.next;
            elemento = target.element;
            if (target != null)
                target = target.next;
            ant.next = target;

            if (target == null)
                ult = ant;
        }
        totalElementos--;
        return elemento;
    }
    @Override
    public boolean removeFirst() {
        remove(0);
        return true;

    }

    @Override
    public boolean isEmpty() {
        return totalElementos == 0;
    }

    @Override
    public int size() {
        return totalElementos;
    }

    @Override
    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    @Override
    public void clear() {
        prim = null;
        ult = null;
        totalElementos = 0;
    }

    @Override
    public E getFirst() {

        Node<E> nodo = prim;
        return nodo.element;

    }
    @Override
    public E getLast() {

        Node<E> nodo = prim;

        while(nodo.next != null){

            nodo = nodo.next;
        }

        return nodo.element;
    }
    @Override
    public void addFirst(E e) {
        Node<E> novo = new Node<>(e);
        int index = 0;

        if (isEmpty()) {
            prim = novo;
            ult = novo;
        } else if (index == 0) {
            novo.next = prim;
            prim = novo;
        } else {
            Node<E> ant = prim;
            Node<E> target;
            for (int i = 0; i < index - 1; i++) {
                ant = ant.next;
            }
            target = ant.next;
            ant.next = novo;
            novo.next = target;
            if (target == null) {
                ult = novo;
            }
        }
        totalElementos++;
    }
}