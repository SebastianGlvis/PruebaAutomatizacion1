package tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {

    private String descripcion;

    public BuscarProducto(String descripcion){
        this.descripcion = descripcion;

    }

    public BuscarProducto() {

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(descripcion).into(""),
                SelectFromOptions.byVisibleText( "").from(),
                Hit.the(Keys.ENTER).into(),
                Click.on()
        );
     }

    public static BuscarProducto conDescripcion(String descripcion ) {
        return instrumented(BuscarProducto.class, descripcion );
    }
}
