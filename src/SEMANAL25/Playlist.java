package SEMANAL25;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist extends Cancion{ 
	/**
	 * ArrayList llamado playlist para ir metiendo canciones alli;
	 */
	ArrayList<Cancion> playlist = new ArrayList();
	public void aniadirCancion() {
		Scanner sc= new Scanner(System.in);
		Cancion nuevacancion= new Cancion();
		System.out.println("Introduce el titulo de la canci�n");
		nuevacancion.SetTitulo(sc.next());
		System.out.println("�Qui�n es el artista de la canci�n?");
		nuevacancion.SetArtista(sc.next());
		System.out.println("�Cu�l es la duraci�n de la canci�n?");
		nuevacancion.SetDuracion(sc.next());
	}
	public void ObtenerCancion() {
		
	}
	


	








}