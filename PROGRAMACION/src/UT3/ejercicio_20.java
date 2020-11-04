/**
 * 
 */
package UT3;
import java.util.Scanner; 
/**
 * @author konrad
 *
 */
public class ejercicio_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); 

        int numero = 1; 

        int suma = 0; 
        
        int media;
        

        while (numero != 0) { 

            numero = sc.nextInt(); 

            suma = suma + numero; 
           
        } 
        
        System.out.println("El resultado de la suma de los numeros es: " + suma);     
        media=suma/numero;
        System.out.println("La media de los numeros es de :" + media);

         

	}
} 
	


