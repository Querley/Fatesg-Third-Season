package n1.activities.a4.ex4.models;

public class Tarefa {
private String nome;
private String descricao;
private boolean Concluido = false;

public Tarefa() {
}

public Tarefa(String nome, String descricao ) {
	this.nome = nome;
	this.descricao = descricao;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public boolean isConcluido() {
	return Concluido;
}

public void setConcluido(boolean concluido) {
	Concluido = concluido;
}

@Override
public String toString() {
	return "Tarefa{" +
			"nome='" + nome + '\'' +
			", descricao='" + descricao + '\'' +
			", Concluido=" + Concluido +
			'}';
}

}
