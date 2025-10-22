package n1.activities.a3.app;

import java.util.Arrays;
import java.util.Random;

import static n1.activities.a3.util.ConsoleUtilities.*;

public class Exercicios {



// ========================
// EXERCICIO 01
// Preencha uma matriz 3x3 com valores de 1 a 9 em ordem crescente
// ========================
static class Exercicio1 {
	
	
	
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int valor = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = valor++;
			}
		}
		for (int[] linha : matriz) {
			System.out.println(Arrays.toString(linha));
		}
	}
}




// ========================
// EXERCICIO 02
// Preencha uma matriz 4x4 com números pares começando de 2
// ========================
static class Exercicio2 {
	
	
	
	
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int valor = 2;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = valor;
				valor += 2;
			}
		}
		for (int[] linha : matriz) {
			System.out.println(Arrays.toString(linha));
		}
	}
}




// ========================
// EXERCICIO 03
// Preencha uma matriz 5x5 com valores aleatórios entre 0 e 100
// ========================
static class Exercicio3 {
	
	
	
	
	public static void main(String[] args) {
		Random r = new Random();
		int[][] matriz = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = r.nextInt(101);
			}
		}
		for (int[] linha : matriz) {
			System.out.println(Arrays.toString(linha));
		}
	}
}




// ========================
// EXERCICIO 04
// Calcule e imprima a média de cada aluno (3 alunos, 3 provas cada)
// ========================
static class Exercicio4 {
	
	
	
	
	public static void main(String[] args) {
		double[][] notas = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				notas[i][j] = readDouble("Nota da prova " + (j + 1) + " do aluno " + (i + 1) + ": ", CYAN);
			}
		}
		for (int i = 0; i < 3; i++) {
			double soma = 0;
			for (int j = 0; j < 3; j++) {
				soma += notas[i][j];
			}
			System.out.println("Média do aluno " + (i + 1) + ": " + soma / 3);
		}
	}
}




// ========================
// EXERCICIO 05
// Preencha uma matriz 8x8 como tabuleiro de xadrez ('B' e 'W')
// ========================
static class Exercicio5 {
	
	
	
	
	public static void main(String[] args) {
		char[][] tabuleiro = new char[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) tabuleiro[i][j] = 'B';
				else tabuleiro[i][j] = 'W';
			}
		}
		for (char[] linha : tabuleiro) {
			System.out.println(Arrays.toString(linha));
		}
	}
}




}

