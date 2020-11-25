/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
// Dibujar un cuadrado con * pidiendole al usuario el numero de * por lado, pero solo pintando los * pares en las lineas pares y los impares en las impares 
public class ejercicio_38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int filas;
		
		
		
		
		System.out.println("Introduce el número de filas : ");
		filas=sc.nextInt();
		
		for(int i=1; i<=filas;i++) {
			for(int j=1;j<=filas;j++) {
				if(i%2==0) {
					if(j%2==0) 
						System.out.print("* ");
					else
						System.out.print(" ");
				}
				else {
					if(j%2==0)
						System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
		sc.close();
		
	
	}

}
