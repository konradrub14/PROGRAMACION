/**
 * 
 */
import java.util.Scanner;  

/**
 * @author konrad
 *
 */
public class ejercicio_20_ami_maanera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero=1;
		int suma=0;
		int media;
			
			System.out.println("Pon distintos números y seguidamente pulsa 0.");
			numero=sc.nextInt();
			
			while(numero !=0) {
				numero=sc.nextInt();
				suma=suma+numero;
			}
			media=suma/numero;
				
			System.out.println("El resultado de la suma de los numeros es :"+suma);
			
			System.out.println("La media de los numeros introducidos es :"+media);
			sc.close();
			
	}
}

