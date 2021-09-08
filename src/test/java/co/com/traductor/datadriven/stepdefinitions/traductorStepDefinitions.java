package co.com.traductor.datadriven.stepdefinitions;

import co.com.traductor.datadriven.model.GoogleTraslateData;
import co.com.traductor.datadriven.questions.Larespuesta;
import co.com.traductor.datadriven.tasks.OpenUp;
import co.com.traductor.datadriven.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class traductorStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Felipe quiere usar el traductor de google$")
    public void queFelipeQuiereUsarElTraductorDeGoogle() {
        OnStage.theActorCalled("Felipe").attemptsTo(OpenUp.thePage());
    }

    @When("^el traduce una palabra de ingles a español$")
    public void elTraduceUnaPalabraDeInglesAEspañol(List<GoogleTraslateData> GoogleTraslateData) {
        OnStage.theActorCalled("Felipe").attemptsTo(Traducir.DeInglesAEspanol(GoogleTraslateData));

    }

    @Then("^el deberia ver la palabra traducida del idioma origen a idioma destino$")
    public void elDeberiaVerLaPalabraTraducidaDelIdiomaOrigenAIdiomaDestino(List<GoogleTraslateData> GoogleTraslateData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Larespuesta.es(GoogleTraslateData), Matchers.equalTo(GoogleTraslateData.get(0).getPalabrae())));
    }
}
