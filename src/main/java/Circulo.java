public class Circulo {

    float raio;
    float pi = 3.14159f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea(){
        float area = pi * (raio*raio);
        return area;
    }

    public float getCircunferencia(){
        float circunferencia = 2*pi*raio;
        return circunferencia;
    }

    
}
