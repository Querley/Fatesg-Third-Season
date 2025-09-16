package n1.activities.a2.application;

import static n1.activities.a1.pessoaExec.util.ConsoleUtilities.*;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Exercises {

// ========================
// EXERCICIO 01
// Crie um vetor de inteiros de 1 a 10 e imprima os elementos
// ========================
static class Exercise1 {
	
	public static void main(String[] args) {
		//SolucaoModerna
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		//SolucaoImperativa
	/*	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numbers) {
			System.out.println(number);
		}*/
	}
	
}

// ========================
// EXERCICIO 02
// Crie um vetor de Strings com 6 nomes e imprima em ordem reversa
// ========================
static class Exercise2 {
	
	public static void main(String[] args) {
		//SolucaoModerna
		String[] nomes = java.util.stream.IntStream.range(0, 6)
    .mapToObj(i -> readName("Digite o nome da pessoa " + i + ": ", CYAN))
    .toArray(String[]::new);
Arrays.stream(nomes).sorted((a, b) -> -1).forEach(System.out::println);
		//SolucaoImperativa
/*
		String[] nomes = new String[6];
for (int i = 0; i < nomes.length; i++) {
    nomes[i] = ConsoleUtilities.readName("Digite o nome da pessoa " + i + ": ", ConsoleUtilities.CYAN);
}
for (int i = nomes.length - 1; i >= 0; i--) {
    System.out.println(nomes[i]);
		}
*/
	}
	
}

// ========================
// EXERCICIO 03
// Crie um vetor de inteiros de 10 posições, calcule a soma e imprima
// ========================
static class Exercicio3 {
	
	public static void main(String[] args) {
		//SolucaoModerna
		System.out.println(IntStream.range(0, 10).map(i -> readInt("Digite o numero:" + i + ": ", CYAN)).sum());
		//SolucaoImperativa
/*
		int [] numeros = new int[10];
		int sum = 0;
		for (int i = 0; i < numeros.length; i++) {
		numeros[i] = readInt("Digite o numero da posicao " + i + ": ", CYAN);
		sum += numeros[i];
		}
		System.out.println("A soma dos elementos e: "+ sum);
*/
	}
	
}

// ========================
// EXERCICIO 04
// Crie um vetor de caracteres de 8 posições e verifique se contém 'a'
// ========================
static class Exercicio4 {
	
	public static void main(String[] args) {
		char[] letras = {'b', 'c', 'a', 'd', 'e', 'f', 'g', 'h'};
		//SolucaoModerna
		boolean containsA = IntStream.range(0, letras.length).anyMatch(i -> letras[i] == 'a');
		System.out.println(containsA ? "Contém 'a'" : "Não contém 'a'");
		//SolucaoImperativa
/*
			boolean containsA = false;
			for (char c : letras) {
				if (c == 'a') {
					containsA = true;
					break;
				}
			}
			if (containsA) {
				System.out.println("Contém 'a'");
			}
			else {
				System.out.println("Não contém 'a'");
			}
		*/
	}
	
}

// ========================
// EXERCICIO 05
// Crie um vetor de inteiros com 5 posições e encontre o maior
// ========================
static class Exercicio5 {
	
	public static void main(String[] args) {
		//SolucaoModerna
		System.out.println(
				IntStream.range(0, 5).map(i -> readInt("Digite o numero na posicao " + i + ": ", CYAN)).max().getAsInt());
		// SolucaoImperativa
/*
		int[] numeros = {1, 2, 30, 4, 6};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>max) max = numeros[i];
		}
		System.out.println("O maior numero e: " + max);
*/
	}
	
}

// ========================
// EXERCICIO 06
// Crie um vetor de double com 5 posições e calcule a média
// ========================
static class Exercicio6 {
	
	public static void main(String[] args) {
		//SolucaoModerna
		double[] numeros = IntStream.range(0, 5)
				.mapToDouble(i -> readDouble("Digite o numero na posicao " + i + ": ", CYAN)).toArray();
		double avg = Arrays.stream(numeros).average().getAsDouble();
		System.out.println("A média é: " + avg);
		//SolucaoImperativa
/*
		double[] numeros = new double[5];
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			numeros[i] = readDouble("Digite o numero na posicao " + i + ": ", CYAN);
			sum += numeros[i];
		}
		double avg = sum / 5;
		System.out.println("A média é: " + avg);
*/
	}
	
}

}
