
public class RelogioDigital {
    int hora;
    int minuto;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }

    public void tick(){
        
        minuto++;

        if (minuto > 59) {
            minuto = 0;
            hora++;
        } 
        if(hora > 23) {
            hora = 0;
        }

    }

    
}