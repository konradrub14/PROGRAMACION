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
	// Escribe un programa que pida un n�mero y luego muestre en pantalla todos los n�meros pares que hay entre 0 y el n�mero solicitado. 

	 
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
