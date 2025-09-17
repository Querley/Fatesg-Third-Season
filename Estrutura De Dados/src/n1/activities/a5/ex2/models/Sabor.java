package n1.activities.a5.ex2.models;

public class Sabor {
    private String nome;

    public Sabor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Sabor: " + nome;
    }
}