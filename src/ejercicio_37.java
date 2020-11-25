/**
 * 
 */
import java.util.Scanner;
/**

 * @author konrad
 *
 */
//Dibujar un rectángulo con * pidiéndole al usuario el numero de columnas y de filas 
public class ejercicio_37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int filas;
		int columnas;
		
		
		
		System.out.println("Introduce el número de filas : ");
		filas=sc.nextInt();
		System.out.println("Introduce el numero de colums :");
		columnas=sc.nextInt();
		
		for(int i=1; i<=filas;i++) {
			for(int j=1;j<=columnas;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		sc.close();
	}

}
