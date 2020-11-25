/**
 * 
 */
import java.util.Scanner;
/**

 * @author konrad
 *
 */
public class ejercicio_71 {

	/**
	 * @param args
	 */
	//Crear y cargar dos matrices de tamaño 3x3, sumarlas en un tercer array y mostrarlo. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [][]tabla=new int[3][3];
		int a[][];
		int b[][];
		int suma[][];
		
		a=new int [3][3];
		b=new int[3][3];
		
		//Leemos los datos
		System.out.println("Matriz A");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				tabla[i][j]=i*j;
				
			}
		}
	}

}
