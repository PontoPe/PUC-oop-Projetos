public class Main {
    public static void main(String[] args) {
        Dog Carlao = new Dog("Carlao", 5, 4, true, "Beige", "Awoooo", "Corgi");
        Cat Jorginho = new Cat("Jorginho", 3, 3, true, "Black", "Meow");

        Carlao.bark();
        Carlao.fetch();
        Carlao.eat();

        Jorginho.meow();
        Jorginho.scratch();
        Jorginho.hunt();
        Jorginho.sleep();

    }
}