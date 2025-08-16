package n1.activities.a1.Exercicios.e1.util;

public class ConsoleUtilities {
// =========================
// LIMPEZA / FORMATOS
// =========================

// Limpa a tela com 50 linhas em branco
public static void limparTela() {
	for (int i = 0; i < 50; i++) System.out.println();
}

// Imprime uma linha separadora padrão
public static void linha() {
	System.out.println("----------------------------------------");
}

// Imprime linha separadora customizada
public static void linha(char c, int qtd) {
	for (int i = 0; i < qtd; i++) System.out.print(c);
	System.out.println();
}

// Imprime um título centralizado simples
public static void titulo(String msg) {
	linha();
	System.out.println(" " + msg.toUpperCase());
	linha();
}

// Repete uma string N vezes
public static void repetir(String s, int vezes) {
	for (int i = 0; i < vezes; i++) System.out.print(s);
	System.out.println();
}
// =========================
// MENU / INTERAÇÃO
// =========================

// Mostra um menu simples com opções numeradas
public static void menu(String... opcoes) {
	linha();
	for (int i = 0; i < opcoes.length; i++) {
		System.out.println((i + 1) + " - " + opcoes[i]);
	}
	linha();
}
// =========================
// CARREGAMENTO / BARRA DE PROGRESSO
// =========================

// Barra de progresso
public static void barraProgresso(int progress, int tamanho) {
	int preenchido = (progress * tamanho) / 100;
	System.out.print("[");
	for (int i = 0; i < tamanho; i++) {
		if (i < preenchido) System.out.print("#");
		else System.out.print(" ");
	}
	System.out.print("] " + progress + "%\r");
	if (progress == 100) System.out.println();
}

// Simula carregamento rápido
public static void carregarSimulado(int duracaoMs) {
	int passos = 50;
	int delay = duracaoMs / passos;
	for (int i = 0; i <= passos; i++) {
		int progresso = (i * 100) / passos;
		barraProgresso(progresso, 30);
		esperar(delay);
	}
}
// =========================
// UTILITÁRIOS DE TEMPO
// =========================

// Pausa a execução por X milissegundos
public static void esperar(int ms) {
	try {
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
	}
}

// =========================
// CORES SIMPLES NO CONSOLE
// =========================
public static final String RESET = "\u001B[0m";
public static final String VERMELHO = "\u001B[31m";
public static final String VERDE = "\u001B[32m";
public static final String AMARELO = "\u001B[33m";
public static final String AZUL = "\u001B[34m";

public static void printColor(String msg, String cor) {
	System.out.println(cor + msg + RESET);
}

}

}
