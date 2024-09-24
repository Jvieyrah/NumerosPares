package com.trybe.acc.java.numerospares;

/**
 * Classe NumerosPares.
 * 
 */
public class NumerosPares {

  /**

   int[] array = criarArrayNumeros(4, 20);
   * 
   */
  public static void main(String[] args) {
	  int[] array = criarArrayNumeros(4, 20);
	  int size = array.length;
	  int[] numero = new int[size]; 
	  
	  for (int i = 0; i < size ; i++) {
		  if ( array[i] % 2 == 0) {
			  numero[i] = array[i];
			  imprime(numero[i]);
		  }
		  
	  }

  }

  /**
   * Método para imprimir no console os números de 4 a 20.
   * 
   */
  public static void imprime(int numero) {
    System.out.println(numero);
  }
  
  public static int[] criarArrayNumeros(int inicio, int fim) {
	    int tamanho = fim - inicio + 1;
	    int[] array = new int[tamanho];
	    
	    for (int i = 0; i < tamanho; i++ ) {
	        array[i] = inicio + i;
	    }
	    return array;
	}
  

}
