/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio_21_hoja2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in); 
	     int numero=1;
	     int suma=0;
	     int media;
	    
	     System.out.println("Introduce varios numeros y a continuación acabe puslasando 0");	
	     while(numero!= 0) {
	    	 numero=sc.nextInt();
	    	 suma=suma+numero;	
		    }
	     System.out.println("El resultado de la suma de los numeros es de "+ suma);
	     
	     
     }
	
}
