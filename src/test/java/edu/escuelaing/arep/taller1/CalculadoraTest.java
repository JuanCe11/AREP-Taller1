package edu.escuelaing.arep.taller1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
{
	
	@Test
	public void deberiaCalcularMedia() {
		
		ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("ejemplo.txt");
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
			
			ln_nodo.setValor(lda_valores[i]);
			lle_lista.add(ln_nodo);
		}
		
		assertTrue(Calculadora.media(lle_lista) == (double)638.9);
		
	}
	
	@Test
	public void deberiaCalcularMediaEstimateProxySize() {
		
		ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("proxy.txt");
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
			
			ln_nodo.setValor(lda_valores[i]);
			lle_lista.add(ln_nodo);
		}
		
		assertTrue(Calculadora.media(lle_lista) == (double)550.6);
		
	}
	
	@Test
	public void deberiaCalcularMediaDevelopmentHours() {
		
		ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("development.txt");	
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
			
			ln_nodo.setValor(lda_valores[i]);
			lle_lista.add(ln_nodo);
		}
		
		{
			double ld_respuesta;
			
			ld_respuesta = Calculadora.media(lle_lista);
			ld_respuesta = (double) Math.round(ld_respuesta * 100) / 100;
					
			assertTrue(ld_respuesta == (double)60.32);
		}
		
	}
	
	@Test
	public void deberiaCalcularDesviacion() {
		
		ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("ejemplo.txt");
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
			
			ln_nodo.setValor(lda_valores[i]);
			lle_lista.add(ln_nodo);
		}
		{
			double ld_respuesta;
			
			ld_respuesta = Calculadora.desviacionEstandar(lle_lista);
			ld_respuesta = (double) Math.round(ld_respuesta * 1000000) / 1000000;
			
			assertTrue(ld_respuesta == (double)625.633981);
		}
		
		
	}
	
	@Test
	public void deberiaCalcularDesviacionEstimateProxySize() {
		
		ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("proxy.txt");
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
			
			ln_nodo.setValor(lda_valores[i]);
			lle_lista.add(ln_nodo);
		}
		{
			double ld_respuesta;
			
			ld_respuesta = Calculadora.desviacionEstandar(lle_lista);
			ld_respuesta = (double) Math.round(ld_respuesta * 100) / 100;
			
			assertTrue(ld_respuesta == (double)572.03);
		}
		
		
	}
	
	@Test
	public void deberiaCalcularDesviacionDevelopmentHours() {
		
		ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("development.txt");	
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
			
			ln_nodo.setValor(lda_valores[i]);
			lle_lista.add(ln_nodo);
		}
		
		{
			double ld_respuesta;
			
			ld_respuesta = Calculadora.desviacionEstandar(lle_lista);
			ld_respuesta = (double) Math.round(ld_respuesta * 100) / 100;
					
			assertTrue(ld_respuesta == (double)62.26);
		}
		
	}

}