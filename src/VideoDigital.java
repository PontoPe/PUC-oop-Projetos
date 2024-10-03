package src;

public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Video Digital: " + getTitulo() + " by " + getAutor();
    }

    public void visualizar() {
        System.out.println("Visualizando o vídeo digital: " + getTitulo());
    }
}