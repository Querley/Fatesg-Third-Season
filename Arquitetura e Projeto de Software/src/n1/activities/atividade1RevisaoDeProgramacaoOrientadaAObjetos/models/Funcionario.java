package n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models;

import n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.Interfaces.Bonificacao;

import static n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.util.ConsoleUtilities.*;

public class Funcionario extends Pessoa implements Bonificacao {

//ATTRIBUTES;
private double salario;

//CONSTRUCTORS;
public Funcionario() {
}

public Funcionario(String nome, double salario) {
	super(nome);
	this.salario = salario;
}

//GETTERS & SETTERS;
public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

//TO STRING METHOD;
@Override
public String toString() {
	return "Funcionario{" +
			"nome='" + getNome() + '\'' +
			", salario=" + (salario + calcularBonus()) +
			'}';
}

//OTHER METHODS;
public double calcularBonus() {
	return getSalario() * 0.10;
}

@Override
public void exibirInfo() {
	title(String.valueOf(getClass().getSimpleName()), YELLOW);
	String msg = "NOME: " + getNome();
	printColor(msg, CYAN);
	String salarioMsg = "SALARIO: " + (salario + calcularBonus());
	printColor(salarioMsg, CYAN);
}

}


