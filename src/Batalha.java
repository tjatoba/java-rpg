import java.util.Scanner;
import personagens.*;

public class Batalha {
    private Criatura jogador;
    private Criatura inimigo1;
    private Criatura inimigo2;
    private Scanner sc;
    private Criatura vencedor;

    public Batalha(Criatura jogador, Criatura inimigo1, Criatura inimigo2, Scanner sc) {
        this.jogador = jogador;
        this.inimigo1 = inimigo1;
        this.inimigo2 = inimigo2;
        this.sc = sc;
        this.vencedor = null;
    }

    public Criatura iniciarBatalha() {
        int cont = 0;

        while (true) {
            cont++;

            System.out.println("\nRodada: " + cont);

            System.out.println("##############");
            System.out.println("Escolha o inimigo: " + "\n[1] " + inimigo1.getClass().getSimpleName() + "\n[2] " + inimigo2.getClass().getSimpleName());

            int escolhaInimigo = sc.nextInt();
            while (escolhaInimigo < 1 || escolhaInimigo > 2) {
                System.out.println("Número inválido! Digite novamente: ");
                escolhaInimigo = sc.nextInt();
            }
            Criatura inimigoEscolhido = (escolhaInimigo == 1) ? inimigo1 : inimigo2;

            jogador.mostrarStatus();

            if (inimigoEscolhido == inimigo1) {
                inimigo1.mostrarStatus();
            } else {
                inimigo2.mostrarStatus();
            }

            jogador.fazAtaque(inimigoEscolhido);

            if (inimigoEscolhido.estaVivo()) {
                inimigoEscolhido.fazAtaque(jogador);
            }

            if (!jogador.estaVivo()) {
                jogador.fraseMorte();
                vencedor = inimigoEscolhido;
                break;
            }

            if (!inimigoEscolhido.estaVivo()) {
                inimigoEscolhido.fraseMorte();
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