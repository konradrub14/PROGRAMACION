/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio_70 {

	/**
	 * @param args
	 */
	//Crear y mostrar un array bidimensional de 10 x 10. En cada posición se guardará (fila*columna).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]tabla= new int [10][10];
	
		//Rellenar matriz
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				tabla[i][j]=i*j;
			}
		}
		
		//Pintar matriz
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.print(tabla[i][j]+ " ");
			}
			System.out.print("\n");
		}
		
	}
}