package ex01;

public class DVDs extends Produtos{

    private double duracao;

    public DVDs(String nome, double preco, String codigoBarras, double duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("----- DETALHES DO DVD -----");
        System.out.println("Nome: " + getNome() + "\nPreço: " + getPreco() + "\nDuração: " + duracao);
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
