package BeingsOfTheEarth;

public class Human extends LivingBeing implements EarthBeing {
    @Override
    public void born() {
        System.out.println("Naciendo como un humano...");
    }

    @Override
    public void grow() {
        System.out.println("Creciendo como el humano...");
    }

    @Override
    public void reproduce() {
        System.out.println("Reproduciéndose como humano (si no es con alguien es con uno mismo)...");
    }

    @Override
    public void eat() {
        System.out.println("Comiendo...");
    }

    @Override
    public void poop() {
        System.out.println("Haciendo popo...");
    }

    @Override
    public void die() {
        System.out.println("...");
    }
}