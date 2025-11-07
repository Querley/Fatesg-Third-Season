package n1.activities.a5.ex1.application;

import n1.activities.a5.ex1.models.Cliente;
import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

static Queue<Cliente> filaAtendimento = new LinkedList<>();

public static void main(String[] args) {
	while (true) {
		clear(10);
		title("Fila de Atendimento", CYAN);
		menu("Adicionar cliente na fila", "Atender próximo cliente", "Mostrar fila", "Sair");
		int opcao = readInt("Escolha uma opção: ", CYAN);
		
		switch (opcao) {
			case 1 -> adicionarCliente();
			case 2 -> atenderCliente();
			case 3 -> mostrarFila();
			case 4 -> {
				printColor("Encerrando programa...", YELLOW);
				System.exit(0);
			}
			default -> printColor("Opção inválida!", RED);
		}
	}
}

static void adicionarCliente() {
	String nome = readName("Digite o nome do cliente: ");
	filaAtendimento.offer(new Cliente(nome));
	printColor("Cliente adicionado à fila!", GREEN);
}

static void atenderCliente() {
	if (filaAtendimento.isEmpty()) {
		printColor("A fila está vazia!", RED);
		return;
	}
	Cliente atendido = filaAtendimento.poll();
	printColor("Atendendo: " + atendido, YELLOW);
}

static void mostrarFila() {
	if (filaAtendimento.isEmpty()) {
		printColor("A fila está vazia!", RED);
		return;
	}
	title("Estado Atual da Fila", CYAN);
	int i = 1;
	for (Cliente c : filaAtendimento) {
		printColor(i + ". " + c.getNome(), WHITE);
		i++;
	}
}
}