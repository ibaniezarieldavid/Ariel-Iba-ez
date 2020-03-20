package classes;

public class Seller {
	String codigoSeller;
	String nombre;
	String sueldo;

	public Seller(String codigoSeller, String nombre, String sueldo) {
		this.codigoSeller = codigoSeller;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getCodigoSeller() {
		return codigoSeller;
	}

	public void setCodigoSeller(String codigoSeller) {
		this.codigoSeller = codigoSeller;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

}
