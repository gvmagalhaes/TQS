package exercicio1_Playlist_java;

public class musica {
    private String titulo;
    private String artista;
    private Double duracao;

    public musica(String titulo, String artista, Double duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public String getArtista(){
        return artista;
    }

    public Double getDuracao(){
        return duracao;
    }

    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duração: " + duracao + " min";
    }
}

