package n1.activities.a4.ex3.models;

public class Veiculo {
private String placa;
private String nome;
private String marca;
private int ano;

public Veiculo() {
}

public Veiculo(String placa, String nome, String marca, int ano) {
	this.placa = placa;
	this.nome = nome;
	this.marca = marca;
	this.ano = ano;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

@Override
public String toString() {
	return "Veiculo{" +
			"placa='" + placa + '\'' +
			", nome='" + nome + '\'' +
			", marca='" + marca + '\'' +
			", ano=" + ano +
			'}';
}

}
