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
		int telaraña;
		int elefante;
		int suma=0;
		int aux;
		int total_suma=0;
		int salir=0;
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("¿CUÁNTO PESO AGUANTA LA TELARAÑA?");
			telaraña=sc.nextInt();
			do {
				System.out.println("ESCRIBE EL PESO DEL ELEFANTE");
				elefante=sc.nextInt();
				aux=elefante;
				suma=aux+total_suma;
				total_suma=suma;
				System.out.println(+suma);
			}while (elefante!=0);
			if(suma<=telaraña) {
				System.out.println("¡¡LA TELARAÑA AGUANTA!!");
			
			}else{
				System.out.println("¡¡LA TELARAÑA SE A ROTO");
			}
			System.out.println("Si desea volver al cominezo pulse (1),si quiere salir pulse (0)");
			salir=sc.nextInt();
			while(salir==0);
					
		}

	}
	
}