package aparelho.aparelhotelefonico;

import aparelho.internet.Internet;
import aparelho.musica.Musica;
import aparelho.telefone.Telefone;

public class AparelhoIphone implements Internet, Musica, Telefone{

    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA VIA IPHONE");
    }
    public void adicionarNovaAba(){
        System.out.println("ABRINDO NOVA ABA VIA IPHONE");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA VIA IPHONE");
    }

    public void tocar(){
        System.out.println("TOCANDO MUSICA VIA IPHONE");
    }
    public void selecionarMusica(){
        System.out.println("ESCOLHENDO MUSICA VIA IPHONE");
    }
    public void pausar(){
        System.out.println("PAUSAR MUSICA VIA IPHONE");
    }

    public void ligar(){
        System.out.println("LIGANDO VIA IPHONE");
    }
    public void atende(){
        System.out.println("ATENDENDO TELEFONE VIA IPHONE");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE");
    }
}