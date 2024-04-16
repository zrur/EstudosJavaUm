
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciando!");
        //pode ser facilmente manipulada por ser publica
        //Instanciando um objeto de classe Musica
        Musica novaMusica = new Musica("");
        novaMusica.setNome("War Pigs");
        novaMusica.setArtista("Black Sabbath");
        novaMusica.setGenero("Heavy Metal");
        novaMusica.setDuracao(379);
        novaMusica.setAnodeLancamento(1978);
    }
//como resoolver quando esta privada
    //get e setter o encapsulamento da classe
}