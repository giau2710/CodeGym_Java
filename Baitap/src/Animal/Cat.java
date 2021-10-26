package Animal;

public class Cat extends Animal implements ITerrestrialAnimal {

    @Override
   public void move() {
        run();
    }

    public String getName() {
        return "Cat";
    }


    @Override
    public void run() {
        System.out.println("Chay");
    }
}
