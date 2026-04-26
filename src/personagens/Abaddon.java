package personagens;

import defesa.*;

public class Abaddon extends Inimigo {
    public Abaddon() {
        super("Abaddon", 1500, 100, new EscudoEsquiva(20, 50));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou Abaddon, o destruidor de mundos!");
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
