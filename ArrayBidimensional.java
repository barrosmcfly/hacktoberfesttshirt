
public class ArrayBidimensional {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Queremos mostrar las personas que hay en cada aula, teniendo 4 aulas PERO con una capacidad m�xima en cada clase.
		
		int aula[][]= new int[4][2];
		
		aula [0][0] = 23; //N�mero de alumnos en clase
		aula [0][1] = 25; //Capacidad m�xima
		
		aula [1][0] = 20;
		aula [1][1] = 25;
		
		aula [2][0] = 19;
		aula [2][1] = 20;
		
		aula [3][0] = 22;
		aula [3][1] = 23;

	
	//Aplicamos las personas a cada aula y por ejemplo vemos cuantas tiene el aula 3 (que ser�a el n�mero 2 del array)
		
		System.out.println("El Aula N� 3 tiene "+aula[2][0]+" Alumnos de "+aula[2][1]+" posibles");
		
	}

}