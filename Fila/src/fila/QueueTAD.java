/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author 17120069
 * @param <E>
 */
public interface QueueTAD<E> {
    
public int size();
public boolean isEmpty();
public E getHead() throws EmptyQueueException;
public void enqueue(E element);
public E dequeue() throws EmptyQueueException;
    
}
