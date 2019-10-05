package co.com.vivanda.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarProducto implements Question<String> {

	private Target target;

	public ValidarProducto(Target target) {
			this.target = target;
		}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(target).viewedBy(actor).value();

	}

	public static ValidarProducto queSeAgregoAlCarrito(Target mensaje) {

		return new ValidarProducto(mensaje);
	}

}
