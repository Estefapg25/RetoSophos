package co.com.vivanda.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregar_producto_al_carrito_de_compras.feature", 
glue = "co.com.vivanda.www.stepdefinitions", 
snippets = SnippetType.CAMELCASE)

public class AgregarProductoAlCarritoDeCompras {
}
