public class CarroAlugel {

    float valorPorKm;
    int DistanciaPercorrida;
    boolean disponivel;
    boolean sinistro;
    float debito;


   

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }


    public int getDistanciaPercorrida() {
        return DistanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        DistanciaPercorrida = distanciaPercorrida;
    }


    public boolean isDisponivel(){
        return disponivel;
    }

    public boolean hasSinistro(){
        return sinistro;
    }

    public void setSinistro(boolean sinistro) {
            this.sinistro = sinistro;
        }
    
    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public void Alugar() throws CarroIndisponivelException{
        if (!disponivel) {
            throw new CarroIndisponivelException("Indisponível");
            
        }
        disponivel= false;
    }

    public void Devolver() throws CarroDisponivelException {
        if (!disponivel) {
            throw new CarroDisponivelException("Não pode ser disponível");
            
        }
        disponivel = true;

    }
}

  