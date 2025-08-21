package n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models;

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
	return  (getSalario()*0.1)+ getBonusExtra();
}

}
