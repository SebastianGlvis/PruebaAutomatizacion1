package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se realiza la busqueda").located(By.id("search_query_top"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the( "Boton buscar articulo").located(By.className("btn btn-default button-search"));
    public static final Target LINK_OBJETO_ENCONTRADO  = Target.the("Link objeto encontrado").locatedBy("//a[starts-with(@title,'{0}')]");

}
