
package n1.activities.a4.ex3.application;


import n1.activities.a4.ex3.models.Veiculo;

import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

static List<Veiculo> vList;

public static void main(String[] args) {
	vList = new ArrayList<>();
	// Testes
	incluir(new Veiculo("asd12asdf33", "Focus", "Ford ", 2020));
	incluir(new Veiculo("asd12asdf34", "Camaro", "Chevrolet ", 2021));
	listar();
	excluir(readText("Digite a placa do Veiculo: "));
	listar();
	alterar(readText("Digite a placa do Veiculo: "));
	listar();
}

public static void incluir(Veiculo v) {
	vList.add(v);
}

public static void alterar(String  placa) {
	checkPlaca(placa);
	for (Veiculo v : vList) {
		if (placa.equals(v.getPlaca())) {
			clear(40);
			title("mudar veiculo");
			printColor("O que vc gostaria de mudar?", PURPLE);
			menu("Nome", "Marca","Ano", "Tudo" );
			int opcao = 0;
			while (!inRange(opcao, 1, 4)) {
				opcao = readInt("Opcao desejada:");
			}
			if (opcao == 1) {
				clear(3);
				line();
				v.setNome(readName("Digite o novo nome do veiculo."));
			}
			else if (opcao == 2) {
				clear(3);
				line();
				v.setMarca(readText("Digite o nova marca do veiculo."));
			}
			else if (opcao == 3) {
				clear(3);
				line();
				v.setAno(readInt("Digite o novo ano do veiculo."));
			}
			else if (opcao == 4){
				
				clear(3);
				line();
				v.setNome(readName("Digite o novo nome do veiculo."));
				v.setMarca(readText("Digite o nova marca do veiculo."));
				v.setAno(readInt("Digite o novo ano do veiculo."));
			}
			else {
				printColor("Opcao Invalida, tente novamente.", RED);
			}
		}
	}
}

public static void listar() {
	for (Veiculo v : vList) {
		String titleMsg = "Veiculo " + v.getPlaca();
		title(titleMsg);
		printColor(v.toString());
		clear(1);
	}
}

public static void excluir(String  placa) {
	checkPlaca(placa);
	for (Veiculo v : vList) {
		if (placa.equals(v.getPlaca())) {
			vList.remove(v);
		}
	}
}

public static void checkPlaca(String placa) {
	//Verificando se oplaca esta presente antes de prosseguir.
	boolean isPresent = false;
	while (!isPresent) {
		for (Veiculo v : vList) {
			if (placa.equals(v.getPlaca())) {
				isPresent = true;
				break;
			}
		}
		if (!isPresent) printColor("Id invalido, tente novamente.", RED);
	}
}

}
