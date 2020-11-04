/**
 * 
 */
package UT3;
import java.util.Scanner; 
/**
 * @author konrad
 *
 */
public class ejercicio_19_hoja2_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 

		System.out.println("Introduce numeros hasta llegar a 0: "); 

        int numero = 1; 

        int suma = 0; 

        while (numero != 0) { 

            numero = sc.nextInt(); 

            suma = suma + numero; 
              

        } 

        System.out.println("El resultado de la suma de los numeros es: " + suma);     

        sc.close(); 
	}
	

}
