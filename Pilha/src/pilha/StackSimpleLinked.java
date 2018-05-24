/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.EmptyStackException;

/**
 *
 * @author 17120069
 */
import java.util.LinkedList;
public class StackSimpleLinked<E> implements StackTAD<E> {
    
    StackSimpleLinked<E> lista = new StackSimpleLinked<>();

    @Override
    public int size() {
        
       return lista.size();
        
    }

    @Override
    public boolean isEmpty() {
        
        return lista.isEmpty();
    }

    @Override
    public E top() throws EmptyStackException {
        
       return  lista.top();
    }

    @Override
    public void push(E element) {
        
        lista.push(element);
    }

    @Override
    public E pop() throws EmptyStackException {
        
       return  lista.pop();
        
    }
    
}
