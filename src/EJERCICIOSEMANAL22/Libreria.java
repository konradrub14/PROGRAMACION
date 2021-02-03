/**
 * 
 */
package EJERCICIOSEMANAL22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class Libreria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu=9;
		int ID=0;
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<libro> libreria=new ArrayList<libro>();
		
		libro nuevolibro= new libro();
		while(menu!=0) {
			System.out.println("\n0.Salir\n1.Alta libro \n2.Consulta libro\n3. baja libro\n4.prestamos de libro");
			System.out.println("Elige una opcion:");
			menu=sc.nextInt();
			if(menu==1) {
				añadirlibro(libreria);
			}
			else if(menu==2) {
				for(int i=0;i<libreria.size();i++) {
					System.out.println("id libro"+i);
					System.out.println("\ntitulo del libro: "+libreria.get(i).getTitulo());
					System.out.println("\nautor del libro: "+libreria.get(i).getAutor());
					System.out.println("\nnumero de ejemplares"+libreria.get(i).getNumEjemplares());
					System.out.println("\nnumero de prestamos"+libreria.get(i).getNumPrestados()+"\n\n");	
				}
			}
			else if(menu==3) {
				System.out.println("¿Cuál es el ID del libro que deseas eliminar?");
				ID=sc.nextInt();
				libreria.remove(ID);
			}
			else if(menu==4) {
				int ID_MAX=libreria.size();
				int x=0;
				while(x==0) {
					System.out.println("Dame el ID del libro que quieres coger prestado, debe ser menor que "+ ID_MAX+":");
					ID=sc.nextInt();
					if(ID<ID_MAX)
						x=1;
				}
				nuevolibro=libreria.get(ID);
				if(nuevolibro.prestar()) {
					System.out.println("Se ha prestado el libro "+ nuevolibro.getTitulo());	
				}else {
					System.out.println("No quedan ejemplares de "+ nuevolibro.getTitulo()+"para prestar");
					
					
				}
			
			}
			
		}
		

	}
	
	private static void añadirlibro(ArrayList<libro>1) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		libro nuevolibro=new libro();
		System.out.print("Introduce el titulo");
		nuevolibro.setTitulo(sc.next());
		System.out.print("Introduce el autor");
		nuevolibro.setAutor(sc.next());
		System.out.print("Numero de ejemplares");
		nuevolibro.setNumEjemplares(sc.next());
		1.add(nuevolibro);
		System.out.print("Has añadido el libro ");
		
	}

	

}
