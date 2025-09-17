package n1.activities.a5.ex3.models;

public class Musica {
private String nome;

public Musica(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

@Override
public String toString() {
	return "Música: " + nome;
}
}