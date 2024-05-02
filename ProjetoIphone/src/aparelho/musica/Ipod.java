package aparelho.musica;
public class Ipod implements Musica{
    
    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }   

    public void selecionarMusica(){
        System.out.println("SELECIONADO MUSICA");
    }

    public void pausar(){
        System.out.println("MUSICA PAUSADA");
    }
}