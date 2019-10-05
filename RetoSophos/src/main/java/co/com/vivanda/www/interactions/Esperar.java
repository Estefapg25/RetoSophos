package co.com.vivanda.www.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction {
	
private int tiempoEspera;
	
	public Esperar(int tiempoEspera) {
		
		this.tiempoEspera = tiempoEspera;
	}

	
	public static Esperar unMomento(int tiempoEspera) {
		return instrumented(Esperar.class, tiempoEspera);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(tiempoEspera);
	}


}

