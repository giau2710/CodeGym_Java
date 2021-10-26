package Animal;

public class Frog extends Animal implements IMarineAnimal, ITerrestrialAnimal {

    @Override
    public void swim() {
        System.out.println("Ech dang boi");
    }

    @Override
    public void run() {
        System.out.println("Ech dang nhay");
    }

    @Override
    public void move() {
        swim();
        run();
    }
}
