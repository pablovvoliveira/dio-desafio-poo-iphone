package Iphone;

import Interfaces.AparelhoTelefonico;
import Interfaces.Navegador;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página web");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Musica");
    }
}
