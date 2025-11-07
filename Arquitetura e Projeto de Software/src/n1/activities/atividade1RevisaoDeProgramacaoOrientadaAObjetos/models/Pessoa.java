package n1.activities.atividade1RevisaoDeProgramacaoOrientadaAObjetos.models;

public abstract class Pessoa {

private String nome;

public Pessoa(String nome) {
	this.nome = nome;
}

public Pessoa() {
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public abstract void exibirInfo();
	
}
