//Uma classe ela serve para representar um objeto ou um conceito do mundo real
//e trazer ela para o mundo da progamaçaõ
// geralmente classes na gramatica são substantivos,ou seja, nome de coisas
// uma classe e composta por atributos e metodos
//as classes que são substantivos inerentes ao doiminio dpo problema sao chmados de classe entidade
// as classes da
//
//main n pode esar em um pacote
public class Musica {
    // Atributos são as caracteristicas do objeto
    // Atributos são adejtivos ou substantivos
    //arrubutos tem a seguinte estrutura: visibilidade,tipo,nome
    //visibilidade:public,private,protected,defaut
    //tipo:int,double,float,String,boolean,char
    //nome: nome do atributo
    private String nome;
    private String artista;
    private String genero;
    private int duracao;
    private int anodeLancamento;
    //construtor é um metodo especial qie é chamado quabdo um obejto é instaciado


    public Musica(String nome) {
        this.nome = nome;
    }

    public Musica(int duracao) {
        this.duracao = duracao;
    }

    public int getAnodeLancamento() {
        return anodeLancamento;
    }

    public void setAnodeLancamento(int anodeLancamento) {
        if (anodeLancamento<=0){
            System.out.println("O ano de lançamento não pode ser negativa ou zero!");
        }
        this.anodeLancamento = anodeLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao<=0){
           System.out.println("A duração da musica não pode ser negativa ou zero!");
           return;
        }
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodos são as ações que o obejto pode realizar
    //Metodos são verbos//metodo sem retorno
    //metodos tem a seguinte estrutura:visibilidade,tipo de retorno,nome,parametro
    public void tocar(){
        System.out.println("Tocando a musica"+ nome);
    }
    public void curtir(){
        System.out.println("Curtindo a música"+ nome);
    }
    public void pausar(){
    System.out.println("Pausando a musica"+ nome);

//estrutura padrao de uma classe
}
}
