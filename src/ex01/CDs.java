package ex01;

public class CDs extends Produtos{

    private int numeroFaixas;

    public CDs(String nome, double preco, String codigoBarras, int numeroFaixas) {
        super(nome, preco, codigoBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("----- DETALHES DO CD -----");
        System.out.println("Nome: " + getNome() + "\nPreço: " + getPreco() + "\nNumero de Faixas: " + numeroFaixas);
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
}
