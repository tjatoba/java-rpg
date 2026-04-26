package personagens;

public class Pazuzu extends Inimigo {
    public Pazuzu() {
        super("Pazuzu", 2000, 150);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou Pazuzu, o rei dos demônios!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu retornarei para dominar tudo novamente!");
    }

    @Override
    public void fazAtaque(Criatura jogador) {
        this.atacar(jogador);
    }   
}
