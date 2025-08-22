package n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models;

import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.BLUE;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.CYAN;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.GREEN;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.PURPLE;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.YELLOW;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.line;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.printColor;
import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.title;

public class Gerente extends Funcionario {

//ATTRIBUTES;
private double bonusExtra;

//CONSTRUCTOR;
public Gerente() {
}

public Gerente(String nome, double salario, double bonusExtra) {
	super(nome, salario);
	this.bonusExtra = bonusExtra;
}

//GETTER & SETTER;
public double getBonusExtra() {
	return bonusExtra;
}

public void setBonusExtra(double bonusExtra) {
	this.bonusExtra = bonusExtra;
}

//METHODS;
@Override
public double calcularBonus() {
	return  (getSalario()*0.1);
}
@Override
public void exibirInfo() {
	title(String.valueOf(getClass().getSimpleName()), YELLOW);
	String msg = "NOME: " + getNome();
	printColor(msg, CYAN);
	line();
	String salarioMsg = "SALARIO BRUTO: " + getSalario();
	printColor(salarioMsg, CYAN);
	line();
	salarioMsg = "BONUS: " + calcularBonus();
	printColor(salarioMsg, BLUE);
	line();
	salarioMsg = "BONUS EXTRA: " + getBonusExtra();
	printColor(salarioMsg, PURPLE);
	line();
	salarioMsg = "SALARIO: " + (getSalario() + calcularBonus() + getBonusExtra());
	printColor(salarioMsg, GREEN);
}

}
