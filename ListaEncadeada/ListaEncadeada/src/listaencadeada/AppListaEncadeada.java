/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;




/**
 
 * @author 17120069
 */
public class AppListaEncadeada {
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListSimpleLinked<Integer> lista = new ListSimpleLinked<Integer>();
        
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        lista.add(600);
        lista.add(700);
        lista.add(800);
        lista.add(900);
        lista.add(1000);
        
        System.out.println(lista.size());
        System.out.println(lista.removeFirst());
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        lista.clear();
        System.out.println(lista.isEmpty());
        
        
        
        System.out.println(lista.contains(100));
        System.out.println(lista.contains(200));
        
        lista.add(100);
        System.out.println(lista.contains(100));
        
        

    }
    
}
