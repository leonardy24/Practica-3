package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.util.utiles;

import app.curso.banco.entidad.*;

public class ConsolaBanco {

	public static void main(String[] args) {
		HashMap<Integer, Gestor> listasGestores = new HashMap<>();

		HashMap<Integer, Cliente> listasClientes = new HashMap<>();

		HashMap<Integer, Mensaje> mensajes = new HashMap<>();

		HashMap<Integer, Transferencia> transferencia = new HashMap<>();

		// commitenclases
		Scanner keyboard = new Scanner(System.in);

		Gestor g1 = null;
		Cliente c1 = null;

		// Integer numero1 = null;
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
			System.out.println("15. Obtencion de una transferencia");
			System.out.println("16. Obtencion de todas las transferencia");
			System.out.println("17. Envio de una transferencia");
			System.out.println("18. Login");
			System.out.println("19. Registro");

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

				System.out.println("numero de id de oficina");

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
				Integer numero = null;

				if (listasGestores.size() > 0) {
					listasGestores.forEach((id, gestor) -> {
						gestor.mostrar();
					});

					System.out.println("COLACA EL NUMERO DE ID DEL GESTOR, PARA VER MAS INFORMACION :");
					numero = keyboard.nextInt();

					if (listasGestores.get(numero) != null) {

						Gestor obtenerCliente = listasGestores.get(numero);
						System.out.println("---------------------------------------------");

						obtenerCliente.mostrarInfo();
						System.out.println("---------------------------------------------");

					} else {

						System.out.println("NO EXISTEN GESTOR");
						System.out.println("_____________________________________________");

					}

				} else {
					System.out.println("NO EXISTE GESTORES");
					System.out.println("_____________________________________________");

				}
				break;

			case 4:
				// OBTENIENDO TODOS LOS GESTORES
				System.out.println("_____________________________________________");
				System.out.println("OBTENIENDO TODOS LOS GESTORES");
				System.out.println("--------------------------------------------");

				if (listasGestores.size() > 0) {
					System.out.println("GESTORES EXISTENTES");
					listasGestores.forEach((id, gestor) -> {
						gestor.mostrarInfo();
						System.out.println("_____________________________________________");

					});

				} else {
					System.out.println("NO EXISTEN GESTOR");
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
					System.out.println("Ingrese el id del gestor a actualizar:");
					System.out.println("--------------------------------------------");
					Integer numeroActualizar = keyboard.nextInt();
					if (listasGestores.get(numeroActualizar) != null) {

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

						if (newId == 0) {
							System.out.println("------------------ID NO SE ACTUALIZO--------------");
						} else {
							actualizar.setId(newId);
						}

						if (newNombre.equals(noActuazlizar)) {
							System.out.println("------------------NOMBRE NO SE ACTUALIZO--------------");
						} else {
							actualizar.setNombre(newNombre);
						}

						if (newTlfn.equals(noActuazlizar)) {
							System.out.println("------------------TELEFONO NO SE ACTUALIZO--------------");
						} else {
							actualizar.setTelefono(newTlfn);
						}

						if (newIdOficina == 0) {
							System.out.println("------------------ID OFICINA NO SE ACTUALIZO--------------");
						} else {
							actualizar.setIdOficina1(newIdOficina);
						}

						System.out.println("--------------------------------------------");
						System.out.println("GESTOR SE HA ACTUALIZADO");
						System.out.println("--------------------------------------------");

						actualizar.mostrarInfo();

						System.out.println("___________________________________________");

					}
				} else {
					System.out.println("NO EXISTE GESTORES");
					System.out.println("___________________________________________");

				}

				break;
			case 6:
				System.out.println("______________________________________________");

				System.out.println("ELIMINANDO GESTOR");
				System.out.println("--------------------------------------------");
				System.out.println("INGRESE EL NUMERO DE ID QUE DESEA ELIMINAR:");
				Integer idEliminado = keyboard.nextInt();

				if (listasGestores.get(idEliminado) != null) {
					listasGestores.remove(idEliminado);
					System.out.println("El GESTOR SE HA ELIMINADO");
					System.out.println("______________________________________________");

				} else {
					System.out.println("EL GESTOR NO EXISTE");
					System.out.println("______________________________________________");

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

				c1 = new Cliente(idNuevoCliente, nombreCliente, numeroTlfnCliente, dinero);

				listasClientes.put(c1.getId(), c1);

				System.out.println("SE HA CREADO UN NUEVO CLIENTE");

				System.out.println("--------------------------------------------");

				break;
			case 8:
				// obteccion de un cliente

				System.out.println("_____________________________________________");
				System.out.println("OBTENER UN CLIENTE");
				System.out.println("-------------------------------------------");
				Integer numeroCliente = null;

				if (listasClientes.size() > 0) {
					listasClientes.forEach((id, clientes) -> {
						clientes.mostrar();
					});
					System.out.println("COLACA EL NUMERO DE ID DEL CLIENTE, PARA VER MAS INFORMACION :");
					numeroCliente = keyboard.nextInt();

					if (listasClientes.get(numeroCliente) != null) {

						System.out.println("--------------------------------------------");

						Cliente obtenerCliente = listasClientes.get(numeroCliente);

						obtenerCliente.mostrarInfo();

						System.out.println("_____________________________________________");

					} else {
						System.out.println("NO EXISTEN CLIENTE");
						System.out.println("_____________________________________________");

					}

				} else {
					System.out.println("NO EXISTEN CLIENTES");
					System.out.println("_____________________________________________");

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
					System.out.println("NO EXISTEN CLIENTES");
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

					if (listasClientes.get(numeroActualizarCliente) != null) {

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

						if (newId == 0) {
							System.out.println("------------------ID NO SE ACTUALIZO--------------");
						} else {
							actualizar.setId(newId);
						}

						if (newNombre.equals(noActuazlizar)) {
							System.out.println("------------------NOMBRE NO SE ACTUALIZO--------------");
						} else {
							actualizar.setNombre(newNombre);
						}

						if (newTlfn.equals(noActuazlizar)) {
							System.out.println("------------------TELEFONO NO SE ACTUALIZO--------------");
						} else {
							actualizar.setTelefono(newTlfn);
						}

						if (newDinero == 0) {
							System.out.println("------------------MONTO NO SE ACTUALIZO--------------");
						} else {
							actualizar.setTotalDinero(newDinero);
						}

						System.out.println("___________________________________________");
						System.out.println("CLIENTE SE HA ACTUALIZADO");
						actualizar.mostrarInfo();

						System.out.println("___________________________________________");
					} else {
						System.out.println("NO EXISTE CLIENTE");
						System.out.println("___________________________________________");

					}

				} else {
					System.out.println("NO EXISTEN CLIENTES");
					System.out.println("___________________________________________");

				}

				break;
			case 11:
				
				System.out.println("________________________________");
				System.out.println("ELIMINANDO CLIENTE");
				System.out.println("---------------------------------");

				if (listasClientes.size() > 0) {
					listasClientes.forEach((id, clientes) -> {
						clientes.mostrarInfo();
					});
					System.out.println("---------------------------------");

					System.out.println("INGRESE EL NUMERO DE ID QUE DESEA ELIMINAR:");
					System.out.println("---------------------------------");
					Integer clienteEliminar = keyboard.nextInt();

					if (listasClientes.get(clienteEliminar) != null) {

						listasClientes.remove(clienteEliminar);
						System.out.println("El CLIENTE SE HA ELIMINADO");
						System.out.println("________________________________");

					} else {
						System.out.println("EL CLIENTE NO EXISTE");
						System.out.println("________________________________");

					}

				} else {
					System.out.println("EL CLIENTE NO EXISTE");
					System.out.println("________________________________");

				}

				break;
			case 12:
				// obteccion de un mensaje
				System.out.println("________________________________");
				System.out.println("OBTENER UN MENSAJE");
				System.out.println();
				System.out.println("MOSTRANDO MENSAJES EXISTENTES");
				System.out.println("---------------------------------");

				if (mensajes.size() > 0) {
					mensajes.forEach((id, todosMensanjes) -> {
						todosMensanjes.mostrarInfoUnitario();
					});

					System.out.println("COLOCA EL ID DEL MENSAJE PARA OBTENER MAS INFORMACION:");
					Integer idObtenerMensaje = keyboard.nextInt();
					System.out.println("-----------------------------------");

					if (mensajes.get(idObtenerMensaje) != null) {

						Mensaje llamado = mensajes.get(idObtenerMensaje);

						llamado.mostrarInfoMensaje();

					} else {
						System.out.println("NO EXISTE MENSAJES");
						System.out.println("-----------------------------------");

					}

				} else {
					System.out.println("NO EXISTE MENSAJES");
					System.out.println("-----------------------------------");

				}

				break;
			case 13:
				// obteccion de todos los mensajes

				System.out.println("OBTENIENDO TODOS LOS MENSAJES");
				System.out.println("-----------------------------------");

				if (mensajes.size() > 0) {
					mensajes.forEach((id, todosMensanjes) -> {
						todosMensanjes.mostrarInfoMensaje();

					});

				} else {
					System.out.println("NO EXISTE MENSAJE");
					System.out.println("-----------------------------------");

				}

				break;
			case 14:
				// envio de mensaje
				System.out.println("____________________________________");
				System.out.println("CREANDO  MENSAJE");
				System.out.println();
				System.out.println("-----------------------------------");
				System.out.println("INGRESE NUMERO DE ID DEL EMISOR:");
				int idEmisor = keyboard.nextInt();
				System.out.println("-----------------------------------");
				System.out.println("INGRESE NUMERO DE ID DEL RECEPTOR:");
				int idReceptor = keyboard.nextInt();
				System.out.println("INGRESE SU MENSAJE:");
				String texto = keyboard.next();
				System.out.println("-----------------------------------");

				int idMensajeRandom = utiles.idMensaje();

				Mensaje m1 = new Mensaje(idMensajeRandom, Mensaje.TIPO_CLIENTE, idEmisor, Mensaje.TIPO_GESTOR,
						idReceptor, texto);

				mensajes.put(m1.getId(), m1);

				System.out.println("MENSAJE CONFIRMADO:");
				System.out.println();
				m1.mostrarInfoUnitario();

				System.out.println("_________________________________________");

				break;
			case 15:
				// OBTENCION DE UNA TRANSFERENCIA
				System.out.println("________________________________");
				System.out.println("OBTENER UNA TRANSFERENCIA");
				System.out.println();
				System.out.println("MOSTRANDO TRANSFERENCIAS EXISTENTES");
				System.out.println("---------------------------------");

				if (transferencia.size() > 0) {
					transferencia.forEach((id, todasTransferencias) -> {
						todasTransferencias.mostrarInfoUnitarioTra();
					});
					System.out.println("COLOCA EL ID DE LA TRANSFERENCIA PARA OBTENER MAS INFORMACION:");
					Integer idObtenerTransferencia = keyboard.nextInt();

					if (transferencia.get(idObtenerTransferencia) != null) {
						System.out.println("-----------------------------------");
						Transferencia obtenerTransferencias = transferencia.get(idObtenerTransferencia);
						obtenerTransferencias.mostrarInfoTransferencia();

					} else {
						System.out.println("NO EXISTE TRANSFERENCIAS");
						System.out.println("-----------------------------------");

					}

				} else {
					System.out.println("NO EXISTE TRANSFERENCIAS");
					System.out.println("-----------------------------------");

				}

				break;
			case 16:
				// OBTENCION DE TODAS LAS TRANSFERENCIAS
				System.out.println("OBTENIENDO TODOS LAS TRANSFERENCIAS");
				System.out.println("-----------------------------------");

				if (transferencia.size() > 0) {
					transferencia.forEach((id, todasTransferencias) -> {
						todasTransferencias.mostrarInfoTransferencia();

					});

				} else {
					System.out.println("NO EXISTE TRANSFERENCIA");
					System.out.println("-----------------------------------");

				}

				break;
			case 17:
				// ENVIO DE UNA TRANSFERENCIA
				System.out.println("____________________________________");
				System.out.println("CREANDO  TRANSFERENCIA");
				System.out.println();
				System.out.println("-----------------------------------");
				System.out.println("INGRESE NUMERO DE ID DEL EMISOR:");
				int idEmisorTra = keyboard.nextInt();
				System.out.println("-----------------------------------");
				System.out.println("INGRESE NUMERO DE ID DEL RECEPTOR:");
				int idReceptorTra = keyboard.nextInt();
				System.out.println("INGRESE CONCEPTO:");
				String concepto = keyboard.next();
				System.out.println("-----------------------------------");
				System.out.println("INGRESE MONTO A TRANSFERIR:");
				int monto = keyboard.nextInt();

				int idTransferenciaRandom = utiles.idTransferencia();

				Transferencia t1 = new Transferencia(idTransferenciaRandom, Transferencia.TIPO_CLIENTE, idEmisorTra,
						Transferencia.TIPO_GESTOR, idReceptorTra, concepto, monto);

				transferencia.put(t1.getId(), t1);

				System.out.println("TRANSFERENCIA CONFIRMADA:");
				System.out.println("---------------------------");
				t1.mostrarInfoUnitarioTra();

				System.out.println("_________________________________________");

				break;
			case 18:
				System.out.println("_________________________________________");
				System.out.println("LOGIN CLIENTE");
				System.out.println("ingrese el id del cliente");
				int idCliente = keyboard.nextInt();

				Cliente clienteParaLogin = listasClientes.get(idCliente);
				System.out.println("----------------------------------------");

				System.out.println("contraseña:");
				String pass = keyboard.next();

				String passCliente = clienteParaLogin.getPassword();

				boolean tienePass = passCliente != null;

				boolean loginCorrecto = tienePass && clienteParaLogin.equals(pass);

				if (loginCorrecto) {

					System.out.println("correcto!");
					System.out.println("_________________________________________");

				} else {
					System.out.println("incorrecta");
					System.out.println("_________________________________________");

				}

				break;
			case 19:
				System.out.println("_________________________________________");

				System.out.println("id del cliente a registrar:");
				int idARegistrar = keyboard.nextInt();
				Cliente clienteParaRegistro = listasClientes.get(idARegistrar);

				if (listasClientes.size() > 0) {

					System.out.println("------------------------------------------");

					if (listasClientes.get(idARegistrar) != null) {
						System.out.println("ingrese contraseña:");
						String nuevaPass = keyboard.next();
						clienteParaRegistro.setPassword(nuevaPass);
						System.out.println("------------------------------------------");

						listasClientes.put(clienteParaRegistro.getId(), clienteParaRegistro);
						System.out.println("SE HA REGISTRADO CORRECTAMENTE");

						System.out.println("_________________________________________");

					} else {
						System.out.println("NO EXISTEN CLIENTES");
					}
				} else {
					System.out.println("NO EXISTEN CLIENTES");
				}
				break;
			default:
				System.out.println("Opción desconocida...");
				break;
			}

		} while (menuSeleccionado != 0);

	}

}
