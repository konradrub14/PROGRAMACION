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
		System.out.println("Introduce el titulo de la canción");
		nuevacancion.SetTitulo(sc.next());
		System.out.println("¿Quién es el artista de la canción?");
		nuevacancion.SetArtista(sc.next());
		System.out.println("¿Cuál es la duración de la canción?");
		nuevacancion.SetDuracion(sc.next());
	}
	public void ObtenerCancion() {
		
	}
	


	








}