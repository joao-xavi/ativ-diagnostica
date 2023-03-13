public class Empregado {
    String nome;
    String sobrenome;
    Float salario;

    public Empregado(String nome, String sobrenome, Float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

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

    public Float getSalario() {
        if(salario<0){
            return 0.0f;
        }
        return salario;
    }

    public void setSalario(Float salario){
        this.salario = salario;
    }

    public Float salarioAnual(Float salario) {
        return salario*12;
    }

    public boolean recebeBem(){
        if(salario>=10000){
            return true;
        }else{
        return false;
        }
    }
}
