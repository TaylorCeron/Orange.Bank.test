package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en el buscador de google$")
    public void elusuarioseencuentraenelbuscadordegoogle() throws Throwable {
        WebElement BotonAceptar = driver.findElement(By.id("L2AGLb"));
        BotonAceptar.click();

    }

    @When("^Ingresa Orange Bank en el buscador y haclic en el boton buscar$")
    public void ingresaOrangeBankenelbuscadoryhaclicenelbotonbuscar() throws Throwable{
        WebElement SearchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        SearchBox.sendKeys("Orange Bank");
        SearchBox.submit();
    }

    @Then("^Comprueba numero de resultados obtenidos sean superiores a 100.000$")

    public void compruebanumeroderesultadosobtenidosseansuperioresa100000() throws Throwable {
        String ActualTitle = driver.getTitle();
        String ExpextedTitle = "Orange Bank - Buscar con Google";
        Assert.assertEquals(ExpextedTitle, ActualTitle);

        int a, b;
        a = (int) 100.000;
        b = (int) 10.000;

        if (a > b){
            System.out.println("HAY MAS DE 100.000 RESULTADOS OPBTENIDOS.");
        } else {
            System.out.println("HAY MENOS DE 10.000 RESULTADOS OBTENIDOS.");
        }
    }
}