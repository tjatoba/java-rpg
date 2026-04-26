package personagens;

import java.util.Scanner;
import armas.*;

public class Jogador extends Criatura {
    private Arma[] armas;

    public Jogador(String nome, Arma[] armas) {
        super(nome, 900);
        this.armas = armas;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void atacar(Criatura alvo) {
        System.out.println("Escolha sua arma: ");
        // for (int i = 0; i < armas.length; i++) {
        // System.out.print((i + 1) + " - ");
        // armas[i].descricao();
        // }
        int n = 0;
        for (Arma arma : armas) {
            System.out.print((n + 1) + " - ");
            arma.descricao();
            n++;
        }

        int escolha = sc.nextInt();
        while (escolha < 1 || escolha > n) {
            System.out.println("Número inválido! Digite novamente: ");
            escolha = sc.nextInt();
        }

        armas[escolha - 1].acao(alvo);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Não contava com minha astucia!!!");

    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu voltarei pra te arrasar!!!");

    }

    @Override
    public void fazAtaque(Criatura inimigo) {
        this.atacar(inimigo);
    }

}
