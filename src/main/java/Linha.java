public class Linha {
    private Ponto inicio;
    private Ponto fim;


    public Ponto getInicio() {
        return inicio;
    }
    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }
    public Ponto getFim() {
        return fim;
    }
    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public double getComprimento(){
        double x = (fim.getX()-inicio.getX());
        double y = (fim.getY()-inicio.getY());
        double comprimento = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        return comprimento;
    }

}
