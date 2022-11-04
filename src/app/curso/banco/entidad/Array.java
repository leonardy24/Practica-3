package app.curso.banco.entidad;

import java.util.ArrayList;
import java.util.HashMap;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		///hola 2.1
		//colecciones
		
		//ArrayLIST ->
		
		//ArrayList<Long>;
		
		
		
		//añadir elemento
		//lista.add(3);
		
		
		//añadir numero en la psicon 3

		
		
		//lista.add(3,5);
		
	 	//tamño de lista
		
		//lista.size();
		
		
		//eleminar elemnto en la posicion 3 
		
		//lista.remove(3);
		
		//buscar elemento si no es esta devuleve -1
		
		//lista.idexof();
	
		//recuperar elemento
	
		//lista.get(0);
		
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		
		
		for(int i = 0;i<=20;i++) {
			lista1.add(i);
		}
	
		System.out.println(lista1);
		
		for(int o = 20; o>=0;o--) {
			System.out.println(lista1.get(o));
		}
		
		
		///iterar array
		
		for(Integer numero: lista1) {
			System.out.println(numero);
		}
		
		
		
		
		
		
		System.out.println("--------------------------------------------------------------------------");

		
		
		/////HashMap
		
		HashMap<Integer, String> mapa = new HashMap<>();
		///añadir
		mapa.put( 7, "Maria ");
		
		
		String enPosicion2 = mapa.get(7);
		
		System.out.println("en la posicion 2 esta" + enPosicion2);
		
		////sobreescribir
		mapa.put(7, "pedro");
		///get se utiliza para llamar creo
		enPosicion2 = mapa.get(7);
		
		
		System.out.println("en la posicion 2 esta" + enPosicion2);
		
		
		///limpiar HashMap
		
		//mapa.clear();
		
		
		
		//enPosicion2 = mapa.get(7);
		
		System.out.println("en la posicion 2 esta" + enPosicion2);
		
		////iteracion de HashMap
		
		mapa.forEach((clave ,valor) ->{
			System.out.println("en " + "  " + clave +" " + "hay " + valor );

		});
		
		///eliminar
		
		// mapa.remove(7);
		
		
		System.out.println("-------------------------.....................--------------------------------");
		
		
		
		
	}	
}
