package exercicio1_Playlist_java;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Lê entradas do teclado
        playlist playlist = new playlist();  // Cria a playlist
        int opcao;

        do { // Menu principal
            System.out.println("\n=== Gerenciador de Playlist ===");
            System.out.println("1. Adicionar música");
            System.out.println("2. Remover música");
            System.out.println("3. Listar músicas");
            System.out.println("4. Mostrar duração total");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duração (minutos): ");
                    double duracao = sc.nextDouble();
                    sc.nextLine(); // Limpa buffer
                    musica musica = new musica(titulo, artista, duracao);
                    playlist.adicionarMusica(musica);
                    break;

                case 2:
                    System.out.print("Digite o título da música para remover: ");
                    String tituloRemover = sc.nextLine();
                    playlist.removerMusica(tituloRemover);
                    break;

                case 3:
                    playlist.listarMusicas();
                    break;

                case 4:
                    playlist.duracaoTotal();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0); // Repete até o usuário sair

        sc.close(); // Fecha o Scanner
    }
}

