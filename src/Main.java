package src;

public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Java Programming", "John Doe");
        Ebook ebook2 = new Ebook("Advanced Java", "Jane Smith");
        VideoDigital video1 = new VideoDigital("Java Tutorial", "Alice Johnson");
        VideoDigital video2 = new VideoDigital("Advanced Java Techniques", "Bob Brown");

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        ebook1.descricao();
        ebook1.baixar();
        ebook2.descricao();
        ebook2.baixar();
        video1.descricao();
        video1.visualizar();
        video2.descricao();
        video2.visualizar();

    }
}