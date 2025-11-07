package n2.activities.a1;

import java.util.Scanner;

import static n2.activities.util.ConsoleUtilities.*;

public class Main {

public static void main(String[] args) {
	arraysBidimensionais();
}

public static void vetorUnidimensional() {
	double[] notas = {8.5, 7.0, 9.0, 6.5, 10.0};
	for (int i = 0; i < notas.length; i++) {
		printColor("Nota " + (i + 1) + " do aluno é: " + notas[i]);
	}
	line();
}

public static void arraysBidimensionais() {
	String[] alunos = new String[2];
	double[][] notas = new double[2][3];
	for (int i = 0; i < 2; i++) {
		alunos[i] = readName("Digite o nome do aluno " + (i + 1) + ".");
		line();
	}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			notas[i][j] = readDouble("Digite a  " + (j + 1) + "° nota do aluno " + (i + 1) + ".");
			line();
			
		}
	}
	clear(50);
	for (int i = 0; i < 2; i++) {
		printColor("As notas do aluno " + alunos[i] + " são:");
		line();
		for (int j = 0; j < 3; j++) {
			printColor("Nota " + (j + 1) + ": " + notas[i][j] + ".");
		}
		line('#', 40, YELLOW);
		
	}
}

public static void bubbleSort(){
			int[] a = {5, 2, 9, 1, 3};
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = 0; j < a.length - 1 - i; j++) {
					if (a[j] > a[j + 1]) {
						int t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
			for (int x : a) System.out.print(x + " ");
		}
	}
	


