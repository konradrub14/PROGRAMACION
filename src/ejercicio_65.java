/**
 * 
 */

/**
 * @author konrad
 *
 */
import java.util.Scanner;

public class ejercicio_65 {

	/**
	 * @param args
	 */
	//Leer por teclado una serie de 10 n�meros enteros. La aplicaci�n 

//debe indicarnos si los n�meros est�n ordenados de forma creciente,  

//decreciente, o si est�n desordenados. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean creciente=false;
		 boolean decreciente=false;
		 int numeros[];
		 numeros=new int[10];
		 int i;
		 
		Scanner sc= new Scanner(System.in);
		// leemos los n�meros 

        System.out.println("Introduce el numero"); 

    for (i=0;i<10;i++){ 

        System.out.print( +i); 

        numeros[i]= sc.nextInt(); 

    } 



    // comprobamos el orden 

    for (i=0;i<9;i++) // usamos i e i+1, por lo que la i solo podr� llegar hasta 8 o < 9 

    { 

        if (numeros[i] > numeros[i+1]) //  es decreciente 

            decreciente = true; 

        if (numeros[i] < numeros[i+1]) // es creciente 

            creciente = true; 

    } 

    // dependiendo de los valores daremos un tipo de orden 

    if (creciente ==true && decreciente ==false) //toda l est�n en orden creciente 

        System.out.println("Serie creciente."); 

    if (creciente ==false && decreciente ==true) // todas  est�n en orden decreciente 

        System.out.println("Serie decreciente."); 

    if (creciente ==true && decreciente ==true) //  ha tenido momentos creciente y decrecientes 

        System.out.println("Serie desordenada."); 

    if (creciente ==false && decreciente ==false) // son todos iguales 

        System.out.println("Todos los n�meros iguales.");  

    
		
	}

}
