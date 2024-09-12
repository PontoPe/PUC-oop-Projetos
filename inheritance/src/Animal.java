public class Animal {
    private String name;
    private int age;
    private int paws;
    private boolean isDomestic;
    private String color;

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
