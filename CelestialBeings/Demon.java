package CelestialBeings;

import BeingsOfTheEarth.LivingBeing;

public class Demon extends LivingBeing implements HellBeing {

    public void fly() {
        System.out.println("Volando como un demonio, soy una gargolaaa🎶🎶 (lore reggaeton)...");
    }

    public void changeDimension() {
        System.out.println("Cambiando de dimensión like a demon, es algo que sucede, no lo controlo...");
    }

    public void possessHumans() {
        System.out.println("Poseyendo humanos (No se a cual, si no hay ninguno, es a Diogenes, el siempre está)...");
    }

    @Override
    public void doEvilDeeds() {
        System.out.println("Haciendo cositas malas...");
    }
}