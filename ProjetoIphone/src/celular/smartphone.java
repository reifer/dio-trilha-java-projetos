package celular;

import aparelho.aparelhotelefonico.AparelhoIphone;
import aparelho.internet.Internet;
import aparelho.musica.Musica;
import aparelho.telefone.Iphone;
import aparelho.telefone.Telefone;

public class smartphone {
    public static void main(String[] args) {
        AparelhoIphone Iph = new AparelhoIphone();

        Iphone iphone = new Iphone();

        Telefone telefone = Iph;
        Internet internet = Iph;
        Musica musica = Iph;

        telefone.ligar();
        telefone.atende();
        telefone.iniciarCorreioVoz();

        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();

        musica.tocar();
        musica.selecionarMusica();
        musica.pausar();
    }
}