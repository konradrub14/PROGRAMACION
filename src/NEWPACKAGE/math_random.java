/**
 * 
 */
package NEWPACKAGE;

/**
 * @author konrad
 *
 */
public class math_random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());
		//NUMERO ALEATORIO ENTRE 1 Y 10
		int numero= (int)(Math.random()*10)+1;
		System.out.println(numero);
		
		//NUMERO ALEATORIO ENTRE 1 Y 4
		int numero2=(int)(Math.random()*4)+1;
		System.out.println(numero2);
	}

}
