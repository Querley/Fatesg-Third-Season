package n1.activities.a5.ex3.application;

import n1.activities.a5.ex3.models.Musica;
import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

static Queue<Musica> filaMusicas = new LinkedList<>();

public static void main(String[] args) {
	while (true) {
		clear(10);
		title("Spotify - Fila de Músicas", GREEN);
		menu("Adicionar música à fila", "Tocar próxima música", "Mostrar fila de músicas", "Sair");
		int opcao = readInt("Escolha uma opção: ", GREEN);
		
		switch (opcao) {
			case 1 -> adicionarMusica();
			case 2 -> tocarMusica();
			case 3 -> mostrarFila();
			case 4 -> {
				printColor("Encerrando programa...", YELLOW);
				System.exit(0);
			}
			default -> printColor("Opção inválida!", RED);
		}
	}
}

static void adicionarMusica() {
	String nome = readName("Digite o nome da música: ");
	filaMusicas.offer(new Musica(nome));
	printColor("Música adicionada à fila!", GREEN);
}

static void tocarMusica() {
	if (filaMusicas.isEmpty()) {
		printColor("A fila está vazia!", RED);
		return;
	}
	Musica tocando = filaMusicas.poll();
	printColor("Tocando agora: " + tocando, CYAN);
}

static void mostrarFila() {
	if (filaMusicas.isEmpty()) {
		printColor("Nenhuma música na fila!", RED);
		return;
	}
	title("Músicas na Fila", GREEN);
	int i = 1;
	for (Musica m : filaMusicas) {
		printColor(i + ". " + m.getNome(), WHITE);
		i++;
	}
}
}
