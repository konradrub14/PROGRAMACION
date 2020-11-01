/**
 * 
 */
package UT3;
import java.util.Scanner; 
/**
 * @author konrad
 *
 */
public class ejercicio_15_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Datos 

	    Scanner sc = new Scanner(System.in); 

	    int dia; 

	    int mes; 

	    int año; 

	    int salir; 

	     

	    //Pido año,mes y dia 

	    do { 

	        System.out.println("Hola, por favor introduzca los numeros correspondientes a la fecha"); 

	        System.out.println("Inserte año"); 

	        año = sc.nextInt(); 

	         

	        System.out.println("Inserte mes"); 

	        mes = sc.nextInt(); 

	         

	        System.out.println("Inserte dia"); 

	        dia = sc.nextInt(); 

	         

	        //condicional entre 1000 y 3000 año 

	        if (año>=1000 && año<=3000){ 

	            //condicional entre 1 y 12 mes 

	            if (mes>=1 && mes<=12) { 

	                //condicional entre 1 y 31 dia 

	                if (dia<1 && dia>31) { 

	                    System.out.println("formato incorrecto"); 

	                } 

	                //en caso de que sea febrero max dia 28 

	                else if (mes==2 && dia>=29) { 

	                    System.out.println("formato incorrecto"); 

	                } 

	                //en caso de que el mes tenga 30 dias 

	                else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia==31){ 

	                    System.out.println("formato incorrecto"); 

	                } 

	                else { 

	                    System.out.printf("Su fecha es: %d/%d/%d\n", año, mes, dia); 

	                } 

	            } 

	            else { 

	                System.out.println("formato incorrecto"); 

	            } 

	        }  

	        else { 

	            System.out.println("formato incorrecto"); 

	        } 

	        System.out.println("Si desea volver a introducir una fecha presione 1 y si desea salir introduzca cualquier numero"); 

	        salir = sc.nextInt(); 

	    } 

	    while (salir==1); 

	     

	    } 

	}


