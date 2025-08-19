package n1.activities.a1.Exercicios.e1.models;

public class Pessoa {

/*
Essa e a classe Pessoa, que fornece os atributos utilizados pelas outras classes
*/
private int age;
private double height;
private double weight;

public Pessoa() {}

public Pessoa(int age, double height, double weight) {
	this.age = age;
	this.height = height;
	this.weight = weight;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getWeight() {
	return weight;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Pessoa{" + "age=" + age + '}';
}

}
