package n1.activities.a5.ex4.application;

import n1.activities.a5.ex4.models.Documento;
import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

static Queue<Documento> filaDocumentos = new LinkedList<>();

public static void main(String[] args) {
	while (true) {
		clear(10);
		title("Impressora da Biblioteca", BLUE);
		menu("Adicionar documento à fila", "Imprimir próximo documento", "Exibir fila de documentos", "Sair");
		int opcao = readInt("Escolha uma opção: ", BLUE);
		
		switch (opcao) {
			case 1 -> adicionarDocumento();
			case 2 -> imprimirDocumento();
			case 3 -> mostrarFila();
			case 4 -> {
				printColor("Encerrando programa...", YELLOW);
				System.exit(0);
			}
			default -> printColor("Opção inválida!", RED);
		}
	}
}

static void adicionarDocumento() {
	String nome = readName("Digite o nome do documento: ");
	filaDocumentos.offer(new Documento(nome));
	printColor("Documento adicionado à fila!", GREEN);
}

static void imprimirDocumento() {
	if (filaDocumentos.isEmpty()) {
		printColor("A fila está vazia!", RED);
		return;
	}
	Documento doc = filaDocumentos.poll();
	printColor("Imprimindo: " + doc, CYAN);
}

static void mostrarFila() {
	if (filaDocumentos.isEmpty()) {
		printColor("Nenhum documento aguardando impressão!", RED);
		return;
	}
	title("Documentos na Fila de Impressão", BLUE);
	int i = 1;
	for (Documento d : filaDocumentos) {
		printColor(i + ". " + d.getNome(), WHITE);
		i++;
	}
}
}