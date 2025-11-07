package n2.activities.a1.MVC_Produtos_Java;

import n2.activities.a1.MVC_Produtos_Java.controller.ProdutoController;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProdutoController c = new ProdutoController();
        Scanner s = new Scanner(System.in);
        int op = 0;
	    
	    while (op != 5) {
		    System.out.println("\n1-Cadastrar\n2-Listar\n3-Detalhes\n4-Excluir\n5-Sair");
		    System.out.print("Opção: ");
		    op = s.nextInt();
		    s.nextLine();
		    
		    if (op == 1) c.add();
		    else if (op == 2) c.listar();
		    else if (op == 3) c.detalhes();
		    else if (op == 4) c.excluir();
	    }
    }
}
