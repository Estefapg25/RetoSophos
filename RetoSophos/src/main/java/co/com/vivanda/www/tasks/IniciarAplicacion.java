package co.com.vivanda.www.tasks;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class IniciarAplicacion implements Task{
		
		private WebDriver hisBrowser;
		private String url;
		
		public IniciarAplicacion(WebDriver hisBrowser, String url) {
			this.hisBrowser = hisBrowser;
			this.url = url;
		}
		
		@Step("{0} Abre el navegador en la ruta #url" )
		@Override
		public <T extends Actor> void performAs(T actor) {
			actor.can(BrowseTheWeb.with(hisBrowser));
			actor.wasAbleTo(Open.url(url));	
		}
		
		public static IniciarAplicacion with(WebDriver hisBrowser, String url) {
			return Tasks.instrumented(IniciarAplicacion.class, hisBrowser, url);
		}

}
