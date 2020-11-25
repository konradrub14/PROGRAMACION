/**
 * 
 */
package NEWPACKAGE;
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio_66 {

	/**
	 * @param args
	 */
	// Cargar un array con 10 numeros que introduzca el usuario y comprobar si alguno de esos numeros se repite. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero[];
		numero=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Escribe un numero");
			numero[1]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j!=i) {
					if(numero[j]==numero[i]) {
						 System.out.printf("%d y %d estos numero se repite\n",numero[j],numero[i]); 

                    }else { 

                        System.out.printf("%d y %d estos numero no se repite\n",numero[j],numero[i]); 

                    	
					}
				}
			}
		}
	}

}
