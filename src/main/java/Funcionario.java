/**
 * Funcionario
 */
public class Funcionario {
    String nome;
    String sobrenome;
    float salario;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalarioAnual(){
        float SalarioAnual = salario*12;
        return SalarioAnual;
    }

    public void concederAumento(float valor){
        this.salario = ((valor/100)*salario)+salario;
    }


    public Funcionario(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        
    }

}