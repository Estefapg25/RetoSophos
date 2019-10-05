package co.com.vivanda.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasPage {
	
	public static final Target DESCRIPCION_PRODUCTO = Target.the("descripción del producto seleccionado")
			.located(By.xpath("//div[@class='minicart__items-container']"));
	public static final Target CARRITO_COMPRAS = Target.the("Botón con el carrito de compras")
			.located(By.xpath("//i[@class='minicart__btn__icon-i']"));

}
