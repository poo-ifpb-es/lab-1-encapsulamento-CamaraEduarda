public class Estudante {
    
    int matricula;
    String nome;
   

    

    public Estudante(String nome ,int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}