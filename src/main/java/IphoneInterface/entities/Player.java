package IphoneInterface.entities;

import IphoneInterface.Interface.ReprodutorMusical;

public class Player implements ReprodutorMusical {
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
