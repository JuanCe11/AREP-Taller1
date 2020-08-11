package edu.escuelaing.arep.taller1;

/**
 * Clase demo de la aplicación
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ListaEncadenada lle_lista;
		double[] lda_valores;
		
		lle_lista = new ListaEncadenada();		
		lda_valores = LectorArchivos.leerArchivo("proxy.txt");
		
		System.out.println("Ejemplo del archivo proxy.txt\n Valores ");
		
		for (int i = 0; i < lda_valores.length; i++) 
		{
			Node ln_nodo;
			
			ln_nodo = new Node();
	
			ln_nodo.setValor(lda_valores[i]);
			System.out.println(i+1+". "+ln_nodo.getValor());
			lle_lista.add(ln_nodo);
		}
		
		System.out.println("Valor de la media: "+Calculadora.media(lle_lista));
		System.out.println("Valor de la desviación estandar: "+Calculadora.desviacionEstandar(lle_lista));
    }
}
