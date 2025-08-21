package n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.application;

import n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models.Estagiario;
import n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models.Funcionario;
import n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models.Gerente;

public class Main {

public static void main(String[] args) {
	Funcionario f1, f2, f3, f4, f5, f6;
	
	f1 = new Funcionario("Carlos", 2500.0);
	f2 = new Funcionario("Ana", 3000.0);
	f3 = new Gerente("Marcos", 7000.0, 100.00);
	f4 = new Gerente("Patricia", 8000.0, 150.00);
	f5 = new Estagiario("João", 1200.0);
	f6 = new Estagiario("Maria", 1300.0);
	
	Funcionario[] funcionarios = {f1, f2, f3, f4, f5, f6};
	for (Funcionario f : funcionarios) {
		f.exibirInfo();
	}
}
}
