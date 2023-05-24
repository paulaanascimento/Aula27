package ex02;

public class Main {
    public static void main(String[] args) {

        Forma[] vetorFormas = new Forma[5];

        vetorFormas[0] = new Retangulo(5, 3);
        vetorFormas[1] = new Circulo(30);
        vetorFormas[2] = new Quadrado(4);
        vetorFormas[3] = new Retangulo(25, 10);
        vetorFormas[4] = new Circulo(9);

        for(int i = 0; i < vetorFormas.length; i++){
            if(vetorFormas[i] instanceof Quadrado){
                System.out.println("----- QUADRADO -----");
            } else if(vetorFormas[i] instanceof Circulo){
                System.out.println("----- CIRCULO -----");
            } else if(vetorFormas[i] instanceof Retangulo){
                System.out.println("----- RETANGULO -----");
            }

            System.out.println("Area: " + vetorFormas[i].calcularArea());
            System.out.println("Perimetro: " + vetorFormas[i].calcularPerimetro());
        }
    }
}
