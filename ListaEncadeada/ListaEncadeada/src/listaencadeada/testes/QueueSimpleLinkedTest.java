package aed;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueSimpleLinkedTest {
    QueueSimpleLinked<Integer> fila = new QueueSimpleLinked<>();
    @Test
    public void enqueue() {
        fila.enqueue(100);
        Integer in = 100;
        assertEquals(in,fila.first());
    }

    @Test
    public void dequeue() {
        fila.enqueue(100);
        fila.enqueue(200);
        fila.dequeue();
        Integer in = 200;
        assertEquals(in,fila.first());
    }

    @Test
    public void first() {
        fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);
        fila.enqueue(400);
        fila.dequeue();
        Integer in = 200;
        assertEquals(in,fila.first());
    }

    @Test
    public void isEmpty() {
        fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);
        fila.enqueue(400);
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        assertEquals(true,fila.isEmpty());
    }

    @Test
    public void size() {
        fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);
        fila.enqueue(400);
        fila.dequeue();
        fila.dequeue();
        assertEquals(2,fila.size());
    }
}