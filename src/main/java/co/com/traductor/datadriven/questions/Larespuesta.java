package co.com.traductor.datadriven.questions;

import co.com.traductor.datadriven.model.GoogleTraslateData;
import co.com.traductor.datadriven.userinterface.PaginaLocalizadore;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Larespuesta implements Question<String> {
    private List<GoogleTraslateData> googleTraslateData;

    public Larespuesta(List<GoogleTraslateData> googleTraslateData) {
        this.googleTraslateData = googleTraslateData;
    }

    public static Larespuesta es(List<GoogleTraslateData> googleTraslateData) {
        return new Larespuesta(googleTraslateData);
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(PaginaLocalizadore.PALABRA_E).viewedBy(actor).asString();
    }
}
