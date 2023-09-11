
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

        if ((minuto < 59) && (hora < 23)) {
            minuto++;
        } 
        else if ((minuto == 59) && (hora < 23)) {
            minuto = 0;
            hora++;
        } 
        else if ((hora == 23) && (minuto < 59)) {
            minuto++;
        }

    }

    
}