public class Funcionario {

    private String nome;
    private double salario;
    public double calculaBonificacao(){
        return this.salario / 100 * 30;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario(double valorVendido) {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}