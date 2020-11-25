/**
 * 
 */
package NEWPACKAGE;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class semanal_poker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] lista= new int [4];
		int temporizador=0;
		boolean ordenar=true;
		
		System.out.println("");
		for(int i=0;i<4;i++) {
			System.out.println("Introduce un número" + (i+1)+ ":"+ " ");
			lista[i]=sc.nextInt();
		}
		for(int i=0;i<lista.length;i++) {
			if(i+1<lista.length) {
				if(lista[i]>lista[i+1] ) {
					ordenar=false;
					break;
				}
			}
		}
		if(ordenar) {
			System.out.println("La lista está ordenada");
		}else {
			System.out.println("La lista está desordenada");
		}
		for(int j=0;j<lista.length;j++) {
			for(int k=j+1;k<lista.length;k++) {
				if(lista[j]<lista[k]) {
					int aux=lista[j];
					lista[j]=lista[k];
					lista[k]=aux;
				}
			}
		}
	}

}
