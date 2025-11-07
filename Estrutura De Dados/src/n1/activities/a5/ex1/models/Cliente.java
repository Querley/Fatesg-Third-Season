package n1.activities.a5.ex1.models;

public class Cliente {
private String nome;

public Cliente(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

@Override
public String toString() {
	return "Cliente: " + nome;
}
}