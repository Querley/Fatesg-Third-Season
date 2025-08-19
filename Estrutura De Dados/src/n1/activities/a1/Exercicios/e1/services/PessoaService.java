//CONTINUE FROM LINE 16 and 41;
package n1.activities.a1.Exercicios.e1.services;

import n1.activities.a1.Exercicios.e1.models.Pessoa;

import static n1.activities.a1.Exercicios.e1.util.ConsoleUtilities.*;

public class PessoaService {

/*
Esses sao metodos simples responsaveis por realizar as operacoes do sistema
*/ Pessoa pessoa;

public Pessoa createPessoa() {
	int age = readPositiveInt("Digite a idade da Pessoa", 0, 150);
	//HERE.
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
	if BMI
			// CONTINUE THIS.
}

}

