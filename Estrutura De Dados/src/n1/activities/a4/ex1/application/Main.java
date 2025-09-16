package n1.activities.a4.ex1.application;

import n1.activities.a4.ex1.models.Produto;

import java.util.ArrayList;
import java.util.List;

import static n1.activities.a4.util.ConsoleUtilities.*;

public class Main {

public static void main(String[] args) {
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
	
	int idMudar = readInt("Digite o id do produto cujos dados vc deseja mudar:");
	if (!inRange(idMudar, 0, n)) {
	 printColor("Esse id nao existe, digite um valor valido.", RED);}
	else{
		for (Produto p: prodList){
			if (idMudar == p.getId()){
				printColor(String.valueOf(p), CYAN);
				double novoPreco = readDouble("Digite o Novo Preco do Produto.");
				if ( novoPreco <= 999999999)
				// CONTINUE AQUI.
			}
		}
	}
}

}
