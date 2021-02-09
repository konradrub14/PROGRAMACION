package SEMANAL25;

public class Cancion {
	private String Titulo;
	private String Artista;
	private String Duracion;
//CONSTRUCTOR CANCION VACIO
public Cancion () {
	
}
//RELLENAMOS EL CONSTRUCTOR DE CANCION
public Cancion (String Titulo,String Artista,String Duracion) {
	this.Titulo=Titulo;
	this.Artista=Artista;
	this.Duracion=Duracion;
}
/**
 * Metodo reproducir
 * @return Reproduciendo titulo de la cancion
 */
public String reproducir() {
	return "Reproduciendo..."+this.Titulo;
}
@Override
/**
 * Este metodo nos va a devolver el titulo de la cancion ,el artista y la duracion de la cancion 
 */
public String toString() {
	return this.Titulo+" - "+this.Artista+"| Duracion:"+this.Duracion+", minutos";
}
//GETTERS Y SETTERS
public String GetTitulo() {
	return Titulo;
}
public void SetTitulo(String Titulo) {
	Titulo=Titulo;
}
public String GetArtista() {
	return Artista;
}
public void SetArtista(String Artista) {
	Artista=Artista;
}

public String GetDuracion() {
	return Duracion;
}
public void SetDuracion(String Duracion) {
	Duracion=Duracion;
}
}