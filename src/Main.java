import Iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        System.out.println("Testando reprodutor musical: ");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        System.out.println();
        System.out.println("Testando aparelho telefônico: ");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println();
        System.out.println("Testando navegador: ");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

    }
}
