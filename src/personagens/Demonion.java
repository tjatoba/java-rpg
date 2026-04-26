package personagens;

import defesa.*;

public class Demonion extends Inimigo {
    public Demonion() {
        super("Demonion", 500, 200, new Escudo(10));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou o Demonion, o senhor do fogo!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu voltarei!!!");
    }

    @Override
    public void fazAtaque(Criatura jogador) {
        this.atacar(jogador);
    }
    
}
