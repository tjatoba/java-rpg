package personagens;

public class Aamon extends Inimigo {
    public Aamon() {
        super("Aamon", 2500, 200);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou Aamon, o senhor das trevas!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu retornarei para governar tudo novamente!");
    }


    @Override
    public void fazAtaque(Criatura jogador) {
        // Sorteia um valor entre 0 e 1 para decidir se o ataque será realizado
        double chance = Math.random();
        if (chance < 0.5) {
            System.out.println("Aamon hesita e não ataca!");
        } else {
            System.out.println("Aamon ataca com toda a sua força!");
            this.atacar(jogador);

        }
    }
}
