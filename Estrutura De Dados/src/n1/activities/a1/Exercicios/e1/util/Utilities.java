package n1.activities.a1.Exercicios.e1.util;

import java.util.Scanner;

/*
Esses sao metodos simples para pedir informacoes do usuario, seguindo (no escopo das minhas limitadas
habilidades) o DRY e o KISS.
*/
public class Utilities {

private static final Scanner sc = new Scanner(System.in);

public static int askForInt(String msg) {
	while (true) {
		System.out.print(msg);
		try {
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Número inteiro inválido. Tente novamente.");
		}
	}
}

public static int askForPositiveInt(String msg) {
	while (true) {
		int val = askForInt(msg);
		if (val > 0) return val;
		System.out.println("Digite um número inteiro positivo.");
	}
}

public static double readDouble(String msg) {
	while (true) {
		System.out.print(msg);
		try {
			return Double.parseDouble(sc.nextLine().replace(",", "."));
		} catch (NumberFormatException e) {
			System.out.println("Número inválido. Tente novamente.");
		}
	}
}

public static double readPositiveDouble(String msg) {
	while (true) {
		double val = readDouble(msg);
		if (val > 0) return val;
		System.out.println("Digite um número positivo.");
	}
}

public static String readName(String msg) {
	while (true) {
		System.out.print(msg);
		String name = sc.nextLine().trim();
		if (!name.isEmpty() && name.matches("[A-Za-zÀ-ÿ ]+")) {
			return name;
		}
		System.out.println("Nome inválido. Tente novamente (apenas letras e espaços).");
	}
}

public static String readText(String msg) {
	while (true) {
		System.out.print(msg);
		String text = sc.nextLine().trim();
		if (!text.isEmpty()) {
			return text;
		}
		System.out.println("O texto não pode estar vazio. Tente novamente.");
	}
}

public static boolean readYesOrNo(String msg) {
	while (true) {
		System.out.print(msg + " (S/N): ");
		String resp = sc.nextLine().trim().toUpperCase();
		if (resp.equals("S")) return true;
		if (resp.equals("N")) return false;
		System.out.println("Resposta inválida. Digite S para sim ou N para não.");
	}
}

}


