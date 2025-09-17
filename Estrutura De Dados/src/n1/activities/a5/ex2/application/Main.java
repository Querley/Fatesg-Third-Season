package n1.activities.a5.ex2.application;

import n1.activities.a5.ex2.models.Sabor;
import static n1.activities.a4.util.ConsoleUtilities.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static Queue<Sabor> filaSabores = new LinkedList<>();

    public static void main(String[] args) {
        while (true) {
            clear(10);
            title("Fila de Produção de Polpa de Frutas", PURPLE);
            menu("Adicionar novo sabor", "Produzir próximo sabor", "Mostrar fila de sabores", "Sair");
            int opcao = readInt("Escolha uma opção: ", PURPLE);

            switch (opcao) {
                case 1 -> adicionarSabor();
                case 2 -> produzirSabor();
                case 3 -> mostrarFila();
                case 4 -> {
                    printColor("Encerrando programa...", YELLOW);
                    System.exit(0);
                }
                default -> printColor("Opção inválida!", RED);
            }
        }
    }

    static void adicionarSabor() {
        String nome = readName("Digite o nome do sabor: ");
        filaSabores.offer(new Sabor(nome));
        printColor("Sabor adicionado à fila!", GREEN);
    }

    static void produzirSabor() {
        if (filaSabores.isEmpty()) {
            printColor("A fila está vazia!", RED);
            return;
        }
        Sabor produzido = filaSabores.poll();
        printColor("Produzindo: " + produzido, YELLOW);
    }

    static void mostrarFila() {
        if (filaSabores.isEmpty()) {
            printColor("Nenhum sabor na fila!", RED);
            return;
        }
        title("Sabores na Fila", PURPLE);
        int i = 1;
        for (Sabor s : filaSabores) {
            printColor(i + ". " + s.getNome(), WHITE);
            i++;
        }
    }
}