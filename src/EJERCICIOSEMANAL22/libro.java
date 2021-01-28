package EJERCICIOSEMANAL22;

public class libro {
	private String Titulo;
	private String Autor;
	private int numEjemplares;
	private int numPrestados;
	
	//CONSTRUCTOR DE LIBRO VACIO
	public libro() {}
	//constructor libro con sus devidos paramentros
	public libro(String titulo,String autor,int numeroEjemplares,int numPrestados) {

		this.Titulo=titulo;
		this.Autor=autor;
		this.numEjemplares=numeroEjemplares;
		this.numPrestados=numPrestados;
	}
	//METODO PRESTAMO,PARA VER SI EL PRESTAMO SE PUEDE REALIZAR O NO 
	public void prestamo() {
		if (numEjemplares>numPrestados) {
			numPrestados++;
			System.out.println("El prestamo se ha efectuado con exito");
		}else {
			System.out.println("No se puede prestar el libro por falta de Ejemplares");
		}
	}
	// METODO DEVOLOLVER
	public void devolver() {

		if (numPrestados==0) {
			System.out.println("Este libro no se a prestado, No se ha hecho la devolucion del mismo");
		}else {
			numPrestados--;
			System.out.println("Devolucion con exito.");
		}
	}
	
	
	public String toString() {
		return "Titulo del Libro: "+getTitulo()+"\nNombre del autor: "+getAutor()+"\nEjemplares del libro: "+getNumEjemplares()+"\nLibros prestados: "+getNumPrestados();
	}
	
	
	//Getters y Setters
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumPrestados() {
		return numPrestados;
	}
	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}
	
	//COMPROBACIONES
	public void prestamos(int prestados) {
		if(prestar() == true) {
			prestados++;
		}
	}
	public boolean prestar() {
		boolean dp=false;
		int prestados=0;
		if(prestados < getNumEjemplares()) {
			dp=true;
			prestados ++;
		}else {
			dp=false;
		}
		return dp;
	}
		public boolean devolucion(int prestamo) {
			boolean dp=false;
			if(getNumPrestados() >0) {
				dp=true;
			}else {
				dp=false;
			}
			return dp;
		}
		//FUNCIONES CALCULO DATOS
		public int Restantes() {
			int rest=getNumEjemplares() - getNumPrestados() ;
			return rest;
		}
		//FUNCIONES PARA SACAR DATOS
		public String dato_titulos() {
			return "El titulo del libro es:"+ getTitulo(); 
			}
		public String dato_autor() {
			return "El autor del libro es:"+ getAutor();
		}
		public String dato_ejemplares() {
			return"Los ejemplares que hay son:"+getNumEjemplares();
		}
	}


	
