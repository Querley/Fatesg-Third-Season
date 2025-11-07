package n1.activities.a1.pessoaExec.services;

import n1.activities.a1.pessoaExec.models.Pessoa;

import static n1.activities.a1.pessoaExec.util.ConsoleUtilities.*;

public class PessoaService {

/*
Esses sao metodos simples responsaveis por realizar as operacoes do sistema
*/ Pessoa pessoa;

public Pessoa createPessoa() {
	int age = readPositiveInt("Digite a idade da Pessoa: ", 0, 150, GREEN);
	double weight = readPositiveDouble("Digite o peso da Pessoa(kg): ", 0.244, 635, GREEN);
	double height = readPositiveDouble("Digite a altura da Pessoa(m): ", 0.24, 2.72, GREEN);
	return new Pessoa(age, weight, height);
}

public void verifyAgeRange(Pessoa pessoa) {
	int age = pessoa.getAge();
	if (inRange(age, 0, 12)) {
		System.out.println("Essa pessoa é uma criança.");
	}
	else if (inRange(age, 13, 17)) {
		System.out.println("Essa pessoa é um(a) adolescente.");
	}
	else if (inRange(age, 18, 64)) {
		System.out.println("Essa pessoa é um(a) adulto(a).");
	}
	else if (inRange(age, 65, 150)) {
		System.out.println("Essa pessoa é um(a) idoso(a).");
	}
}

public void verifyBMI(Pessoa pessoa) {
	double height = pessoa.getHeight();
	double weight = pessoa.getWeight();
	double BMI = weight / (height * height);
	if (inRange(BMI, 0, 18.5)) System.out.println("A pessoa está abaixo do peso.");
	if (inRange(BMI, 18.5, 24.9)) System.out.println("A pessoa está com o peso normal.");
	if (inRange(BMI, 25, 29.9)) System.out.println("A pessoa está com sobrepeso.");
	if (inRange(BMI, 30, 180)) System.out.println("A pessoa está com obesidade.");
	
}

}

