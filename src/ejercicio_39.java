/**
 * 
 */
import java.util.Scanner;
/**
 * @author konrad
 *
 */
//Pedir al usuario un numero y mostrar por pantalla un triangulo de asteriscos hasta llegar a la altura que ha dicho el usuario: 
public class ejercicio_39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int numero=sc.nextInt();
		sc.close();
			System.out.println();
		for(int altura=1;altura<=numero;altura++) {
			//Espacios en blanco
			for(int blancos=1;blancos<=numero-altura;blancos++) {
				System.out.print(" ");
			}
			//Asteriscos
			for(int asteriscos=1;asteriscos<=(altura*2)-1;asteriscos++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
