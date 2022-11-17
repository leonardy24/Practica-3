package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.util.utiles;

import app.curso.banco.entidad.*;

public class ConsolaBanco {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		HashMap<Integer, Gestor> listasGestores = new HashMap<>();

		HashMap<Integer, Cliente> listasClientes = new HashMap<>();

		HashMap<Integer, Mensaje> mensajes = new HashMap<>();

		// commitenclases
		Scanner keyboard = new Scanner(System.in);

		Gestor g1 = null;
		Cliente c1 = null;
	
		//Integer numero1 = null;
		String noActuazlizar = "0";
		int menuSeleccionado = -1;

		do {

			System.out.println("1. Crear Gestor");
			System.out.println("2. Insercion masiva de gestores con datos aleatorios");
			System.out.println("3. Obtención de un Gestor");
			System.out.println("4. Ver todos Gestores");
			System.out.println("5. Actualiza Gestor");
			System.out.println("6. Eliminar Gestor");
			System.out.println("7. Crear cliente");
			System.out.println("8. Obtencion de un cliente");
			System.out.println("9. Obtencion de todos los cliente");
			System.out.println("10. Actualizacion de un cliente");
			System.out.println("11. Eliminacion de un cliente");
			System.out.println("12. Obtencion de un Mensaje");
			System.out.println("13. Obtencion de todos los Mensajes");
			System.out.println("14. Envio de un Mensaje");
			System.out.println("15. envio de mensaje");
			System.out.println("0. Salir\n");
			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			// salir
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				// crear un nuevo estudiante pidiendo los datos por teclado
				System.out.println("_____________________________________________");

				System.out.println("CREANDO GESTOR:");

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

				System.out.println("_____________________________________________");

				break;

			case 2:
				// colocan gestores de forma masiva
				System.out.println("_____________________________________________");

				System.out.println("INGRESANDO GESTORES DE FORMA MASIVA");

				System.out.println("--------------------------------------------");

				int i;

				String nombreLlamado = null;

				String telefonoLlamado = null;

				int idOficinaLlamado = 0;

				for (i = 1; i < 10; i++) {

					nombreLlamado = utiles.nombreAleatorio();
					telefonoLlamado = utiles.telefonoAleatorio();

					// int idLlamado = utiles.idAleatorio();

					System.out.println("Id del Gestor :" + " " + i);

					System.out.println("Nombre:" + " " + nombreLlamado);

					System.out.println("Telefono:" + " " + telefonoLlamado);

					telefonoLlamado = utiles.telefonoAleatorio();

					idOficinaLlamado = utiles.idOficinaAleatorio();

					g1 = new Gestor(i, nombreLlamado, telefonoLlamado, idOficinaLlamado);

					listasGestores.put(g1.getId(), g1);
					System.out.println("---------------------------------------------");

				}
				System.out.println("_____________________________________________");

				break;
			// Obteniendo un gestor
			case 3:
				System.out.println("_____________________________________________");

				if (listasGestores.size() > 0) {
					listasGestores.forEach((id, gestor) -> {
						gestor.mostrar();
					});
					System.out.println("COLACA EL NUMERO DE ID DEL GESTOR, PARA VER MAS INFORMACION :");

					System.out.println("--------------------------------------------");

					Integer numero = keyboard.nextInt();

					Gestor obtener = listasGestores.get(numero);

					obtener.mostrarInfo();

					System.out.println("_____________________________________________");

				} else {
					System.out.println("NO EXISTEN GESTORES");

				}

				break;

			case 4:
				// OBTENIENDO TODOS LOS GESTORES
				System.out.println("_____________________________________________");
				System.out.println("OBTENIENDO TODOS LOS GESTORES");
				System.out.println("--------------------------------------------");

				if (listasGestores.size() > 0) {
					listasGestores.forEach((id, gestor) -> {
						gestor.mostrarInfo();
						System.out.println("_____________________________________________");

					});		

				} else {
					System.out.println("NO EXISTEN GESTORES");
					System.out.println("_____________________________________________");

				}

				break;
			case 5:
				// actualizando un gestor
				System.out.println("_____________________________________________");
				System.out.println("ACTUALIZACIÓN DE UN GESTOR:");
				System.out.println("--------------------------------------------");

				if (listasGestores.size() > 0) {
					listasGestores.forEach((id, gestor) -> {
						gestor.mostrar();
					});
					System.out.println("Ingrese el id del gestor actualizar:");
					System.out.println("--------------------------------------------");
					Integer numeroActualizar = keyboard.nextInt();

					Gestor actualizar = listasGestores.get(numeroActualizar);
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Id:");
					int newId = keyboard.nextInt();
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Nombre:");
					String newNombre = keyboard.next();
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Nª de Telefono:");
					String newTlfn = keyboard.next();
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Id de oficina:");
					int newIdOficina = keyboard.nextInt();
					System.out.println("--------------------------------------------");

					if (newId==0) {
						System.out.println("------------------ID NO SE ACTUALIZO--------------");
					} else {
						actualizar.setId(newId);
					}
					
					if (newNombre.equals(noActuazlizar)) {
						System.out.println("------------------NOMBRE NO SE ACTUALIZO--------------");
					}else {
						actualizar.setNombre(newNombre);
					}
					
					if (newTlfn.equals(noActuazlizar)) {
						System.out.println("------------------TELEFONO NO SE ACTUALIZO--------------");
					} else {
						actualizar.setTelefono(newTlfn);
					}
					
					if (newIdOficina==0) {
						System.out.println("------------------ID OFICINA NO SE ACTUALIZO--------------");
					} else {
						actualizar.setIdOficina1(newIdOficina);
					}
					
					System.out.println("--------------------------------------------");
					System.out.println("GESTOR SE HA ACTUALIZADO");
					actualizar.mostrarInfo();
					
					System.out.println("___________________________________________");

				} else {
					System.out.println("NO EXISTE GESTOR");

				}

			

				break;
			case 6:
				//preguntale al profesor sobre como hacer para que el programa, diga cunado el gestor no exista
				// eliminacionde un gestor
				System.out.println("ELIMINANDO GESTOR");
				System.out.println("INGRESE EL NUMERO DE ID QUE DESEA ELIMINAR:");
				String idEliminado = keyboard.next();

				if (listasGestores.size()>0  && listasGestores.equals(idEliminado)) {
					listasGestores.remove(idEliminado);
					System.out.println("El GESTOR SE HA ELIMINADO");

				} else {
					System.out.println("EL GESTOR NO EXISTE");

				}

				break;
			case 7:
				// inserccion de un cliente
				System.out.println("CREANDO UN CLIENTE :");

				System.out.println("--------------------------------------------");

				System.out.println("ID DEL CLIENTE");

				int idNuevoCliente = keyboard.nextInt();

				System.out.println("--------------------------------------------");

				System.out.println("NOMBRE DEL CLIENTE");

				String nombreCliente = keyboard.next();

				System.out.println("--------------------------------------------");

				System.out.println("NUMERO DE TELEFONO DEL CLIENTE");

				String numeroTlfnCliente = keyboard.next();

				System.out.println("--------------------------------------------");
				
				System.out.println("INGRESE MONTO CON QUE DESEA ABRIR SU CUENTA:");

				int dinero = keyboard.nextInt();

				System.out.println("--------------------------------------------");

				c1 = new Cliente(idNuevoCliente, nombreCliente, numeroTlfnCliente,dinero);

				listasClientes.put(c1.getId(), c1);

				System.out.println("SE HA CREADO UN NUEVO CLIENTE");

				System.out.println("--------------------------------------------");

				break;
			case 8:
				// obteccion de un cliente
				
				System.out.println("_____________________________________________");
				System.out.println("OBTENER UN CLIENTE");
				System.out.println("-------------------------------------------");

				if (listasClientes.size() > 0) {
					listasClientes.forEach((id, clientes) -> {
						clientes.mostrar();
					});
					System.out.println("COLACA EL NUMERO DE ID DEL CLIENTE, PARA VER MAS INFORMACION :");

					System.out.println("--------------------------------------------");

					Integer numeroCliente = keyboard.nextInt();

					Cliente obtenerCliente = listasClientes.get(numeroCliente);

					obtenerCliente.mostrarInfo();

					System.out.println("_____________________________________________");

				} else {
					System.out.println("NO EXISTEN GESTORES");

				}

				break;
			case 9:
				// OBTENIENDO TODOS LOS GESTORES
				System.out.println("_____________________________________________");
				System.out.println("OBTENIENDO TODOS LOS CLIENTES");
				System.out.println("--------------------------------------------");

				if (listasClientes.size() > 0) {
					listasClientes.forEach((id, clientes) -> {
						clientes.mostrarInfo();
						System.out.println("_____________________________________________");

					});		

				} else {
					System.out.println("NO EXISTEN GESTORES");
					System.out.println("_____________________________________________");

				}


				break;
			case 10:
				// actualizando un cliente
				System.out.println("_____________________________________________");
				System.out.println("ACTUALIZACIÓN DE UN CLIENTE:");
				System.out.println("--------------------------------------------");

				if (listasClientes.size() > 0) {
					listasClientes.forEach((id, clientes) -> {
						clientes.mostrar();
					});
					System.out.println("Ingrese el id del cliente actualizar:");
					System.out.println("--------------------------------------------");
					Integer numeroActualizarCliente = keyboard.nextInt();

					Cliente actualizar = listasClientes.get(numeroActualizarCliente);
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Id:");
					int newId = keyboard.nextInt();
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Nombre:");
					String newNombre = keyboard.next();
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo Nª de Telefono:");
					String newTlfn = keyboard.next();
					System.out.println("--------------------------------------------");

					System.out.println("Ingrese nuevo moton de dinero:");
					int newDinero = keyboard.nextInt();
					System.out.println("--------------------------------------------");

					if (newId==0) {
						System.out.println("------------------ID NO SE ACTUALIZO--------------");
					} else {
						actualizar.setId(newId);
					}
					
					if (newNombre.equals(noActuazlizar)) {
						System.out.println("------------------NOMBRE NO SE ACTUALIZO--------------");
					}else {
						actualizar.setNombre(newNombre);
					}
					
					if (newTlfn.equals(noActuazlizar)) {
						System.out.println("------------------TELEFONO NO SE ACTUALIZO--------------");
					} else {
						actualizar.setTelefono(newTlfn);
					}
					
					if (newDinero==0) {
						System.out.println("------------------ID OFICINA NO SE ACTUALIZO--------------");
					} else {
						actualizar.setTotalDinero(newDinero);
					}
					
					System.out.println("--------------------------------------------");
					System.out.println("CLIENTE SE HA ACTUALIZADO");
					actualizar.mostrarInfo();
					
					System.out.println("___________________________________________");

				} else {
					System.out.println("NO EXISTE GESTOR");

				}

				break;
			case 11:

				break;
			case 12:
				// crear un mensaje
				System.out.println("Creando un mensaje");

				break;
			case 13:
				// obteccion de un mensaje
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
			case 14:
				// obteccion de todos los mensajes

				System.out.println("OBTENIENDO TODOS LOS MENSAJES");
				System.out.println("-----------------------------------");

				mensajes.forEach((id, todosMensanjes) -> {
					todosMensanjes.mostrarInfoMensaje();

				});

				System.out.println("-----------------------------------");

				break;
			case 15:
				// sirviria para envio de mensaje

				System.out.println("CREADO  MENSAJE");
				System.out.println();
				System.out.println("INGRESE NUMERO DE ID DEL EMISOR:");
				int idEmisor = keyboard.nextInt();
				System.out.println();
				System.out.println("INGRESE NUMERO DE ID DEL RECEPTOR:");
				int idReceptor = keyboard.nextInt();
				System.out.println();
				System.out.println("INGRESE SU MENSAJE:");
				String texto = keyboard.next();

				int idMensajeRandom = utiles.idMensaje();

				Mensaje m1 = new Mensaje(idMensajeRandom, Mensaje.TIPO_CLIENTE, idEmisor, Mensaje.TIPO_GESTOR,
						idReceptor, texto);

				mensajes.put(m1.getId(), m1);

				System.out.println();

				System.out.println("MENSAJE CONFIRMADO:");

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

				boolean loginCorrecto = tienePass && clienteParaLogin.equals(pass);

				if (loginCorrecto) {

					System.out.println("correcto!");
				} else {
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
