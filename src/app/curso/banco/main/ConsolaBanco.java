package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.util.utiles;
import app.curso.banco.entidad.*;

public class ConsolaBanco {

	public static void main(String[] args) {

		HashMap<Integer, Gestor> listasGestores = new HashMap<>();

		HashMap<Integer, Cliente> listasClientes = new HashMap<>();

		HashMap<Integer, Mensaje > mensajes = new HashMap<>();

		
		//commitNUEVO1
		Scanner keyboard = new Scanner(System.in);
		
		Gestor g1 = null;
		Cliente c1 = null;
		Gestor Gestor1 = null;
		Integer numero1 = null;
		//Mensaje m1= null;
		
		
		int menuSeleccionado = -1;

		do {
			System.out.println("1. Crear Gestor");
			System.out.println("2. Insercion masiva de gestores con datos aleatorios");
			System.out.println("3. Obtención de un Gestor");
			System.out.println("4. Ver todos Gestores");
			System.out.println("5. Actualiza Gestor");
			System.out.println("13. obtener un mensajes");
			System.out.println("14. obteccion de todos los mensajes");
			System.out.println("15. envio de mensaje");
			System.out.println("0. Salir\n");
			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			// salir
			case 0:
				System.out.println("Saliendo...");
				break;
			// crear un nuevo estudiante pidiendo los datos por teclado
			case 1:
				System.out.println("Creando gestor:");

				System.out.println("--------------------------------------------");

				System.out.println("Id del gestor:");

				int idNuevo = keyboard.nextInt();

				System.out.println("--------------------------------------------");

				System.out.println("nombre del gestor:");

				String nombre = keyboard.next();

				System.out.println("--------------------------------------------");

				System.out.println("numero de telefono:");

				String numeroTlfn = keyboard.next();

				System.out.println("--------------------------------------------");

				System.out.println("numero de de id de oficina");

				int idOficina = keyboard.nextInt();
				System.out.println("--------------------------------------------");

				 g1 = new Gestor(idNuevo, nombre, numeroTlfn, idOficina);

				listasGestores.put(g1.getId(), g1);

				System.out.println("SE HA CREADO UN NUEVO GESTOR");

				System.out.println("--------------------------------------------");

				break;
			
			case 2:
				System.out.println("--------------------------------------------");

				//colocan gestores de forma masiva
				
				int i ;
				
				String nombreLlamado = null;
				
				String telefonoLlamado =null ;
				
				int idOficinaLlamado = 0;
				
				for( i = 0; i < 10 ; i++) {
					
					
					System.out.println("Id del Gestor :"+ " " + i);

					
					nombreLlamado = utiles.nombreAleatorio();
					
					//int idLlamado = utiles.idAleatorio();
					
					telefonoLlamado = utiles.telefonoAleatorio();
					
					
					 idOficinaLlamado = utiles.idOficinaAleatorio();
					
					
						Gestor1 = new Gestor (i, nombreLlamado, telefonoLlamado,idOficinaLlamado);
						
						listasGestores.put(Gestor1.getId(), Gestor1);
						
					
					System.out.println("--------------------------------------------");
					
				
				}
				
			
			
				break;
			// Obteniendo un gestor
			case 3:

				listasGestores.forEach((id, gestor) -> {
					gestor.mostrarInfo();

				});
				
				System.out.println("coloca el numero id para obtener mas informacion de un gestor:");
				
				//System.out.println("--------------------------------------------");
			
				
				
				Integer numero = keyboard.nextInt();
				
				Gestor obtener = listasGestores.get(numero);
				
				obtener.mostrarInfo();

				System.out.println("--------------------------------------------");
					
				
				break;
			
			case 4:
				System.out.println("Obteniedno todos los Gestores");
				
				System.out.println("--------------------------------------------");
			
				listasGestores.forEach((id, gestor) -> {
					gestor.mostrarInfo();

				});
				break;
			case 5:
				System.out.println("Actualiza el ID del gestor:");
				int actualizaGestorId = keyboard.nextInt();
				//g1.actualizarPersona(actualizaGestorId);*/
				
				/*listasGestores.forEach((id, gestor) -> {
					gestor.actualizarPersona(actualizaGestorId);

				});*/
				
				listasGestores.forEach((id, gestor) -> {
					gestor.actualizarPersona(actualizaGestorId);

				});
				
			System.out.println("Id actualizado");
				
				break;
			case 6:	
				
				//eliminacionde un gestor
				
				
				
				break;
			case 7:
				//inserccion de un clinet
				
				
				break;
			case 8:
				//obteccion de un cliente
				
				
				
				break;
			case 9 :
				//obteccion de todos los cliente
				
				
				
				
				break;
			case 10 :
				
				
				
				break;
			case 11 :
				
				
				
				break;
			case 12 :
				//crear un mensaje
				System.out.println("Creando un mensaje");
				
				
				
				
				
				break;
			case 13:
				//obteccion de un mensaje
				System.out.println("OBTENER UN MENSAJE");
				System.out.println();
				System.out.println("MOSTRANDO TODOS LOS MENSAJES");
				System.out.println();
				
				mensajes.forEach((id, todosMensanjes) -> {
					todosMensanjes.mostrarInfoUnitario();
				});
				
					System.out.println();
					System.out.println("COLOCA EL ID DEL MENSAJE :");
					
					Integer idObtenerMensaje = keyboard.nextInt();
					
					Mensaje llamado = mensajes.get(idObtenerMensaje);
					
					
					llamado.mostrarInfoMensaje();
					
				
				
				break;
			case 14 :
				//obteccion de todos los mensajes
				
				System.out.println("OBTENIENDO TODOS LOS MENSAJES");
				System.out.println("-----------------------------------");
				
				mensajes.forEach((id, todosMensanjes) -> {
					todosMensanjes.mostrarInfoMensaje();

				});
				
				System.out.println("-----------------------------------");
				
				break;
			case 15:
			//sirviria para envio de mensaje
				
				System.out.println("CREADO  MENSAJE");
				System.out.println();
				System.out.println("INGRESE NUMERO DE ID DEL EMISOR:");
				int idEmisor = keyboard.nextInt();
				System.out.println();
				System.out.println("INGRESE NUMERO DE ID DEL RECEPTOR:");
				int idReceptor = keyboard.nextInt(); 
				System.out.println();
				System.out.println("INGRESE SU MENSAJE:");
				String texto =  keyboard.next(); 


				int idMensajeRandom = utiles.idMensaje();
				
				 Mensaje m1 = new Mensaje(idMensajeRandom,  Mensaje.TIPO_CLIENTE,  idEmisor , Mensaje.TIPO_GESTOR, idReceptor ,texto);
					
				 mensajes.put(m1.getId(), m1);
				
				
				System.out.println();

				System.out.println("MENSAJE CONFIRMADO:" );
				
				System.out.println(m1);


				System.out.println("----------------------------------------------------------");

				
			break;
			case 16:
				
				
				break;
			case 17:
				
				break;
			case 18:
				System.out.println("login cliente");
				int idCliente = keyboard.nextInt();
				
				Cliente clienteParaLogin = listasClientes.get(idCliente);
				
				System.out.println("contraseña:");
				
				String pass = keyboard.nextLine();
				
				String passCliente = clienteParaLogin.getPassword();
				
				boolean tienePass = passCliente != null;
				
				boolean loginCorrecto =  tienePass && clienteParaLogin.equals(pass);
				
				if(loginCorrecto){
					
					System.out.println("correcto!");	
				}	else {
					System.out.println("incorrecto");
				}			
				
				break;
			case 19:
				System.out.println("id del cliente a registrar");
				int idARegistrar = keyboard.nextInt();
				Cliente clienteParaRegistro = listasClientes.get(idARegistrar);
				System.out.println("nueva contraseña");
				String nuevaPass = keyboard.nextLine();
				

				break;
			default:
				System.out.println("Opción desconocida...");
				break;
			}

		} while (menuSeleccionado != 0);
		
		
		
		
		

	}

	private static String nombreAleatorio(String[] nombres) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
