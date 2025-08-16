package n1.activities.a1.Exercicios.e1.models;

public class Pessoa {

/*
Essa e a classe Pessoa, que fornece os atributos utilizados pelas outras classes
*/
private int age;
private int height;
private int weight;


public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public Pessoa(int height, int weight) {
	this.height = height;
	this.weight = weight;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Pessoa(int age) {
	this.age = age;
}

public Pessoa() {
}

@Override
public String toString() {
	return "Pessoa{" +
			"age=" + age +
			'}';
}

}
