package n1.activities.a4.ex1.application;

import n1.activities.a4.ex1.models.Produto;

import java.util.ArrayList;
import java.util.List;

import static n1.activities.a4.util.ConsoleUtilities.*;

public class Main {

public static void main(String[] args) {
	//Cadastro inicial de produtos
	double n = readDouble("Digite o numero de Produtos na sua Lista:");
	List<Produto> prodList = new ArrayList<>();
	for (int i = 0; i < n; i++) {
		String msgTitle = "Produto " + (i + 1);
		title(msgTitle);
		int id = readInt("Digite o Id do Produto:");
		String name = readName("Digite o Nome do Produto:");
		double preco = readDouble("Digite o preco do Produto:");
		prodList.add(new Produto(id, name, preco));
	}
	//Listagem inicial
	listProds(prodList);
// Mudanca de precos
	int idMudar = readInt("Digite o id do produto cujos dados vc deseja mudar:");
	//Verificando se o id consta na lista
	boolean isPresent = false;
	while (!isPresent) {
		idMudar = readInt("Digite o id do produto cujos dados vc deseja mudar:");
		for (Produto p : prodList) {
			if (p.getId() == idMudar) {
				isPresent = true;
				break;
			}
		}
		if (!isPresent) printColor("Digite um id valido.", RED);
		
	}
	// Mudando o preco
	for (Produto p : prodList) {
		if (idMudar == p.getId()) {
			printColor(String.valueOf(p), CYAN);
			double novoPreco = -1;
			while (!inRange(novoPreco, 0, 999999999)) {
				novoPreco = readDouble("Digite o Novo Preco do Produto: ");
				if (!inRange(novoPreco, 0, 999999999)) printColor("Digite um preco valido.", RED);
			}
			p.setPreco(novoPreco);
		}
	}
	//Listagem final
	listProds(prodList);
	
}

// Methods
static void listProds(List<Produto> prodList) {
	clear(50);
	int listCounter = 0;
	for (Produto p : prodList) {
		listCounter++;
		String msgTitle = "Produto " + listCounter;
		title(msgTitle, CYAN);
		printColor(String.valueOf(p));
		line('#', 70, YELLOW);
	}
}

}
