/**
 * 
 */
package SEGUNDA_EVA;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author konrad
 *
 */
public class EJERCICIO_SEIS_SEMANAL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int salir=0;
		
		String palabra1="";
		String palabra2="";
		
		do {
		//PEDIMOS LAS DOS PALABRAS
		System.out.println("Introduce la primera palabra");
		palabra1=sc.nextLine().trim();
		
		System.out.println("Introduce la segunda palabra");
		palabra2=sc.nextLine().trim();
		
		//CREAMOS UNA CONDICIÓN
		if(palabra1.length()!=palabra2.length()) {
			System.out.println("No existe un ANAGRAMA");
		}else {
			//CREAMOS UN CHAR PARA ALMACENAR LOS DATOS
			char[]caracter1=palabra1.toCharArray();
			char[]caracter2=palabra2.toCharArray();
			
			Arrays.sort(caracter1);
			Arrays.sort(caracter2);
			
			//CREAMOS CONDICION IF, PARA QUE CUANDO AMBOS CARÁCTERES COINCIDAN, EL PROGRAMA DIGA QUE SÍ EXISTE UN ANAGRAMA.
		if(Arrays.equals(caracter1,caracter2)) {
				System.out.println("SÍ, EXISTE UN ANAGRAMA ENTRE AMBAS PALABRAS");
				
			}else {
				System.out.println("NO, NO EXISTE UN ANAGRAMA ENTRE ESTAS DOS PALABRAS");
			}
		}
		 System.out.println("Si desea empezar de nuevo pulse (0), si desea salir pulse(1)");
		 salir=sc.nextInt();
		 
       
		}while(salir==0);
        
	}
	
}
