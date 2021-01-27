/**
 * 
 */
package UT620;

import java.util.Random;
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class examen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j=0;
		int aux;
		int libre;
		int cerrada;
		int [] taquilla= new int[10];
		
		Random aleatorio= new Random();
		
		for(int i=0;i<taquilla.length;i++) {
			taquilla[i]=j;
			aux=aleatorio.nextInt(2);
			taquilla[i]=aux;
				System.out.print(taquilla[i]+ " ");
		}
		System.out.println(" "); {
			
		}
		
		
		

	}

}
