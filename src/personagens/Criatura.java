package personagens;

public abstract class Criatura {
    private String nome;
    private int vida;

    // public Criatura(){}

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void atacar(Criatura alvo);

    public abstract void fraseApresentacao();

    public abstract void fraseMorte();

    public void tomaDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void mostrarStatus() {
        System.out.printf("Nome: %s | Vida: %d\n", this.nome, this.vida);
    }
    public String getNome() {
        return this.nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void fazAtaque(Criatura inimigo);
}