import java.util.Scanner;
import BeingsOfTheEarth.*;
import CelestialBeings.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al simulador de seres vivos. ¿Qué quieres ser?");
            System.out.println("1. Humano");
            System.out.println("2. Ángel o Demonio (Dios escoge) (aleatorio)");
            System.out.println("3. Salir");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Elige el tipo de humano:");
                    System.out.println("1. Humano normal");
                    System.out.println("2. Humano Sabio");
                    System.out.println("3. Humano Aprendiz");
                    System.out.println("4. Diógenes");
                    System.out.println("5. Persona Costeña");
                    int humanType = scanner.nextInt();

                    switch (humanType) {
                        case 1:
                            Human normalHuman = new Human();
                            executeHumanActions(scanner, normalHuman);
                            break;
                        case 2:
                            WiseHuman wiseHuman = new WiseHuman();
                            executeWiseActions(scanner, wiseHuman);
                            break;
                        case 3:
                            ApprenticeHuman apprenticeHuman = new ApprenticeHuman();
                            executeApprenticeHumanActions(scanner, apprenticeHuman);
                            break;
                        case 4:
                            Diogenes diogenes = new Diogenes();
                            executeDiogenesActions(scanner, diogenes);
                            break;
                        case 5:
                            CoastalPerson coastalPerson = new CoastalPerson();
                            executeCoastalActions(scanner, coastalPerson);
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;
                case 2:
                    CelestialCreator creator = new Creator();
                    LivingBeing celestialBeing = creator.createLivingBeing();

                    if (celestialBeing instanceof Angel) {
                        executeSkyBeingActions(scanner, (Angel) celestialBeing);
                    } else if (celestialBeing instanceof Demon) {
                        executeDemonActions(scanner, (Demon) celestialBeing);
                    } else {
                        System.out.println("Error: Ser celestial no reconocido.");
                    }
                    break;
                case 3:
                    System.out.println("¡Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static void executeHumanActions(Scanner scanner, Human human) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Nacer");
            System.out.println("2. Crecer");
            System.out.println("3. Reproducirse");
            System.out.println("4. Comer");
            System.out.println("5. Hacer popo");
            System.out.println("6. Morir");
            System.out.println("7. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    human.born();
                    break;
                case 2:
                    human.grow();
                    break;
                case 3:
                    human.reproduce();
                    break;
                case 4:
                    human.eat();
                    break;
                case 5:
                    human.poop();
                    break;
                case 6:
                    human.die();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }

    private static void executeSkyBeingActions(Scanner scanner, Angel angel) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Volar");
            System.out.println("2. Cambiar de dimensión");
            System.out.println("3. Inspirar sabios");
            System.out.println("4. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    angel.fly();
                    break;
                case 2:
                    angel.changeDimension();
                    break;
                case 3:
                    angel.inspireSages();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }

    private static void executeDemonActions(Scanner scanner, Demon demon) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Volar");
            System.out.println("2. Cambiar de dimensión");
            System.out.println("3. Realizar malas acciones");
            System.out.println("4. Poseer algun humano");
            System.out.println("5. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {

                case 1:
                    demon.fly();
                    break;
                case 2:
                    demon.changeDimension();
                    break;
                case 3:
                    demon.doEvilDeeds();
                    break;
                case 4:
                    demon.possessHumans();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }

    private static void executeWiseActions(Scanner scanner, WiseHuman wiseHuman) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Nacer");
            System.out.println("2. Crecer");
            System.out.println("3. Reproducirse");
            System.out.println("4. Comer");
            System.out.println("5. Hacer popo");
            System.out.println("6. Escuchar a Platón");
            System.out.println("7. Escribir la Biblia");
            System.out.println("8. Hablar con seres celestiales");
            System.out.println("9. Obtener ideas");
            System.out.println("10. Morir");
            System.out.println("11. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    wiseHuman.born();
                    break;
                case 2:
                    wiseHuman.grow();
                    break;
                case 3:
                    wiseHuman.reproduce();
                    break;
                case 4:
                    wiseHuman.eat();
                    break;
                case 5:
                    wiseHuman.poop();
                    break;
                case 6:
                    wiseHuman.listenToPlato();
                    break;
                case 7:
                    wiseHuman.writeBible();
                    break;
                case 8:
                    wiseHuman.talkToSkyBeing();
                    break;
                case 9:
                    wiseHuman.getIdeas();
                    break;
                case 10:
                    wiseHuman.die();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }

    private static void executeApprenticeHumanActions(Scanner scanner, ApprenticeHuman apprenticeHuman) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Nacer");
            System.out.println("2. Crecer");
            System.out.println("3. Reproducirse");
            System.out.println("4. Comer");
            System.out.println("5. Hacer popo");
            System.out.println("6. Hablar con un humano sabio");
            System.out.println("7. Escuchar");
            System.out.println("8. Interpretar la Biblia como imágenes");
            System.out.println("9. Morir");
            System.out.println("10. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    apprenticeHuman.born();
                    break;
                case 2:
                    apprenticeHuman.grow();
                    break;
                case 3:
                    apprenticeHuman.reproduce();
                    break;
                case 4:
                    apprenticeHuman.eat();
                    break;
                case 5:
                    apprenticeHuman.poop();
                    break;
                case 6:
                    apprenticeHuman.talkToWiseHuman();
                    break;
                case 7:
                    apprenticeHuman.listen();
                    break;
                case 8:
                    apprenticeHuman.interpretBibleAsImages();
                    break;
                case 9:
                    apprenticeHuman.die();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }

    private static void executeDiogenesActions(Scanner scanner, Diogenes diogenes) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Nacer");
            System.out.println("2. Crecer");
            System.out.println("3. Reproducirse");
            System.out.println("4. Comer");
            System.out.println("5. Hacer popo");
            System.out.println("6. Quitar plumas de gallina");
            System.out.println("7. Morir");
            System.out.println("8. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    diogenes.born();
                    break;
                case 2:
                    diogenes.grow();
                    break;
                case 3:
                    diogenes.reproduce();
                    break;
                case 4:
                    diogenes.eat();
                    break;
                case 5:
                    diogenes.poop();
                    break;
                case 6:
                    diogenes.pluckChickenFeathers();
                    break;
                case 7:
                    diogenes.die();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }

    private static void executeCoastalActions(Scanner scanner, CoastalPerson coastalPerson) {
        while (true) {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Nacer");
            System.out.println("2. Crecer");
            System.out.println("3. Reproducirse");
            System.out.println("4. Comer");
            System.out.println("5. Hacer popo");
            System.out.println("6. Tocar un burro");
            System.out.println("7. Morir");
            System.out.println("8. Salir al menú principal");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    coastalPerson.born();
                    break;
                case 2:
                    coastalPerson.grow();
                    break;
                case 3:
                    coastalPerson.reproduce();
                    break;
                case 4:
                    coastalPerson.eat();
                    break;
                case 5:
                    coastalPerson.poop();
                    break;
                case 6:
                    coastalPerson.touchDonkey();
                    break;
                case 7:
                    coastalPerson.die();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Acción inválida.");
            }
        }
    }
}