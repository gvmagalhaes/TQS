package exercicio1_Playlist_java;
import java.util.ArrayList;
public class playlist {
    private ArrayList<musica> musicas;

    public playlist(){
        musicas = new ArrayList<>();
    }

    public void adicionarMusica(musica musica){
        musicas.add(musica);
        System.out.println("Música adicionada: "+ musica.getTitulo());
    }
    public boolean removerMusica(String titulo) {
        for (musica m : musicas) { 
            if (m.getTitulo().equalsIgnoreCase(titulo)) { 
                musicas.remove(m); 
                System.out.println("Música removida: " + titulo);
                return true;
            }
    }
        System.out.println("Música não encontrada: " + titulo);
        return false;
    }
    
        public void listarMusicas() {
        if (musicas.isEmpty()) { 
            System.out.println("Playlist vazia!");
            return;
        }
        System.out.println("=== Playlist ===");
        for (musica m : musicas) {
            System.out.println(m);
        }
    }
        public void duracaoTotal() {
        double total = 0;
        for (musica m : musicas) {
            total += m.getDuracao(); 
        }
        System.out.println("Duração total da playlist: " + total + " minutos");
    }
}
