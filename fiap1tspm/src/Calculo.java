public class Calculo  {
    private double peso;

    private double altura;

    public Calculo(Double peso,Double altura){
        this.peso = peso;
        this.altura = altura;


    }
    public double calcularIMC(){
        return this.peso /(this.altura * this.altura);
    }
public String exibirIMC() {
    double imc = calcularIMC();
    String msg;

    if (imc<=18.5){
        msg ="Abaixo do peso";
    }else if (imc>18.5 && imc<=25){

    }
}


