package aed;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackSimpleLinkedTest {
    StackSimpleLinked<Integer> pilha = new StackSimpleLinked<>();

    @Test
    public void push() {
        pilha.push(100);
        pilha.push(200);
        pilha.push(300);
        pilha.push(400);
        assertEquals(4,pilha.size());
    }

    @Test
    public void pop() {
        pilha.push(100);
        pilha.push(200);
        pilha.push(300);
        pilha.push(400);
        pilha.pop();
        pilha.pop();
        Integer in = 200;
        assertEquals(in,pilha.top());
    }

    @Test
    public void top() {
        pilha.push(100);
        pilha.push(200);
        pilha.push(300);
        pilha.push(400);
        pilha.pop();
        pilha.pop();
        Integer in = 200;
        assertEquals(in,pilha.top());
    }

    @Test
    public void isEmpty() {
        pilha.push(100);
        pilha.push(200);
        pilha.push(300);
        pilha.push(400);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        assertEquals(0,pilha.size());
    }

    @Test
    public void size() {
        pilha.push(100);
        pilha.push(200);
        pilha.push(300);
        pilha.push(400);
        pilha.push(500);
        pilha.push(600);
        pilha.push(700);
        pilha.push(800);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        assertEquals(4,pilha.size());
    }
}