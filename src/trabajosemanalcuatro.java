/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class trabajosemanalcuatro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int telara�a;
		int elefante;
		int suma=0;
		int aux;
		int total_suma=0;
		int salir=0;
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("�CU�NTO PESO AGUANTA LA TELARA�A?");
			telara�a=sc.nextInt();
			do {
				System.out.println("ESCRIBE EL PESO DEL ELEFANTE");
				elefante=sc.nextInt();
				aux=elefante;
				suma=aux+total_suma;
				total_suma=suma;
				System.out.println(+suma);
			}while (elefante!=0);
			if(suma<=telara�a) {
				System.out.println("��LA TELARA�A AGUANTA!!");
			
			}else{
				System.out.println("��LA TELARA�A SE A ROTO");
			}
			System.out.println("Si desea volver al cominezo pulse (1),si quiere salir pulse (0)");
			salir=sc.nextInt();
			while(salir==0);
					
		}

	}
	
}