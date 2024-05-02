package aparelho.telefone;
public class Iphone implements Telefone{
    public void ligar(){
        System.out.println("LIGANDO...");
    }

    public void atende(){
        System.out.println("LIGAÇÂO ATENDIDA");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}