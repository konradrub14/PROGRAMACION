/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio_24 {

	/**
	 * @param args
	 */
	// Pedir números al usuario hasta que introduzca un 0. Sumar en un acumulador solo aquellos que sean pares.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int suma=0;
		int numero=0;
		int contador_numeros=0;
		
		do {
			contador_numeros++;
			System.out.println("Introduce números:");
			numero=entrada.nextInt();
			if(numero%2==0) {
				suma=suma+numero;
			}
			
		}while(numero!=0);
		System.out.println("FIN");
		System.out.println("La suma de los numeros pares es"+suma);
		
		}
	}


