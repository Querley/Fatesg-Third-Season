package n2.activities.a1.MVC_Produtos_Java.model;

public class Produto {
    private String n;
    private double p;
    private int q;

    public Produto(String n, double p, int q) {
        this.n = n;
        this.p = p;
        this.q = q;
    }

    public String getN() { return n; }
    public double getP() { return p; }
    public int getQ() { return q; }

    public String toString() {
        return "Produto: " + n + " | Preço: " + p + " | Quantidade: " + q;
    }
}
