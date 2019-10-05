package co.com.vivanda.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EntregaPage {

	public static final Target DISTRITO = Target.the("Lista donde estan las opciones para los distritos")
			.located(By.xpath("//select[@name='distrito']"));

	public static final Target SELECCIONAR_DISTRITO = Target.the("Opciones de la lista desplegable de distritos")
			.locatedBy("//option[contains(text(),'{0}')]");
	
	public static final Target DESPACHO_DOMICILIO = Target.the("Opcion para entregar a domicilio")
			.locatedBy("//button[@data-name='express']");
	
	
	public static final Target BOTON_CONTINUAR = Target.the("Botón para continuar al carrito").
			locatedBy("(//button[@data-ubigeo='150134'])[2]");
	
	public static final Target CONFIRMAR_CONTINUAR = Target.the("Botón para confirmar la entrega").
			locatedBy("//button[@class='SalesChannel__confirmButton SalesChannel__confirmButton--ubigeo SalesChannel_confirmButton--active']");
	
	

}
