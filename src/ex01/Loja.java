package ex01;

public class Loja {
    public static void main(String[] args) {

        Produtos[] vetorProdutos = new Produtos[5];

        vetorProdutos[0] = new Livros("Simplesmente Acontece", 59.90, "012345", "Cecelia Ahern");
        vetorProdutos[1] = new CDs("Proof", 388, "023456", 19);
        vetorProdutos[2] = new DVDs("Homem-Aranha", 120, "034567", 2.01);
        vetorProdutos[3] = new Livros("Jogos Vorazes", 32.90, "045678", "Suzanne Collins");
        vetorProdutos[4] = new Livros("Cidades de Papel", 33.90, "056789", "John Green");

        for(int i = 0; i < vetorProdutos.length; i++){
            vetorProdutos[i].mostrarDetalhesDoItem();
        }

        Produtos novaInstancia = new Livros("Cidades de Papel", 33.90, "056789", "John Green");
        Produtos novaInstancia2 = new Livros("Cidades de Papel", 33.90, "056788", "John Green");

        buscarProduto(novaInstancia, vetorProdutos);
        buscarProduto(novaInstancia2, vetorProdutos);
    }

    public static void buscarProduto(Produtos produto, Produtos[] vetorProdutos){
        System.out.println("\n----- PROCURANDO PRODUTO -----");
        for(int i = 0; i < vetorProdutos.length; i++){
            if(produto.equals(vetorProdutos[i])){
                System.out.println("O produto está na posição " + i);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
}
