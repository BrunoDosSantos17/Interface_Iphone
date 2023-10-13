package IphoneInterface.entities;

import IphoneInterface.Interface.AparelhoTelefonico;
import IphoneInterface.Interface.NavegadorInternet;
import IphoneInterface.Interface.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void ligar(String number) {
        System.out.println("Ligando para o telefone " + number);
    }

    @Override
    public void atender(boolean isRinging) {
        System.out.println(isRinging ? "Tocando telefone" : "Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicinado nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String music) {
        System.out.println("Selecionando a música: " + music);
    }
}
