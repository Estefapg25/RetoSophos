package co.com.vivanda.www.tasks;

import static co.com.vivanda.www.ui.CarritoComprasPage.CARRITO_COMPRAS;
import static co.com.vivanda.www.ui.EntregaPage.BOTON_CONTINUAR;
import static co.com.vivanda.www.ui.EntregaPage.CONFIRMAR_CONTINUAR;
import static co.com.vivanda.www.ui.EntregaPage.DESPACHO_DOMICILIO;
import static co.com.vivanda.www.ui.EntregaPage.DISTRITO;
import static co.com.vivanda.www.ui.EntregaPage.SELECCIONAR_DISTRITO;
import static co.com.vivanda.www.ui.ProductosPage.BUSCAR;
import static co.com.vivanda.www.ui.ProductosPage.LUPA;
import static co.com.vivanda.www.ui.ProductosPage.PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.vivanda.www.interactions.Esperar;
import co.com.vivanda.www.ui.EntregaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarYAgregarProducto implements Task {

	private String nombreProducto;
	private String entregaProducto = "San Luis";

	public BuscarYAgregarProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(nombreProducto).into(BUSCAR), Click.on(LUPA), Esperar.unMomento(5000),
				Click.on(PRODUCTO), Esperar.unMomento(4000), Click.on(DESPACHO_DOMICILIO), Click.on(DISTRITO), Click.on(SELECCIONAR_DISTRITO.of(entregaProducto)),
				Click.on(BOTON_CONTINUAR), Click.on(CONFIRMAR_CONTINUAR), Esperar.unMomento(8000),
				Click.on(CARRITO_COMPRAS));
	}

	public static BuscarYAgregarProducto OCategorias(String nombreProducto) {
		return instrumented(BuscarYAgregarProducto.class, nombreProducto);
	}

}
