package co.com.vivanda.www.models;

public class Producto {

	private String nombreProducto;
	private String precio;
	private String descripcionProducto;
	private String tipoProducto;

	public Producto(String nombreProducto, String precio, String descripcionProducto, String tipoProducto) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
		this.descripcionProducto = descripcionProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public String getPrecio() {
		return precio;
	}
	
	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}
	
	
}
