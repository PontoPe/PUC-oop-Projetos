public class Dog extends Animal {
    private String barkSound;
    private String breed;

    public Dog(String name, int age, int paws, boolean isDomestic, String color, String barkSound, String breed) {
        super(name, age, paws, isDomestic, color);
        this.barkSound = barkSound;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(this.getName() + " is barking.");
        System.out.println(this.barkSound);
    }

    public void fetch() {
        System.out.println(this.getName() + " correcorrecorrecorrecorre... GOT IT!");
    }

}
