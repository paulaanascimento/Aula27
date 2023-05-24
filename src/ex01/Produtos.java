package ex01;

public abstract class Produtos {

    private String nome;
    private double preco;

    private String codigoBarras;

    public Produtos(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public abstract void mostrarDetalhesDoItem();

    public boolean equals(Produtos obj) {
        return codigoBarras.equals(obj.codigoBarras);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
