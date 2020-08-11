package edu.escuelaing.arep.taller1;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ListaEncadenada lle_lista = new ListaEncadenada();
    	    	
    	lle_lista.add(1);
    	lle_lista.add(2);
    	
    	for (Node e : lle_lista) {
    		System.out.println(e.getValor());
    	}
    }
}
