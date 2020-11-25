/**
 * 
 */

/**
 * @author konrad
 *
 */
public class arrays2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ARRAYS DE 2 DIMENSIONES DE TIPO STRING
		String[][]names= {
				{"Mr.","Mrs.","Ms."},
				{"Smith","Jones"},
				{"Konrad","Rubaszka","Lucía"}
		};
		//Mr.Smith
		System.out.println(names[0][0]+ names[1][0]);
		//Ms.Jones
		System.out.println(names[0][2]+ names[1][1]);
		
		//ARRAY DE 3 DIMENSIONES
		int[][][] array3D= new int[3][3][2];
		array3D={{
				{1,7,9},
				{5,9,3},
				{7,9,9},
		          },{
		        	  {1,7,9},
		        	  {5,9,3},
		        	  {7,9,9}
		                  }};
		}
	}