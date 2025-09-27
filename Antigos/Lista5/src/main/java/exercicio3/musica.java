package exercicio3;

public class musica {
    private String titulo;
    private String artista;

    public musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public String getArtista() { return artista; }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

