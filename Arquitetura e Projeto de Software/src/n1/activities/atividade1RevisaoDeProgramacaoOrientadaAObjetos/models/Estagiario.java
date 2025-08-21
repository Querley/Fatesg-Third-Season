package n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models;

public class Estagiario extends Funcionario {

//CONSTRUCTOR;
public Estagiario(String nome, double salario) {
	super(nome, salario);
}

//METHODS;
@Override
public double calcularBonus() {
	return 300.00;
}

}
