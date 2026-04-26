package personagens;

import defesa.*;

public abstract class Inimigo extends Criatura {
    private int ataque;
    private Defesa defesa = new Escudo(10);

    public Inimigo(String nome, int vida, int ataque) {
        super(nome, vida);
        this.ataque = ataque;
        this.defesa = new Defesa();
    }

    public Inimigo(String nome, int vida, int ataque, Defesa defesa) {
        super(nome, vida);
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Criatura alvo) {
        alvo.tomaDano(this.ataque);
    }

    @Override
    public void tomaDano(int dano) {
        int danoReduzido = this.defesa.danoReduzido(dano);
        super.tomaDano(danoReduzido);
    }
}