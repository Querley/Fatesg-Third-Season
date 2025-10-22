package n1.activities.a6.app;

import static n1.activities.a6.util.ConsoleUtilities.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicios {

static class Ex1 {
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra ou frase: ");
		String s = sc.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
		Stack<Character> p = new Stack<>();
		for (char c : s.toCharArray()) p.push(c);
		String inv = "";
		while (!p.isEmpty()) inv += p.pop();
		System.out.println(s.equals(inv) ? "É palíndromo" : "Não é palíndromo");
		sc.close();
	}
	
}

static class Ex2 {
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma expressão: ");
		String s = sc.nextLine();
		Stack<Character> p = new Stack<>();
		boolean ok = true;
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') p.push(c);
			else if (c == ')' || c == ']' || c == '}') {
				if (p.isEmpty()) {
					ok = false;
					break;
				}
				char t = p.pop();
				if ((c == ')' && t != '(') || (c == ']' && t != '[') || (c == '}' && t != '{')) {
					ok = false;
					break;
				}
			}
		}
		if (!p.isEmpty()) ok = false;
		System.out.println(ok ? "Balanceado" : "Não balanceado");
		sc.close();
	}
	
}

static class Ex3 {
	
	static int prec(char c) {
		if (c == '+' || c == '-') return 1;
		if (c == '*' || c == '/') return 2;
		return 0;
	}
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite expressão infixa: ");
		String s = sc.nextLine();
		Stack<Character> p = new Stack<>();
		String pos = "";
		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) pos += c;
			else if (c == '(') p.push(c);
			else if (c == ')') {
				while (!p.isEmpty() && p.peek() != '(') pos += p.pop();
				if (!p.isEmpty()) p.pop();
			}
			else {
				while (!p.isEmpty() && prec(p.peek()) >= prec(c)) pos += p.pop();
				p.push(c);
			}
		}
		while (!p.isEmpty()) pos += p.pop();
		System.out.println("Pós-fixa: " + pos);
		sc.close();
	}
	
}

static class Ex4 {
	
	public static void main(String[] a) {
		Queue<Integer> f = new LinkedList<>();
		for (int i = 1; i <= 5; i++) f.add(i);
		System.out.println("Fila original: " + f);
		Stack<Integer> p = new Stack<>();
		while (!f.isEmpty()) p.push(f.remove());
		while (!p.isEmpty()) f.add(p.pop());
		System.out.println("Fila invertida: " + f);
	}
	
}

}
