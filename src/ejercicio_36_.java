/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio_36_ {

	/**
	 * @param args
	 */
	// dibujar un cuadrado con * pidiendole al usuario el numero de * por lado. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el numero de filas :");
		numero=sc.nextInt();
		if(numero>=2) {
			for(int i=0;i<numero;i++ ) {
				System.out.print("* ");
			}
		}
		
	}
}


