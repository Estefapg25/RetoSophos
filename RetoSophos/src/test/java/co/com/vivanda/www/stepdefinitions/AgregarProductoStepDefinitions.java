package co.com.vivanda.www.stepdefinitions;

import static co.com.vivanda.www.ui.CarritoComprasPage.DESCRIPCION_PRODUCTO;
import static co.com.vivanda.www.ui.ProductosPage.URL_VIVANDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import co.com.vivanda.www.exceptions.ElementoNoVisibleException;
import co.com.vivanda.www.models.Producto;
import co.com.vivanda.www.questions.ValidarProducto;
import co.com.vivanda.www.tasks.BuscarYAgregarProducto;
import co.com.vivanda.www.tasks.IniciarAplicacion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class AgregarProductoStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver elNavegador;

	@Before
	public void before() {
		setTheStage(new OnlineCast());

		Estefa.can(BrowseTheWeb.with(elNavegador));
	}

	private Actor Estefa = Actor.named("Estefa");

	@Given("^el cliente ingresa a la pagina de vivanda$")
	public void elClienteIngresaAlaPaginaDeVivanda() {

		Estefa.wasAbleTo(IniciarAplicacion.with(elNavegador, URL_VIVANDA));
	}

	@When("^el cliente busca un producto y lo agrega a la canasta de compra$")
	public void elClienteBuscaUnProductoYloAgregaAlaCanastaDeCompra(List<Producto> producto) {

		Estefa.attemptsTo(BuscarYAgregarProducto.OCategorias(producto.get(0).getNombreProducto()));

	}

	@Then("^el cliente puede ver el producto en el carrito de compras$")
	public void elClientePuedeVerElProductoEnElCarritoDeCompras(List<Producto> producto) {
		Estefa.should(seeThat(ValidarProducto.queSeAgregoAlCarrito(DESCRIPCION_PRODUCTO),
				containsString(producto.get(0).getDescripcionProducto())).orComplainWith(
						ElementoNoVisibleException.class, ElementoNoVisibleException.PRODUCTO_NO_ENCONTRADO));
	}

}
