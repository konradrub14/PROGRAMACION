/**
 * 
 */
import java.util.Scanner;
/**
 * @author konrad
 *
 */
public class ejercicio_semanal_5 {

	/**
	 * @param args
	 */
	//Se pide un programa que:
	//1.Pida las cartas de una mano, de una en una hasta 4 cartas como mucho. Para cada carta se pide número (del 1 al 13) y palo indicado con un carácter (P, picas, D, diamantes, T, tréboles, C, corazones).
	//2.Una vez tengamos la mano de 4 cartas, estudiarla y ver qué carta nos hace falta para conseguir una escalera de color. Devolverá número y palo de la carta necesaria. 
	//3.Si no se puede conseguir escalera de color devolvemos un mensaje.
	//Una vez termina vuelve a preguntar por una nueva mano de cartas. Para salir del programa debemos escribir un 0 en esa pregunta o bien usar una opción salir independiente.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int palo;
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("Introduce el numero :");
			numero=sc.nextInt();
			do {
				System.out.println("Introduce el palo de la baraja");
				palo=sc.nextInt();
			}while(numero!=0);
			
		}
	
		
	}

}
