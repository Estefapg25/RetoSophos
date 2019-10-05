package co.com.vivanda.www.exceptions;

public class ElementoNoVisibleException extends AssertionError {

	public static final String PRODUCTO_NO_ENCONTRADO = "El producto buscado no se encuentró en el carrito de compras";

	public ElementoNoVisibleException(String message) {
		super(message);
	}

	public ElementoNoVisibleException(String message, Throwable cause) {
		super(message, cause);
	}
}
