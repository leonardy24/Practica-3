package app.curso.banco.entidad;

public class Personas {

	protected int id;
	protected  String nombre;
	protected  String telefono;
	protected int nuevoId;

	protected String password;
	 



	//contructor por defecto
	public Personas(){
		 }
	 
	 
	
	//contructor parametrizado
	public Personas (int id, String nombre, String telefono ) {
		 	this.id = id;
		 	this.nombre = nombre;
			this.telefono = telefono;
		 
		 
	}

	public void mostrarInfo() {
		System.out.println("Id:" + this.id );
		System.out.println("Nombre:" + this.nombre );
		System.out.println("Telefono:" + this.telefono );
		
	}
	
	public void mostrar() {
		System.out.println("Id:"+this.id);
		System.out.println("Nombre:"+this.nombre);
		System.out.println("--------------------------------------------");

	}
	
	
	public	int actualizarPersona(int nuevoId) {
		this.nuevoId = nuevoId;
		return nuevoId;
	}
	
	

	public int getNuevoId() {
		return nuevoId;
	}



	public void setNuevoId(int nuevoId) {
		this.nuevoId = nuevoId;
	}



	public int getId() {
		return id;
	}

	public void  setId(int id) {
		this.id=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	
}