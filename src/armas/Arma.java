package armas;

import java.util.Random;
import personagens.Criatura;

public abstract class Arma {
    private String nome;
    private int dano;
    private int chance;
    private int municao;

    public Arma(String nome, int dano, int chance) {
        this.nome = nome;
        this.dano = dano;
        this.chance = chance;
        this.municao = -1; // ilimitado por padrão
    }

    public Arma(String nome, int dano, int chance, int municao) {
        this.nome = nome;
        this.dano = dano;
        this.chance = chance;
        this.municao = municao;
    }

    public void descricao() {
        String desc = this.nome + ": " + "dano: " + this.dano + " chance: " + this.chance + "% ";
        if (this.municao == -1) {
            desc += "(munição ilimitada)";
        } else {
            desc += "(munição restante: " + this.municao + ")";
        }
        System.out.println(desc);
    }

    public void acao(Criatura alvo) {
        if (this.municao == 0) {
            System.out.println("A munição da " + this.nome + " acabou! Dano: 0");
            alvo.tomaDano(0);
            return;
        }
        Random rd = new Random();
        int sorteio = rd.nextInt(0, 100);
        if (sorteio < chance) {
            alvo.tomaDano(this.dano);
        } else {
            System.out.println("O seu ataque falhou!");
        }
        if (this.municao > 0) {
            this.municao--;
        }
    }
}