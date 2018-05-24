/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fila;

/**
 *
 * @author 17120069
 */
import java.util.LinkedList;
public class QueueSimpleLinked<E> implements QueueTAD<E> {
    
    QueueSimpleLinked<E> lista = new QueueSimpleLinked<>();

    @Override
    public int size() {
        
       return  lista.size();
 
    }

    @Override
    public boolean isEmpty() {
        
        return lista.isEmpty();
    }

    @Override
    public E getHead() throws EmptyQueueException {
        
        return lista.getHead();
        
    }

    @Override
    public void enqueue(E element) {
        
        lista.enqueue(element);
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        
             
        return lista.dequeue();
            
    }
                       
}
