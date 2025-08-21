package n1.activities.a1.numerosExecs.application;

import static n1.activities.a1.pessoaExec.util.ConsoleUtilities.*;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {
//GPT->
/*
public class Exercicios {

    // ========================
    // EXERCICIO 02
    // Recebe três números e exibe o maior
    // ========================
    static class Exercicio2 {
        public static void main(String[] args) {
            title("Exercicio 2 - Descubra o maior de 3 numeros");
            int a = readInt("Digite o primeiro numero: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
            int b = readInt("Digite o segundo numero: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
            int c = readInt("Digite o terceiro numero: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);

            // Modern
            int max = Stream.of(a, b, c).max(Integer::compare).orElseThrow();
            System.out.println("O maior numero e: " + max);

            // Imperative
            /*
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            System.out.println("O maior numero e: " + max);
            */
}
    }

// ========================
// EXERCICIO 04
// Tabuada de 1 a 10
// ========================
static class Exercicio4 {
public static void main(String[] args) {
	title("Exercicio 4 - Tabuada");
	int n = readInt("Digite um numero para ver sua tabuada: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
	
	// Modern
	IntStream.rangeClosed(1, 10)
			.forEach(i -> System.out.println(n + " x " + i + " = " + (n * i)));
	
	// Imperative
            /*
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            */
}
}

// ========================
// EXERCICIO 05
// Números ímpares de 1 até N
// ========================
static class Exercicio5 {
public static void main(String[] args) {
	title("Exercicio 5 - Numeros impares");
	int n = readPositiveInt("Digite um numero inteiro positivo: ", 1, Integer.MAX_VALUE, GREEN);
	
	// Modern
	IntStream.rangeClosed(1, n)
			.filter(i -> i % 2 != 0)
			.forEach(System.out::println);
	
	// Imperative
            /*
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) System.out.println(i);
            }
            */
}
}

// ========================
// EXERCICIO 06
// Soma de números até digitar zero
// ========================
static class Exercicio6 {
public static void main(String[] args) {
	title("Exercicio 6 - Soma ate zero");
	List<Integer> nums = new ArrayList<>();
	int num;
	do {
		num = readInt("Digite um numero (0 para parar): ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
		if (num != 0) nums.add(num);
	} while (num != 0);
	
	// Modern
	int sum = nums.stream().mapToInt(Integer::intValue).sum();
	System.out.println("A soma dos numeros digitados e: " + sum);
	
	// Imperative
            /*
            int sum = 0;
            for (int n : nums) sum += n;
            System.out.println("A soma dos numeros digitados e: " + sum);
            */
}
}

// ========================
// EXERCICIO 07
// Maior e menor de 10 números
// ========================
static class Exercicio7 {
public static void main(String[] args) {
	title("Exercicio 7 - Maior e menor de 10 numeros");
	List<Integer> nums = new ArrayList<>();
	for (int i = 0; i < 10; i++) {
		nums.add(readInt("Digite um numero: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN));
	}
	
	// Modern
	int max = nums.stream().max(Integer::compare).orElseThrow();
	int min = nums.stream().min(Integer::compare).orElseThrow();
	System.out.println("Maior: " + max + ", Menor: " + min);
	
	// Imperative
            /*
            int max = nums.get(0);
            int min = nums.get(0);
            for (int n : nums) {
                if (n > max) max = n;
                if (n < min) min = n;
            }
            System.out.println("Maior: " + max + ", Menor: " + min);
            */
}
}

// ========================
// EXERCICIO 08
// Soma de 5 números
// ========================
static class Exercicio8 {
public static void main(String[] args) {
	title("Exercicio 8 - Soma de 5 numeros");
	List<Integer> nums = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
		nums.add(readInt("Digite um numero: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN));
	}
	
	// Modern
	int sum = nums.stream().mapToInt(Integer::intValue).sum();
	System.out.println("Soma: " + sum);
	
	// Imperative
            /*
            int sum = 0;
            for (int n : nums) sum += n;
            System.out.println("Soma: " + sum);
            */
}
}

// ========================
// EXERCICIO 09
// Soma de dois elementos de um vetor
// ========================
static class Exercicio9 {
public static void main(String[] args) {
	title("Exercicio 9 - Soma de indices");
	int[] nums = new int[8];
	for (int i = 0; i < nums.length; i++) {
		nums[i] = readInt("Digite o numero na posicao " + i + ": ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
	}
	int idx1 = readInt("Digite o primeiro indice (0-7): ", 0, 7, YELLOW);
	int idx2 = readInt("Digite o segundo indice (0-7): ", 0, 7, YELLOW);
	
	// Modern
	System.out.println("Soma dos elementos: " + (nums[idx1] + nums[idx2]));
	
	// Imperative
            /*
            int sum = nums[idx1] + nums[idx2];
            System.out.println("Soma dos elementos: " + sum);
            */
}
}

// ========================
// EXERCICIO 10
// Matriz 3x3 preenchida pelo usuário
// ========================
static class Exercicio10 {
public static void main(String[] args) {
	title("Exercicio 10 - Matriz 3x3");
	int[][] mat = new int[3][3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			mat[i][j] = readInt("Digite valor para [" + i + "][" + j + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
		}
	}
	
	// Modern
	Arrays.stream(mat).forEach(row -> System.out.println(Arrays.toString(row)));
	
	// Imperative
            /*
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(mat[i][j] + "\t");
                }
                System.out.println();
            }
            */
}
}

// ========================
// EXERCICIO 11
// Soma da diagonal principal 3x3
// ========================
static class Exercicio11 {
public static void main(String[] args) {
	title("Exercicio 11 - Soma da diagonal principal");
	int[][] mat = new int[3][3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			mat[i][j] = readInt("Digite valor para [" + i + "][" + j + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
		}
	}
	
	// Modern
	int sumDiag = IntStream.range(0, 3).map(i -> mat[i][i]).sum();
	System.out.println("Soma da diagonal principal: " + sumDiag);
	
	// Imperative
            /*
            int sumDiag = 0;
            for (int i = 0; i < 3; i++) sumDiag += mat[i][i];
            System.out.println("Soma da diagonal principal: " + sumDiag);
            */
}
}

// ========================
// EXERCICIO 12
// Matriz 2x2 soma de todos elementos
// ========================
static class Exercicio12 {
public static void main(String[] args) {
	title("Exercicio 12 - Matriz 2x2 e soma");
	int[][] mat = new int[2][2];
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			mat[i][j] = readInt("Digite valor para [" + i + "][" + j + "]: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN);
		}
	}
	
	// Modern
	int sum = Arrays.stream(mat).flatMapToInt(Arrays::stream).sum();
	System.out.println("Soma de todos os elementos: " + sum);
	
	// Imperative
            /*
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum += mat[i][j];
                }
            }
            System.out.println("Soma de todos os elementos: " + sum);
            */
}
}

}
*/
static class Exercicio1 {
	
	/*
	02.Crie um programa que receba três números inteiros e exiba o maior deles.
	*/
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		title("Exercicio 1 - Descubra o maior dos numeros Inteiros");
		printColor("Olá, bem vindo.", CYAN);
		int n = readInt("Com quantos numeros você deseja trabalhar?", 0, 50, YELLOW);
		for (int i = 0; i < n; i++) {
			numList.add(readInt("Digite um numero: ", Integer.MIN_VALUE, Integer.MAX_VALUE, GREEN));
		}
		numList.stream().max(Integer::compare)
				.ifPresentOrElse(max -> System.out.println("O maior numero e: " + max), () ->
						System.out.println("Nenhum numero foi digitado."));
//Forma sem Stream API
/*
		int min = numList.get(0); // start with the first element
		for (int n : numList) {
			if (n < min) {
				min = n;
			}
		}
		System.out.println(min);
*/
	}
	
}
/*
04. Desenvolva um programa que exiba a tabuada de um número informado pelo usuário
(de 1 a 10).
*/

static class Exercicio2 {
	
	public static void main(String[] args) {
	
	}
	
}

}
