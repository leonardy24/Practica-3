package app.curso.banco.entidad;

public class Gestor extends Personas {
	
	

	protected int idOficina1;
	
	public Gestor  ( int id, String nombre, String telefono, int idOficina) {
		super(id , nombre , telefono);
		this.idOficina1 = idOficina;
		
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Id Oficina :" + idOficina1 );
		System.out.println("--------------------------------------------");

	
	}
	
	public void mostrar() {
		super.mostrar();
	}
	
	
	
	

	public void actualizarPersona() {
		super.actualizarPersona(nuevoId);
		System.out.println("nuevo ID:" + nuevoId );
		System.out.println("--------------------------------------------");
	}
	
	
	
	public int getIdOficina1() {
		return idOficina1;
	}

	public void setIdOficina1(int idOficina1) {
		this.idOficina1 = idOficina1;
	}
	
	
	
	


}
