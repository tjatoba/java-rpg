package armas;

import java.util.Random;
import personagens.Criatura;

public abstract class Arma {
    private String nome;
    private int dano;
    private int chance;

    public Arma(String nome, int dano, int chance) {
        this.nome = nome;
        this.dano = dano;
        this.chance = chance;
    }

    public void descricao() {
        System.out.println(this.nome + ": " + "dano: " + this.dano + "chance: " + this.chance + "% ");

    }

    public void acao(Criatura alvo) {
        Random rd = new Random();
        int sorteio = rd.nextInt(0, 100);
        if (sorteio < chance) {
            alvo.tomaDano(this.dano);
        } else {
            System.out.println("O seu ataque falhou!");
        }
    }
}