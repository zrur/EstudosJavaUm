public class Vendedor extends Funcionario{
    private double comissao;

    @Override
    public double calculaBonificacao() {
        return super.calculaBonificacao() + 500;
    }

    public double calculoComissao(double valorVendido){
        this.comissao + valorVendido * 0.10;
        return super.getSalario()
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}