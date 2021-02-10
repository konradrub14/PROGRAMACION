package SEMANAL25;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist { 
	String nombre_playlist;
	ArrayList<Cancion>Playlist;
	
	public Playlist() {
		this.playlist=new ArrayList<Cancion>();
	}
	public Playlist(String N) {
		this.nombre_playlist=N;
		this.Playlist=new ArrayList<Cancion>(); 
	}
	
	private ArrayList<Cancion> playlist = new ArrayList();
	public void aniadirCancion(Cancion c) {
		this.Playlist.add(c);
	}
	
	// getter y setters
		

		public ArrayList<Cancion> getCancion() {
			return playlist;
		}

		public void setCanciones(ArrayList<Cancion> canciones) {
			this.playlist = canciones;
		}

		public String getNombre() {
			return nombre_playlist;
		}

		public void setNombre(String nombre) {
			nombre_playlist = nombre;
		}

		// metodos de la clase playlist
		// metodo para añadir una cancion al arraylist que devuelve una cancion
		public void anyadirCancion(Cancion c) {
			Cancion a = new Cancion(c.GetTitulo(), c.GetArtista(), c.GetDuracion());
			playlist.add(a);

		}
	// metodo que sirve para obtener la posicion de una cancion y 
	// devuelve la canción con su posición correspondiente en el arraylist.
	
	public Cancion ObtenerCancion (int posicion) {
		return this.Playlist.get(posicion);
	}
	public void mostrarPlayList() {
		System.out.println("El nombre de la playlist es :" + nombre_playlist);
	}
	//Método para conseguir el numero exacto del arraylisr creado (Playlist)
	public int TotalCanciones() {
		return this.Playlist.size();
	}
	//Realizamos una suma de todos los minutos de duración
	//de cada canción.
	public float DuracionTotalPlaylist() {
	float suma=0;
	for(Cancion c : Playlist) suma= (suma+c.GetDuracion());
	return suma;
	}
	// metodo para reproducir toda la playlist inicializamos a 0 que seria la
		// primera cancion e incrementamos
		public String reproducirPlaylist() {
			String respuesta = " ";
			for (int i = 0; i < nombre_playlist.size(); i++) {
				respuesta = respuesta + nombre_playlist.get(i).reproducir();

			}
			return respuesta;
		}
	//Método para reproducir la playlist, iniciamos la cuenta a 0.
	public void reproducirPlayList() {
		Cancion c;
		if(Playlist.size()!=0) {
			for (int i=0;i<Playlist.size();i++) {
				c=Playlist.get(i);
				System.out.println(c.reproducir());
			}
		}
		else 
			System.out.println("La playlist no tiene canciones");
	}
	//Método para borrar las canciones almacenadas en la arrays
	public void limpiarPlayList() {
		Playlist.clear();
	}
	
	
	
	
	
	


	








}