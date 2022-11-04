package app.curso.banco.util;

import java.util.Random;

public class utiles {

	
		
		public  static final String[]  NOMBRES = {"juan", "Pedro", "Maria" , "Alejandro"};
		
		public static final String[] APELLIDOS = {"Escalona", "Mora", "Marquina","Davila"};
		
		

		
		
		public static String nombreAleatorio() {
		
		Random random = new Random();
		
		int indexNombre = random.nextInt(NOMBRES.length);
		String nombreAleatorio = NOMBRES[indexNombre];
		
		int indexApellido = random.nextInt(APELLIDOS.length);
		String apellidoAleatorios = APELLIDOS[indexApellido];
		
		
		
		
		String nombreCompleto = "Nombre :" + nombreAleatorio ;
		
		String apellidoCompleto = "Apellido :" + apellidoAleatorios;
		
		
		
		System.out.println(nombreCompleto);
		
		System.out.println(apellidoCompleto);
		
		


		return nombreCompleto + apellidoCompleto;
		}	
		
		public static final int[] IDOFICINA = {100,102,103,104,105,106,107,108 };
		
		public static int idOficinaAleatorio() {
			
			Random random = new Random();
			
			int indexIdOf = random.nextInt(IDOFICINA.length);
			int idOfAleatorio = IDOFICINA[indexIdOf];
				
			int idCompleto = idOfAleatorio;
			
			System.out.println("Id de oficina:" + idCompleto);
			
			return idCompleto;
		}
		
		public static final String[] TELEFONO = {"123-456-789","789-456-123","456-789-123","741-852-963","369-258-147","159-753-971","357-159-931","826-426-759" };
		
		public static String telefonoAleatorio() {
			
			Random random = new Random();
			
			int indexTlfn = random.nextInt(TELEFONO.length);
			String tlfnAleatorio = TELEFONO[indexTlfn];
				
			String tlfnCompleto = "Telefono :" + tlfnAleatorio;
			
			System.out.println(tlfnAleatorio);
			
			return tlfnAleatorio;
		}
		
		//Generando id de mensaje
		public static final int[] IDMENSAJE = {100,102,103,104,105,106,107,108 };
		
		public static int idMensaje() {
			
			Random random = new Random();
			
			int indexIdMensaje = random.nextInt(IDMENSAJE.length);
			int idDeMensaje = IDMENSAJE[indexIdMensaje];
				
			int idMensajeCompleto = idDeMensaje;
			
			
			
			return idMensajeCompleto;
		}
		
	}


