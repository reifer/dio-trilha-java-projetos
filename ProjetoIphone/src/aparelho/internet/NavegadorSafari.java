package aparelho.internet;
public class NavegadorSafari implements Internet{

    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina(){
        System.err.println("PAGINA ATUALIZADA");
    }
}