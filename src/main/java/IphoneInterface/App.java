package IphoneInterface;

import IphoneInterface.entities.Iphone;
import IphoneInterface.entities.Player;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Iphone iphoneOne = new Iphone();
        Player player = new Player();

        System.out.println("************Modo Telefone***************");
        iphoneOne.ligar("47 991234852");
        iphoneOne.atender(false);
        iphoneOne.iniciarCorreioVoz();

        System.out.println("\n************Modo Música***************");
        iphoneOne.tocar();
        iphoneOne.pausar();
        iphoneOne.selecionarMusica("Asaf Avidan, The Mojos - One Day");

        System.out.println("\n************Modo Navegador***************");
        iphoneOne.exibirPagina("https://github.com/BrunoDosSantos17");
        iphoneOne.atualizarPagina();
        iphoneOne.adicionarNovaAba();

        System.out.println("\n************Modo Player***************");
        player.selecionarMusica("Lukas Graham - 7 Years");
        player.tocar();
        player.pausar();

    }
}
