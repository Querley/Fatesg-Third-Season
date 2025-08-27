package n1.activities.a2.util;

import java.util.Scanner;

public class ConsoleUtilities {

// =========================
// COLORS
// =========================
public static final String RESET = "\u001B[0m";
public static final String RED = "\u001B[31m";
public static final String GREEN = "\u001B[32m";
public static final String YELLOW = "\u001B[33m";
public static final String BLUE = "\u001B[34m";
public static final String PURPLE = "\u001B[35m";
public static final String CYAN = "\u001B[36m";
public static final String WHITE = "\u001B[37m";
// =========================
// INPUT UTILITIES
// =========================
private static final Scanner sc = new Scanner(System.in);

// =========================
// PRINT UTILITIES
// =========================
public static void printColor(String msg) {
	printColor(msg, WHITE);
}

public static void printColor(String msg, String color) {
	System.out.println(color + msg + RESET);
}

public static void line() {
	line(WHITE);
}

public static void line(String color) {
	System.out.println(color + "----------------------------------------" + RESET);
}

public static void line(char c, int count) {
	line(c, count, WHITE);
}

public static void line(char c, int count, String color) {
	System.out.print(color);
	for (int i = 0; i < count; i++) System.out.print(c);
	System.out.println(RESET);
}

public static void title(String msg) {
	title(msg, WHITE);
}

public static void title(String msg, String color) {
	line(color);
	System.out.println(color + " " + msg.toUpperCase() + RESET);
	line(color);
}

// =========================
// MENU
// =========================
public static void menu(String... options) {
	String[] colors = new String[options.length];
	for (int i = 0; i < colors.length; i++) colors[i] = WHITE;
	menu(colors, options);
}

public static void menu(String[] colors, String... options) {
	if (colors.length != options.length)
		throw new IllegalArgumentException("Colors array must match options array length.");
	line();
	for (int i = 0; i < options.length; i++) {
		System.out.println(colors[i] + (i + 1) + " - " + options[i] + RESET);
	}
	line();
}

// =========================
// PROGRESS BAR
// =========================
public static void progressBar(int progress, int size) {
	progressBar(progress, size, GREEN, WHITE);
}

public static void progressBar(int progress, int size, String fillColor, String emptyColor) {
	int filled = (progress * size) / 100;
	System.out.print("[");
	for (int i = 0; i < size; i++) {
		if (i < filled) System.out.print(fillColor + "#" + RESET);
		else System.out.print(emptyColor + "-" + RESET);
	}
	System.out.print(" " + progress + "%\r");
	if (progress == 100) System.out.println();
}

public static void simulatedLoad(int durationMs) {
	simulatedLoad(durationMs, GREEN, WHITE);
}

public static void simulatedLoad(int durationMs, String fillColor, String emptyColor) {
	int steps = 50;
	int delay = durationMs / steps;
	for (int i = 0; i <= steps; i++) {
		int progress = (i * 100) / steps;
		progressBar(progress, 30, fillColor, emptyColor);
		waitMs(delay);
	}
}

// =========================
// TIME UTIL
// =========================
public static void waitMs(int ms) {
	try {
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
	}
}

// ---------- INTEGER ----------
public static int readInt(String msg) {
	return readInt(msg, WHITE);
}

public static int readInt(String msg, int min, int max) {
	return readInt(msg, min, max, WHITE);
}

public static int readInt(String msg, int min, int max, String color) {
	while (true) {
		int val = readInt(msg, color);
		if (inRange(val, min, max)) return val;
		printColor("Type a value within range", RED);
	}
}

public static int readInt(String msg, String color) {
	while (true) {
		System.out.print(color + msg + RESET);
		try {
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			printColor("Invalid integer. Try again.", RED);
		}
	}
}

public static int readPositiveInt(String msg, int min, int max) {
	return readPositiveInt(msg, min, max, WHITE);
}

public static int readPositiveInt(String msg, int min, int max, String color) {
	while (true) {
		int val = readPositiveInt(msg, color);
		if (inRange(val, min, max)) return val;
		printColor("Type a value within range", RED);
	}
}

public static int readPositiveInt(String msg) {
	return readPositiveInt(msg, WHITE);
}

public static int readPositiveInt(String msg, String color) {
	while (true) {
		int val = readInt(msg, color);
		if (val > 0) return val;
		printColor("Please enter a positive integer.", RED);
	}
}

// ---------- DOUBLE ----------
public static double readDouble(String msg) {
	return readDouble(msg, WHITE);
}

public static double readDouble(String msg, String color) {
	while (true) {
		System.out.print(color + msg + RESET);
		try {
			return Double.parseDouble(sc.nextLine().replace(",", "."));
		} catch (NumberFormatException e) {
			printColor("Invalid number. Try again.", RED);
		}
	}
}

public static double readDouble(String msg, double min, double max, String color) {
	while (true) {
		double val = readDouble(msg, color);
		if (inRange(val, min, max)) return val;
		printColor("Type a value within range", RED);
		
	}
}

public static double readDouble(String msg, double min, double max) {
	while (true) {
		double val = readDouble(msg, WHITE);
		if (inRange(val, min, max)) return val;
		printColor("Type a value within range", RED);
		
	}
}

public static double readPositiveDouble(String msg, double min, double max, String color) {
	while (true) {
		double val = readPositiveDouble(msg, color);
		if (inRange(val, min, max)) return val;
		printColor("Type a value within range", RED);
	}
}

public static double readPositiveDouble(String msg) {
	return readPositiveDouble(msg, WHITE);
}

public static double readPositiveDouble(String msg, double min, double max) {
	while (true) {
		double val = readPositiveDouble(msg, WHITE);
		if (inRange(val, min, max)) return val;
		printColor("Type a value within range", RED);
	}
}

public static double readPositiveDouble(String msg, String color) {
	while (true) {
		double val = readDouble(msg, color);
		if (val > 0) return val;
		printColor("Please enter a positive number.", RED);
	}
}

// ---------- TEXT ----------
public static String readText(String msg) {
	return readText(msg, WHITE);
}

public static String readText(String msg, String color) {
	while (true) {
		System.out.print(color + msg + RESET);
		String text = sc.nextLine().trim();
		if (!text.isEmpty()) return text;
		printColor("Text cannot be empty. Try again.", RED);
	}
}

public static String readName(String msg) {
	return readName(msg, WHITE);
}

public static String readName(String msg, String color) {
	while (true) {
		System.out.print(color + msg + RESET);
		String name = sc.nextLine().trim();
		if (!name.isEmpty() && name.matches("[A-Za-zÀ-ÿ ]+")) return name;
		printColor("Invalid name. Only letters and spaces allowed.", RED);
	}
}

// ---------- YES / NO ----------
public static boolean readYesOrNo(String msg) {
	return readYesOrNo(msg, WHITE);
}

public static boolean readYesOrNo(String msg, String color) {
	while (true) {
		System.out.print(color + msg + " (Y/N): " + RESET);
		String resp = sc.nextLine().trim().toUpperCase();
		if (resp.equals("Y")) return true;
		if (resp.equals("N")) return false;
		printColor("Invalid response. Enter Y or N.", RED);
	}
}

// =========================
// HELPER METHODS
// =========================
public static boolean inRange(int number, int min, int max) {
	return number >= min && number <= max;
}

public static boolean inRange(double number, double min, double max) {
	return number >= min && number <= max;
}

}
