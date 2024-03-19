package CelestialBeings;

import BeingsOfTheEarth.LivingBeing;
import java.util.Random;

public class Creator implements CelestialCreator {
    @Override
    public LivingBeing createLivingBeing() {
        Random random = new Random();
        int celestialType = random.nextInt(2); // Genera un número aleatorio entre 0 y 1

        if (celestialType == 0) {
            System.out.println("Creando un ser vivo celestial (Ángel)...");
            return new Angel(); // Retorna una instancia de Angel
        } else {
            System.out.println("Creando un ser vivo celestial (Demonio)...");
            return new Demon(); // Retorna una instancia de Demon
        }
    }
}