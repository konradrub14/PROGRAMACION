/**
 * 
 */
package EJERCICIOSEMANAL22;

import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String titulo, autor;
		 int ejemplares;
		 //se crea el objeto libro1 utilizando el constructor con parámetros
		 libro libro1 = new libro("El quijote", "Cervantes", 1, 0);
		 //se crea el objeto libro2 utilizando el constructor por defecto
		 libro libro2 = new libro();
		 System.out.print("Introduce titulo: ");
		 titulo = sc.nextLine();
		 System.out.print("Introduce autor: ");
		 autor = sc.nextLine();
		 System.out.print("Numero de ejemplares: ");
		 ejemplares = sc.nextInt();
		 //se asigna a libro2 los datos pedidos por teclado.
		 //para ello se utilizan los métodos setters
		 libro2.setTitulo(titulo);
		 libro2.setAutor(autor);
		 libro2.setNumEjemplares(ejemplares);
		 //se muestran por pantalla los datos del objeto libro1
		 //se utilizan los métodos getters para acceder al valor de los atributos
		 System.out.println("Libro 1:");
		 System.out.println("Titulo: " + libro1.getTitulo());
		 System.out.println("Autor: " + libro1.getAutor());
		 System.out.println("Ejemplares: " + libro1.getNumEjemplares());
		 System.out.println("Prestados: " + libro1.getNumPrestados());
		 System.out.println();
		 //se realiza un préstamo de libro1. El método devuelve true si se ha podido
		 //realizar el préstamo y false en caso contrario
		 if (libro1.prestamo()) {
		 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		 }
		 //se realiza una devolución de libro1. El método devuelve true si se ha podido Programación
		 //realizar la devolución y false en caso contrario
		 if (libro1.devolver()) {
		 System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
		 }
		 //se realiza otro préstamo de libro1
		 if (libro1.prestamo()) {
		 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		 }
		 //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
		 //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
		 //pantalla el mensaje No quedan ejemplares del libro…
		 if (libro1.prestamo()) {
		 System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		 } else {
		 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		 }
		 //mostrar los datos del objeto libro1
		 System.out.println("Libro 1:");
		 System.out.println("Titulo: " + libro1.getTitulo());
		 System.out.println("Autor: " + libro1.getAutor());
		 System.out.println("Ejemplares: " + libro1.getNumEjemplares());
		 System.out.println("Prestados: " + libro1.getNumPrestados());
		 System.out.println();
		 //mostrar los datos del objeto libro2
		 System.out.println("Libro 2:");
		 System.out.println("Titulo: " + libro2.getTitulo());
		 System.out.println("Autor: " + libro2.getAutor());
		 System.out.println("Ejemplares: " + libro2.getNumEjemplares());
		 System.out.println("Prestados: " + libro2.getNumPrestados());
		 System.out.println();
		
		 }
	}
