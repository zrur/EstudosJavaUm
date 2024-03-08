public class Moeda {

    public double valorReal;

    public double cotacaoDolar;

    public double quantidadeDolar;

    public void calcularConversao(){
        this.quantidadeDolar = this.valorReal/this.cotacaoDolar;
    }

    public double retornarCalculoConversao(){
              double dolar = this.valorReal/this.cotacaoDolar;
              return dolar ;
    }
}
/*vai ter 3 atributos-->double valor real decimal
moeda nome da classe
atributos valor real/cotaçao/quantidade dolar/
metodos onde codfica a açao as regras os calculos progamação no metodo
toda progamção ta no void executa a ação

public +
void retorno
calcularConversao nomeMetodo
()parametro

printf mostra o texto
println mostra texto e pula linha
metodo com retorno devolver alguma coisa pergunta o nome e responde-devolve o nome
metodo sem retorno escreve seu nome
*/
//-----ARTHURAMOSSANTOS-----------------
//sem retorno fez o calculo e guardou na memoria,quando tem retorno significa q vai chamar o
// metodo ele vai fazer algo  e tem q devolver esse algo,do tipo do retorno
//metodo com retorno (int,double,String,moeda)return um tipo que foi definido aqui
//dolar uma variavel
//metodo sem retorno (void)