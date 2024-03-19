package CelestialBeings;

import BeingsOfTheEarth.LivingBeing;

public class Angel extends LivingBeing implements SkyBeing {
    @Override
    public void fly() {
        System.out.println("Volando como un ángel...");
    }

    @Override
    public void changeDimension() {
        System.out.println("Cambiando de dimensión como ángel...");
    }

    public void inspireSages() {
        System.out.println("Inspirando sabios como un buen ángel...");
        System.out.println("Platón es mi favorito de los sabios...");
    }
}