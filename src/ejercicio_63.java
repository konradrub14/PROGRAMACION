/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
//Crear un array de enteros de 10 posiciones, pedir n�meros al usuario hasta rellenarlo. 

//Mostrar a continuaci�n la media de los n�meros dra el ar y y cu�l es el mayor y el menor. 
public class ejercicio_63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteros[];
		enteros=new int[10];
		int suma_numeros=0;
		int menor=0;
		int mayor=0;
		Scanner sc=new Scanner(System.in);
		
		//CREAMOS BUCLE PARA QUE RECORRA EL ARRAY Y COMPLETARLO CON LUS N�MEROS INTRODUCIDOS POR EL USUARIO
		for(int i =0;i<enteros.length;i++) {
			System.out.println("Introduce el n�mero de la posici�n:"+i);
			enteros[i]=sc.nextInt();
		}
		for(int j =0;j<enteros.length;j++) {
		suma_numeros=suma_numeros+enteros[j];
		if(j==0) {
			menor=enteros[j];
			mayor=enteros[j];
		}
		if(enteros[j]<menor) {
			menor=enteros[j];
		}
		if(enteros[j]>mayor) {
			mayor=enteros[j];
		}
		System.out.println("La media de los numeros es :"+suma_numeros/10);
		
		System.out.println("El menor n�mero es :"+menor);
		
		System.out.println("El n�mero mayor es :"+mayor);
		
		}

	}

}
