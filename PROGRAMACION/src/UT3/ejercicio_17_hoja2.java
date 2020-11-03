/**
 * 
 */
package UT3;
import java.util.Scanner; 

/**
 * @author konrad
 *
 */
public class ejercicio_17_hoja2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int aux;
		
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
			System.out.println("Escribe un numero inicial");
			int start = entrada.nextInt();
			System.out.println("Escribe numero final");
			int stop= entrada.nextInt();
			System.out.println("Escribe un intervalo");
			int intervalo = entrada.nextInt();
			
			if(stop<start) {
				aux=stop;
				stop= start;
				start = aux;
			}
			
		for(int i= start; i<stop; i=i+ intervalo) {
			System.out.print(i + " ");
		}
		

	}

}
