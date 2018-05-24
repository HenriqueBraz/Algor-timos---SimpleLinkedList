/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author 17120069
 */

import java.util.EmptyStackException;
public interface StackTAD<E> {   
public int size();
public boolean isEmpty();
public E top() throws EmptyStackException;
public void push(E element);
public E pop() throws EmptyStackException;
    
}

