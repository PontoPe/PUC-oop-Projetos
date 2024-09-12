public class Cat extends Animal {
    private String meowSound;

    public Cat(String name, int age, int paws, boolean isDomestic, String color, String meowSound) {
        super(name, age, paws, isDomestic, color);
        this.meowSound = meowSound;
    }

    public void meow() {
        System.out.println(this.getName() + " is meowing.");
        System.out.println(this.meowSound);
    }

    public void scratch() {
        System.out.println(this.getName() + " is scratching.");
    }

    public void hunt() {
        System.out.println(this.getName() + " is hunting.");
    }
}
