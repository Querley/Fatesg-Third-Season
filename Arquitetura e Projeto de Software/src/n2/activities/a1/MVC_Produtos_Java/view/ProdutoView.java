package n2.activities.a1.MVC_Produtos_Java.view;
import java.util.*;

public class ProdutoView {
    public Scanner s = new Scanner(System.in);

    public String nome() {
        System.out.print("Nome: ");
        return s.nextLine();
    }

    public double preco() {
        System.out.print("Preço: ");
        return s.nextDouble();
    }

    public int qtd() {
        System.out.print("Quantidade: ");
        return s.nextInt();
    }

    public void msg(String m) {
        System.out.println(m);
    }

    public void listar(List<String> l) {
        for (String i : l) System.out.println(i);
    }
}
