/**
 * 
 */
package SEMANAL25;

import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playlist nombre_playlist= new Playlist("Get Lucky, El Uason");
		Cancion nuevacancion = new Cancion();
		System.out.println("Cancion 1 ");
		
		
		Scanner sc= new Scanner(System.in);
		int menu=12;
		while(menu!=0) {
			System.out.print("Elige alguna de estas opciones");
			
			System.out.print("1. Pulsa 1 para añadir una canción.");
			
			System.out.print("2. Pulsa 2 para obtener una canción");
			
			System.out.print("3. Pulsa 3 para ver el total de canciones");
			
			System.out.print("4. Pulsa 4 para mostrar una playlist");
			
			System.out.print("5. Pulsa 5 para ver la duración de la playlist ");
			
			System.out.print("6. Pulsa 6 para reproducir la playlist ");
			
			
			System.out.print("7. Pulsa 7 para reproducir una canción ");
			
			System.out.print("8. Pulsa 8 para borrar una canción");
			
			
			System.out.println("9. Pulsa 0 para salir. ");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Dime el titulo de la canción");
				nuevacancion.SetTitulo(sc.next());
				System.out.println("Dime el artista");
				nuevacancion.SetArtista(sc.next());
				System.out.println("¿Cuánto dura la canción?");
				nuevacancion.SetDuracion(sc.next());
				System.out.println("PERFECTO,has añadido una nueva canción a tu lista");
				break;
			case 2:
				int posicion_cancion=sc.nextInt();
				System.out.println("Elige una posición aleatoria para obtener una canción de la playlist");
				System.out.println("Aquí tienes la canción : "+nombre_playlist.ObtenerCancion(posicion_cancion));
				break;
			case 3:
				nombre_playlist.TotalCanciones();
				break;
			case 4 :
				System.out.println("El nombre de la playlist es :"+nombre_playlist.getNombre() +"\n");
				break;
			case 5: 
				System.out.println("Tu playlist dura : "+ nombre_playlist.DuracionTotalPlaylist()+"minutos.");
				break;
			case 6:
				nombre_playlist.reproducirPlayList();
				break;
			case 7:
				nombre_playlist.reproducirPlayList();
				break;
			case 8:
				nombre_playlist.limpiarPlayList();
				System.out.println("La Playlist ha sido vaciada.");
				break;
				
				
			
		}
			
			
		
	}
	}
}

