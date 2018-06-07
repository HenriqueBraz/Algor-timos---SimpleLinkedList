package aed;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListSimpleLinkedTest {

    ListSimpleLinked<Integer> lst = new ListSimpleLinked<>();
    @Test
    public void add() {
        lst.add(100);
        Integer n =100;
        assertEquals(true,lst.contains(n));
    }

    @Test
    public void get() {
        lst.add(100);
        Integer n =100;
        assertEquals(n,lst.get(0));
    }

    @Test
    public void indexOf() {
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeLast();
        lst.removeLast();

        Integer n = 300;

        assertEquals(2,lst.indexOf(n));
    }

    @Test
    public void set() {
        lst.add(100);
        lst.set(0,200);
        Integer n =200;
        assertEquals(n,lst.get(0));
    }

    @Test
    public void removeLast() {
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeLast();
        lst.removeLast();
        Integer n =300;
        assertEquals(n,lst.getLast());
    }

    @Test
    public void remove() {

        Integer n = 300;
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.remove(n);

        assertEquals(false,lst.contains(n));
    }

    @Test
    public void removeFirst() {
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeFirst();
        lst.removeFirst();
        Integer n =300;
        assertEquals(n,lst.getFirst());
    }

    @Test
    public void isEmpty() {
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeFirst();
        lst.removeLast();
        lst.remove(0);
        lst.remove(0);
        lst.remove(0);
        assertEquals(true,lst.isEmpty());
    }

    @Test
    public void size() {
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeFirst();
        lst.removeLast();
        lst.remove(0);
        lst.remove(0);
        lst.remove(0);
        assertEquals(0,lst.size());
    }

    @Test
    public void contains() {
        Integer n = 400;
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeFirst();
        lst.removeLast();
        lst.remove(0);
        lst.remove(0);
        assertEquals(true,lst.contains(n));
    }

    @Test
    public void clear() {
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.clear();
        assertEquals(true,lst.isEmpty());
    }

    @Test
    public void getFirst() {
        Integer n = 200;
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.remove(0);
        assertEquals(n,lst.getFirst());
    }

    @Test
    public void getLast() {
        Integer n = 400;
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.removeLast();
        assertEquals(n,lst.getLast());
    }

    @Test
    public void addFirst() {
        Integer n = 100;

        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        lst.add(600);
        lst.addFirst(100);
        assertEquals(n,lst.getFirst());
    }
}