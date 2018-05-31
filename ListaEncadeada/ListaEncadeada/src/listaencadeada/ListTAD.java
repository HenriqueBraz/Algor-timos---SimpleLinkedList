/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author 17120069
 */
public interface ListTAD<E> {
    
public void add(E e);//----------------------------> ok
public void add (int index,E element);
public void clear();  //---------------------------> ok   
public boolean contains(E e);//--------------------> ok
public E get(int index);
public int indexOf (E e);
public boolean isEmpty();//------------------------> ok
public boolean remove(E e);//----------------------> ok
public E remove(int index);
public int size();//-------------------------------> ok
public E set(int index, E element);
public void addFirst(E e);
public E getFirst();//------------------------------> ok
public E getLast();//-------------------------------> ok
public boolean removeFirst();//---------------------> ok
public boolean removeLast();//----------------------> ok    
    
    
    
    
}
