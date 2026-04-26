import java.util.Scanner;
import personagens.*;
import armas.*;
import defesa.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Criatura jogador = new Jogador("Thiago");
        Criatura inimigo = new Malignus();
        Criatura inimigo2 = new Demonion();

        System.out.println("##############");
        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();
        inimigo2.fraseApresentacao();

        int cont = 0;

        while (true) {
            cont++;

            System.out.println("\nRodada: " + cont);

            System.out.println("##############");
            System.out.println("Escolha o inimigo: " + "\n[1] " + inimigo.getClass().getSimpleName() + "\n[2] " + inimigo2.getClass().getSimpleName());

        

            int escolhaInimigo = sc.nextInt();
            while (escolhaInimigo < 1 || escolhaInimigo > 2) {
                System.out.println("Número inválido! Digite novamente: ");
                escolhaInimigo = sc.nextInt();
            }
            Criatura inimigoEscolhido = (escolhaInimigo == 1) ? inimigo : inimigo2;

            jogador.mostrarStatus();

            if (inimigoEscolhido == inimigo) {
                inimigo.mostrarStatus();
            } else {
                inimigo2.mostrarStatus();
            }

            jogador.fazAtaque(inimigoEscolhido);

            if (inimigoEscolhido.estaVivo()) {
                inimigoEscolhido.fazAtaque(jogador);
            }

            if (!jogador.estaVivo()) {
                jogador.fraseMorte();
                break;
            }

            if (!inimigoEscolhido.estaVivo()) {
                inimigoEscolhido.fraseMorte();
                break;
            }
        }
        sc.close();
    }
}
