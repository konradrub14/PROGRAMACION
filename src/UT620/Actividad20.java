/**
 * 
 */
package UT620;

/**
 * @author konrad
 *
 */
public class Actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona yo = new Persona();		
		yo.setNombre("KOnraD");
		System.out.println(yo.getNombre());
		yo.setApellidos("RUBaszka de TODOS los santos");
		System.out.println(yo.getApellidos());
		yo.setAnio(2000);
		yo.setMes(2);
		yo.setDia(19);
		yo.setSexo('H');
		yo.saludar();
		System.out.println(yo.mostrarEdad());
		
		Persona invento = new Persona("JAVIER", "lopez castillo", 6600, 34, -3, 'G');
		invento.saludar();
		
	}
}
