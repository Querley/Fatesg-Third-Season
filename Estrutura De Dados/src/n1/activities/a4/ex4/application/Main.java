package n1.activities.a4.ex4.application;

import n1.activities.a4.ex4.models.Tarefa;

import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

static List<Tarefa> tList;

public static void main(String[] args) {
	tList = new ArrayList<>();
	// Testes
	while (true) {
		title("Gerenciador de Tarefas");
		printColor("Escolha uma opcao");
		menu();
		menu("Criar uma nova tarefa", "Marcar uma tarefa como concluida", "Excluir uma tarefa", "Ver a lista de" +
				" " +
				"tarefas", "Sair do Programa");
		int opcao = readInt("Digite a opcao desejada: ", CYAN);
		switch (opcao) {
			case 1 -> {
				incluir(new Tarefa(readName("Digite o nome da tarefa: "),
						readName("Digite a descricao da tarefa: ")));
				break;
			}
			case 2 -> {
				marcarConcluida(readName("Digite o nome da tarefa: "));
				break;
			}
			case 3 -> {
				excluir(readName("Digite o nome da tarefa: "));
				break;
			}
			case 4 ->{
				listar();
				break;
			}
			case 5 ->{
				System.exit(0);
			}
		}
	}
}

public static void incluir(Tarefa t) {
	tList.add(t);
}

public static void listar() {
	int count = 0;
	for (Tarefa t : tList) {
		count++;
		String titleMsg = "Tarefa " + count;
		title(titleMsg);
		printColor(t.toString());
		clear(1);
		line();
	}
}

private static void marcarConcluida(String nome) {
	for (Tarefa t : tList) {
		if (nome.equals(t.getNome())) {
			t.setConcluido(true);
		}
	}
}

public static void excluir(String nome) {
	checkTarefa(nome);
	for (Tarefa t : tList) {
		if (nome.equals(t.getNome())) {
			tList.remove(t);
		}
	}
}

public static void checkTarefa(String placa) {
	boolean isPresent = false;
	while (!isPresent) {
		for (Tarefa t : tList) {
			if (placa.equals(t.getNome())) {
				isPresent = true;
				break;
			}
		}
		if (!isPresent) printColor("Nome invalido, tente novamente.", RED);
	}
}

}
