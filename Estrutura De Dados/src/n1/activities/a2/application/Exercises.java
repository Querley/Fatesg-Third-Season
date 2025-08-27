package n1.activities.a2.application;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static n1.activities.a1.pessoaExec.util.ConsoleUtilities.*;

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
		String[] nomes = IntStream.range(0, 6).mapToObj(i -> readName("Digite o nome da pessoa " + i + ": ",
						CYAN))
				.toArray(String[]::new);
		IntStream.range(0, nomes.length)
				.forEach(i -> System.out.println("O nome da pessoa " + i + " é: " + nomes[i]));
		//SolucaoImperativa
/*
		String[] nomes = new String[6];
		int count;
		for (count = 0; count < 6; count++) {
			String nome = readName("Digite o nome:", CYAN);
			nomes[count] = nome;
		}
		count = 0;
		for (String nome : nomes) {
			System.out.println("O nome da pessoa " + count + " e: " + nome);
			
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
