package personagens;

import defesa.*;

public class Abaddon extends Inimigo {
    public Abaddon() {
        super("Abaddon", 3000, 250, new EscudoEsquiva(70, 30));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou Abaddon, o anjo da destruição!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu retornarei para destruir tudo novamente!");
    }

    @Override
    public void fazAtaque(Criatura jogador) {
        this.atacar(jogador);
    }

}