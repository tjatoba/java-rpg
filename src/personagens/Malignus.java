package personagens;

public class Malignus extends Inimigo {
    public Malignus() {
        super("Maligus", 1000, 50);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Meu nome é Malignus, eu vou te mataaaaaaaar!!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("NÃAAAAAAAAaaaaaooo!!!");
    }

    @Override
    public void fazAtaque(Criatura jogador) {
        this.atacar(jogador);

    }

}
