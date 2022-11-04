package app.curso.banco.entidad;

public class Mensaje {
	
	protected int id;
	
	protected char tipoEmisor;
	protected int idEmisor;
	
	protected char tipoReceptor;
	protected int idReceptor;
	
	protected String textoMensaje;
	
	public static final char TIPO_CLIENTE = 'c';
	public static final char TIPO_GESTOR = 'g';

	
	public Mensaje () {
		
	}
	
	public Mensaje(int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje ) {
	
		this.id= id;
		this.tipoEmisor= tipoEmisor;
		this.idEmisor= idEmisor;
		this.tipoReceptor = tipoReceptor;
		this.idReceptor = idReceptor;
		this.textoMensaje = textoMensaje;
		
		
	}

	public void mostrarInfoMensaje() {
		System.out.println("ID DE MENSAJE :" + this.id );
		System.out.println("TIPO EMISOR :" + this.tipoEmisor );
		System.out.println("ID EMISOR :" + this.idEmisor );
		System.out.println("TIPO RECEPTOR :" + this.tipoReceptor );
		System.out.println("ID RECEPTOR :" + this.idReceptor );
		System.out.println("MENSAJE :" + this.textoMensaje );
		System.out.println("-----------------------------------");
	}
	
	public void mostrarInfoUnitario() {
		System.out.println("ID DE MENSAJE :" + this.id );
		System.out.println("ID EMISOR :" + this.idEmisor );
		System.out.println("ID RECEPTOR :" + this.idReceptor );
	};
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getTipoEmisor() {
		return tipoEmisor;
	}

	public void setTipoEmisor(char tipoEmisor) {
		this.tipoEmisor = tipoEmisor;
	}

	public int getIdEmisor() {
		return idEmisor;
	}

	public void setIdEmisor(int idEmisor) {
		this.idEmisor = idEmisor;
	}

	public char getTipoReceptor() {
		return tipoReceptor;
	}

	public void setTipoReceptor(char tipoReceptor) {
		this.tipoReceptor = tipoReceptor;
	}

	public int getIdReceptor() {
		return idReceptor;
	}

	public void setIdReceptor(int idReceptor) {
		this.idReceptor = idReceptor;
	}

	public String getTextoMensaje() {
		return textoMensaje;
	}

	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}

	public static char getTipoCliente() {
		return TIPO_CLIENTE;
	}

	public static char getTipoGestor() {
		return TIPO_GESTOR;
	}

	public String toString() {
		
		String texto =  "ID DE MENSAJE :"+  this.id + "  "  + this.tipoEmisor + "  "+"ID DEL EMISOR :" + this.idEmisor+ "  " + "Para" + "  " + this.tipoReceptor + "  "+"ID del receptor :" +this.idReceptor+ "   "+ "MENSAJE :" + this.textoMensaje;
		
		return texto;
	}
	
	
}
