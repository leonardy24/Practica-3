package app.curso.banco.entidad;

import java.util.HashMap;

public class 	Cliente extends Personas {

//	private int id ;
	//private String nombre;
	//private String telefono;
	private int totalDinero;
	private float agregarDinero;
	private float retirarDinero;
	private HashMap<String, Float> cuentas;

	public Cliente() {
		
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("total dinero:" + this.totalDinero + "€" );
		System.out.println("---------------------------------");

	}
	
	public void mostrar() {
		super.mostrar();
	}
	
	
	
	public Cliente( int id, String nombre, String telefono, int totalDinero) {
		super(id,  nombre, telefono);
		this.totalDinero = totalDinero;
		//this.cuentas =  new HashMap<>();
	}
	
	/*public Cliente(int id, String nombre, String telefono) {
	 	this.id = id;
	 	this.nombre = nombre;
	 	this.telefono = telefono;
	};*/
	
	/*public Cliente (int id, String nombre, String telefono) {
		super();
	};*/
	
	

	//funcion agregar dinero
	public float agregarDinero(float agregarDinero) {
		this.totalDinero += agregarDinero;
		
		return this.totalDinero;
	}
	
	//funcion retirar dinero
	public float retirarDinero(float dinero) {
		this.retirarDinero = dinero;
		if(this.totalDinero - this.retirarDinero > 0 ) {
		this.totalDinero -= this.retirarDinero;
		System.out.println("se retiro:" + retirarDinero );
		}else {
			System.out.println("dinero insuficeite" );
		}return this.totalDinero;
	}
	
	//HashMap
	// abrir cuenta
	public void abrirCuenta(String idCuenta, Float dinero) {
		this.cuentas.put(idCuenta, dinero);	
		agregarDinero(dinero);
		System.out.println("se ha creado una cuenta con monto:" + dinero );
	};
	
	
	///cerra cuenta
	
	public void cerrarCuenta(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		retirarDinero(idCuenta, dineroEnCuenta);
		this.cuentas.remove(idCuenta);
		System.out.println("esta ceunta se ha eliminado");
		
	}
	
	
	///agregar dinero HasMap
	
	public float agregarDinero(String idCuenta, Float dinero) {
		
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if( dineroEnCuenta != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta + dinero);
			agregarDinero(dinero);
		
		}else {
			System.out.println("la cuenta no existe" );

		}return this.totalDinero;
	}
		///retirar dinero en HaspMap
	
		public float retirarDinero(String idCuenta, Float dinero) {
			Float dineroEnCuenta = this.cuentas.get(idCuenta);
			if(dineroEnCuenta != null) {
				this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
				retirarDinero(dinero);
				
		}else {
			System.out.println("dinero insuficeite" );
		}return this.totalDinero;
		
		}
		
		
		
		public void mostrarCuentas() {
			this.cuentas.forEach((idCuenta, dinero) ->{
				System.out.println(">" + idCuenta + ":" + dinero +"E");
			});
		
		};
	
		
	public HashMap<String, Float> getCuentas() {
			return cuentas;
		}

		public void setCuentas(HashMap<String, Float> cuentas) {
			this.cuentas = cuentas;
		}

	public  float  getTotalDinero() {
		return this.totalDinero;
	}
	
	public  void  setTotalDinero(int totalDinero) {
		this.totalDinero = totalDinero;
	}
	
	
	public float getAgregarDinero() {
		return agregarDinero;
	}

	public void setAgregarDinero(float agregarDinero) {
		this.agregarDinero = agregarDinero;
	}

	public float getRetirarDinero() {
		return retirarDinero;
	}

	public void setRetirarDinero(float retirarDinero) {
		this.retirarDinero = retirarDinero;
	}
	
	
}
