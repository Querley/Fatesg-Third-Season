package n1.activities.a4.ex2.application;

import n1.activities.a4.ex2.models.Usuario;

import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

static List<Usuario> userList;

public static void main(String[] args) {
	userList = new ArrayList<>();
	// Testes
	incluir(1, "Godofredo das Couve", "godo@couve.com");
	incluir(2, "Maria das Batata", "mari@bata.com");
	listar();
	excluir(1);
	listar();
	alterar(2);
	listar();
}

public static void incluir(int id, String nome, String email) {
	userList.add(new Usuario(id, nome, email));
}

public static void alterar(int id) {
	checkId(id);
	for (Usuario u : userList) {
		if (id == u.getId()) {
			clear(40);
			title("mudar usuario");
			printColor("O que vc gostaria de mudar?", PURPLE);
			menu("Nome.", "Email");
			int opcao = 0;
			while (!inRange(opcao, 1, 2)) {
				opcao = readInt("Opcao desejada:");
			}
			if (opcao == 1) {
				clear(3);
				line();
				u.setNome(readName("Digite o novo nome do usuario."));
			}
			else if (opcao == 2) {
				clear(3);
				line();
				u.setEmail(readText("Digite o novo email do usuario."));
			}
			else {
				printColor("Opcao Invalida, tente novamente.", RED);
			}
		}
	}
}

public static void listar() {
	for (Usuario u : userList) {
		String titleMsg = "Usuario " + u.getId();
		title(titleMsg);
		printColor(u.toString());
		clear(1);
	}
}

public static void excluir(int id) {
	for (Usuario u : userList) {
		if (u.getId() == id) {
			userList.remove(u);
		}
	}
}

public static void checkId(int id) {
	//Verificando se o id esta presente antes de prosseguir.
	boolean isPresent = false;
	while (!isPresent) {
		for (Usuario u : userList) {
			if (u.getId() == id) {
				isPresent = true;
				break;
			}
		}
		if (!isPresent) printColor("Id invalido, tente novamente.", RED);
	}
}

}
