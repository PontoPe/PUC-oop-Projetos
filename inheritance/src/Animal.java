public class Animal {
    protected String name;
    protected int age;
    protected int paws;
    protected boolean isDomestic;
    protected String color;

    public Animal(String name, int age, int paws, boolean isDomestic, String color) {
        this.name = name;
        this.age = age;
        this.paws = paws;
        this.isDomestic = isDomestic;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping.");
    }

    public void move() {
        System.out.println(this.name + " is moving.");
    }
}
