package n1.activities.a5.ex4.models;

public class Documento {
private String nome;

public Documento(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

@Override
public String toString() {
	return "Documento: " + nome;
}
}