package Animal;

public abstract class Animal {
    private String name;

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
