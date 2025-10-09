package n2.activities.a1.MVC_Produtos_Java.controller;
import n2.activities.a1.MVC_Produtos_Java.model.Produto;
import n2.activities.a1.MVC_Produtos_Java.view.ProdutoView;

import java.util.*;

public class ProdutoController {
Scanner s= new Scanner(System.in);
    List<Produto> ps = new ArrayList<>();
    ProdutoView v = new ProdutoView();
	

    public void add() {
        v.msg("Cadastro de Produto");
        String n = v.nome();
        double p = v.preco();
        int q = v.qtd();
        ps.add(new Produto(n, p, q));
        v.msg("Produto cadastrado!\n");
        v.s.nextLine();
    }

    public void listar() {
        List<String> l = new ArrayList<>();
        for (Produto x : ps) l.add(x.toString());
        v.listar(l);
    }

public void excluir() {
	v.msg("Digite o nome do produto a excluir:");
	String n = v.s.nextLine();
	for (Produto x : ps) {
		if (x.getN().equalsIgnoreCase(n)) {
			ps.remove(x);
			v.msg("Produto removido com sucesso!");
			return;
		}
	}
	v.msg("Produto não encontrado.");
}
    public void detalhes() {
        v.msg("Digite o nome do produto:");
        String n = v.s.nextLine();
        for (Produto x : ps)
            if (x.getN().equalsIgnoreCase(n)) {
                v.msg(x.toString());
                return;
            }
        v.msg("Produto não encontrado.");
    }
}
