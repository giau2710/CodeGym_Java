package Animal;

public class Fish extends Animal implements IMarineAnimal {

    @Override
    public void swim() {
        System.out.println("Boi");
    }

    @Override
   public void move() {
        swim();
    }
}
