/**
 * 
 */
import java.util.Scanner;
/**
 * @author konrad
 *
 */
public class ejercicio_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int numero; 

	        int multiplo; 

	        int contador=1; 

	        int base; 

	         

	        System.out.println("Escribe la base a calcular:"); 

	        Scanner scn=new Scanner(System.in); 

	        numero=scn.nextInt(); 

	        System.out.println("Escribe la potencia a calcular:"); 

	        multiplo=scn.nextInt(); 

	         

	        base=numero; 

	         

	        do { 

	            numero=numero*base; 

	            contador=contador+1; 

	        }while(contador!=multiplo); 

	         

	        System.out.printf("El calculo es %d",numero); 

	         

	        scn.close(); 

	}

}
