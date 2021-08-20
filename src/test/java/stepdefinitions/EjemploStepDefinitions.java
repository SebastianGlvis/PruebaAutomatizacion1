package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.reports.remoteTesting.BrowserStackLinkGenerator;
import org.openqa.selenium.WebDriver;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();
    private BuscarProducto buscarProducto = new BuscarProducto();



    @Dado("^\\(precondiciones\\) que un nuevo cliente Arturo accede hasta la web de compras$")
    public void precondicionesQueUnNuevoClienteArturoAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agrega (.*), (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
                co.com.example.tasks.AgregarProducto.cantidad(cantidad)
        );
    }

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {

    }

}

