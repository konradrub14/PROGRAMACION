/**
 * 
 */
import java.util.Scanner;
/**
 * @author konrad
 *
 */
public class ejercicio_23_ {

	/**
	 * @param args
	 */
	// Escribe un programa que pida un número y luego muestre en pantalla todos los números pares que hay entre 0 y el número solicitado. 

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero cualquiera : ");
		int numero= sc.nextInt();;
		
		for(int i=0; i<= numero;i++) {
			if(i%2 == 0) {
				
				System.out.println(i);
				
			
			
			}
		}
	
	}

}
