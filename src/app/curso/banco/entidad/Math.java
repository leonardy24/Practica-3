package app.curso.banco.entidad;

import java.util.ArrayList;
import java.util.Random;

public class Math {

	

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int enteroAleatorio = random.nextInt(100);
		
		double decimales = random.nextDouble(100f);
		
		boolean llamarBoolenao = random.nextBoolean();
		
		System.out.println("entero aleatorio:" + enteroAleatorio);
		
		
		System.out.println("entero aleatorio:" + decimales);
		
		System.out.println(llamarBoolenao);
		
		System.out.println("---------------------------------:" );
		
		
		
		//1 primero de forma una lista
		ArrayList<String> nombre = new ArrayList<>();
		
		
		//2forma de hacer un array
		
		String[] nombre2 = {"juan", "pedro" , " paco"};
		
		String [] apellidos = {"Escalona", "mora", "marquina"}; 
		
		int index = random.nextInt(nombre2.length);
		
		int index2 = random.nextInt(apellidos.length);
		
		String nombreAleatorio = nombre2[index];
		
		String apellidoAleatorio = apellidos[index2];
		
		
		
		System.out.println( "id nombre:" + index + "  " +"id apellido  " +index );
		
		System.out.println("nombre:" + nombreAleatorio );
		
		System.out.println("apellido:" + apellidoAleatorio );
	}

}
