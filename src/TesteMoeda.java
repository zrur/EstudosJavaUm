import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.println("Informe o valor em reais:R$");
        moeda.valorReal= leitor.nextDouble();
        System.out.println("Informe a cotação do dólar");
         moeda.cotacaoDolar= leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println("moeda.quantidadeDolar");
        System.out.println(moeda.retornarCalculoConversao());
    }
}
//calcular conversao chamou o metodo e exibiu oq tava la dentro
//void vzaio
//2+2=4
//guardar em algum lugar=atribuir
//regras de calculo do java o msm que a matematica
// *
// -/
// +
// -
//%
//x=2*2;
//metodo tem parenteses
//moeda tem o valor
//double metodo pega oq o usuario digitou codificaçaõ de uma classe
//ler o valor texto e converter pro double
//x=2+3*%
//media=(m1+m2)/2
//5%2=
//java n ter operador de divisao inteira-
//double da um 2,5 cravado
//this usando um atributo desta classe desta referenciar atributos e metodos que afirma q é um atributo desta classe sem ser variavel
//this so usa em atributo nao em variavel
//double numero tipo 9.3
//int numeros inteiros
//coloca o parenteses q é o metodo
//scanner le texto e manda pro double
//declarei um variavel como inteira espaço uma bolsa-leia computador
//public double o tamanho e o tipo de dado1