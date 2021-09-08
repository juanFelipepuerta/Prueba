package co.com.traductor.datadriven.tasks;

import co.com.traductor.datadriven.model.GoogleTraslateData;
import co.com.traductor.datadriven.userinterface.PaginaLocalizadore;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Traducir implements Task {
    private List<GoogleTraslateData> googleTraslateData;

    public Traducir(List<GoogleTraslateData> googleTraslateData) {

        this.googleTraslateData = googleTraslateData;
    }

    public static Traducir DeInglesAEspanol(List<GoogleTraslateData> googleTraslateData) {
        return Tasks.instrumented(Traducir.class,googleTraslateData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Enter.theValue(googleTraslateData.get(0).getPalabrai()).into(PaginaLocalizadore.PALABRA_I));
    }

}
