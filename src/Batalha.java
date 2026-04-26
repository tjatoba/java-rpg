import java.util.Scanner;
import personagens.*;

public class Batalha {
    private Criatura jogador;
    private Criatura inimigo;
    private Scanner sc;
    private Criatura vencedor;

    public Batalha(Criatura jogador, Criatura inimigo, Scanner sc) {
        this.jogador = jogador;
        this.inimigo = inimigo;
        this.sc = sc;
        this.vencedor = null;
    }

    public Criatura iniciarBatalha() {
        int cont = 0;

        while (true) {
            cont++;

            System.out.println("\nRodada: " + cont);

            System.out.println("##############");

            jogador.mostrarStatus();
            inimigo.mostrarStatus();

            jogador.fazAtaque(inimigo);

            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }

            if (!jogador.estaVivo()) {
                jogador.fraseMorte();
                vencedor = inimigo;
                break;
            }

            if (!inimigo.estaVivo()) {
                inimigo.fraseMorte();
                vencedor = jogador;
                break;
            }
        }
        return vencedor;
    }

    public Criatura getVencedor() {
        return vencedor;
    }
}