package ex02;

public class Circulo extends Forma {

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (3.14 * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * 3.14 * raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
