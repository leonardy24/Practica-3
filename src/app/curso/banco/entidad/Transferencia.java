package app.curso.banco.entidad;


public class Transferencia extends Mensaje{
	
	private float dinero;
	
	public static final char TIPO_CLIENTE = 'c';
	public static final char TIPO_GESTOR = 'g';

	
	public Transferencia (int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje, int dinero ) {
		super(id, tipoEmisor,idEmisor,tipoReceptor,idReceptor,textoMensaje);
		this.dinero = dinero;
		
		
	}

	public void mostrarInfoTransferencia() {
		System.out.println("ID DE TRANSFERENCIA :" + this.id );
		System.out.println("TIPO EMISOR :" + this.tipoEmisor );
		System.out.println("ID EMISOR :" + this.idEmisor );
		System.out.println("TIPO RECEPTOR :" + this.tipoReceptor );
		System.out.println("ID RECEPTOR :" + this.idReceptor );
		System.out.println("CONCEPTO :" + this.textoMensaje );
		System.out.println("DINERO :" + this.dinero );
		System.out.println("-----------------------------------");
	}
	
	public void mostrarInfoUnitarioTra() {
		System.out.println("ID DE TRANSFERENCIA :" + this.id );
		System.out.println("DINERO:" + this.textoMensaje );
		System.out.println("-----------------------------------");

	};
		
	
	
	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	public static char getTipoCliente() {
		return TIPO_CLIENTE;
	}

	public static char getTipoGestor() {
		return TIPO_GESTOR;
	}

	public String toString() {
		
		String texto = super.toString();
		texto+="dinero" + this.dinero+"eURO";
		
		return texto;
	}
}
