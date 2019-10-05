package co.com.vivanda.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {

	public static final Target BUSCAR = Target.the("Cuadro de texto para ingresar los productos a buscar")
			.located(By.xpath("//input[@class='input-text js-input-search']"));
	public static final Target LUPA = Target.the("Lupa para buscar productos")
			.located(By.xpath("//button[@class='icon icon-search box-search-submit js-btn-search-submit']"));
	
	public static final Target PRODUCTO = Target.the("Producto elegido para agregar al carrito")
			.located(By.xpath("//a[@class='buy-button-normal-a11582']"));
	
	public static final String URL_VIVANDA="https://www.vivanda.com.pe/";
	
}
