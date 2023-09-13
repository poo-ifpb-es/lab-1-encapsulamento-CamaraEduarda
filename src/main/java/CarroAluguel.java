public class CarroAluguel {

    float valorPorKm;
    float DistanciaPercorrida;
    boolean disponivel;
    boolean sinistro;
    float debito;
    

    //getters e setters

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public float getDistanciaPercorrida() {
        return DistanciaPercorrida;
    }
         

    public void setDistanciaPercorrida(float distanciaPercorrida) {
        DistanciaPercorrida = distanciaPercorrida;
    }

       public boolean hasSinistro(){
        return sinistro;
    }

    public void setSinistro(boolean sinistro) {
            this.sinistro = sinistro;
    }

    public float getDebito() {
        float debito = valorPorKm*DistanciaPercorrida;
        return debito;

        }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    //Disponivel e Sinistro

    public boolean isDisponivel(){
        return disponivel;
    }


    
    //construtor

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.DistanciaPercorrida = 0;
        this.disponivel = true;
        this.debito = 0;
        this.sinistro = false;

    }
    //Excecoes

    public void alugar() throws CarroIndisponivelException{
        if (!disponivel) {
            throw new CarroIndisponivelException();
        }
        disponivel = false;
    }

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (disponivel) {
            throw new CarroDisponivelException();  
        }
       
        if (sinistro != false && (DistanciaPercorrida == 0)) {
        }
            
        sinistro = false;

        if (DistanciaPercorrida != 0) {
            throw new CarroNaoPagoException();
        }

        if (sinistro != false) {
            debito = ((debito*60)/100) + debito;
        }
        sinistro = false;

        if (!disponivel) {
            throw new CarroDisponivelException();
        }
        disponivel = false;

    }

    public void pagar() throws CarroDisponivelException {
        
        if (DistanciaPercorrida == 0) {
            debito = 0;
        }
        if (sinistro != false) {
            debito = ((debito*60)/100) + debito;
        }
        sinistro = false;

        if (!disponivel) {
            throw new CarroDisponivelException();
        }
        disponivel = false;
    }
}

  