package ex01;

public class Livros  extends Produtos{

    private String autor;

    public Livros(String nome, double preco, String codigoBarras, String autor) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("----- DETALHES DO LIVRO -----");
        System.out.println("Nome: " + getNome() + "\nPreço: " + getPreco() + "\nAutor: " + autor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
