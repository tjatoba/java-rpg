import java.util.Scanner;
import personagens.*;
import armas.*;
import defesa.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeJogador = sc.nextLine();
        
        // Escolher arma curta
        System.out.println("Escolha sua arma de curta distância:");
        System.out.println("[1] Faca (dano: 80, chance: 60%)");
        System.out.println("[2] Espada (dano: 100, chance: 55%)");
        System.out.println("[3] Machado (dano: 120, chance: 45%)");
        int escolhaCurta = sc.nextInt();
        while (escolhaCurta < 1 || escolhaCurta > 3) {
            System.out.println("Número inválido! Digite novamente: ");
            escolhaCurta = sc.nextInt();
        }
        Arma armaCurta;
        switch (escolhaCurta) {
            case 1: armaCurta = new Faca(); break;
            case 2: armaCurta = new Espada(); break;
            case 3: armaCurta = new Machado(); break;
            default: armaCurta = new Faca(); break;
        }
        
        // Escolher arma longa
        System.out.println("Escolha sua arma de longa distância:");
        System.out.println("[1] Arco e Flecha (dano: 110, chance: 40%, munição: 10)");
        System.out.println("[2] Pistola (dano: 150, chance: 50%, munição: 10)");
        System.out.println("[3] Rifle (dano: 180, chance: 60%, munição: 8)");
        int escolhaLonga = sc.nextInt();
        while (escolhaLonga < 1 || escolhaLonga > 3) {
            System.out.println("Número inválido! Digite novamente: ");
            escolhaLonga = sc.nextInt();
        }
        Arma armaLonga;
        switch (escolhaLonga) {
            case 1: armaLonga = new ArcoEFlecha(); break;
            case 2: armaLonga = new Pistola(); break;
            case 3: armaLonga = new Rifle(); break;
            default: armaLonga = new ArcoEFlecha(); break;
        }
        
        Arma[] armasJogador = {armaCurta, armaLonga};
        
        Criatura jogador = new Jogador(nomeJogador, armasJogador);
        Criatura[] inimigos = {new Malignus(), new Demonion(), new Aamon()};

        System.out.println("##############");
        jogador.fraseApresentacao();
        for(Criatura inimigo : inimigos) {
            inimigo.fraseApresentacao();
        }

        java.util.List<String> resultados = new java.util.ArrayList<>();

        for(int i = 0; i < 3; i++) {
            Criatura inimigoAtual = inimigos[i];
            System.out.println("\n=== Batalha " + (i+1) + " contra " + inimigoAtual.getNome() + " ===");

            Batalha batalha = new Batalha(jogador, inimigoAtual, sc);
            Criatura vencedor = batalha.iniciarBatalha();

            if(vencedor == jogador) {
                resultados.add("Batalha " + (i+1) + ": Vitória contra " + inimigoAtual.getNome());
                jogador.setVida(900); // Restaurar vida
            } else {
                resultados.add("Batalha " + (i+1) + ": Derrota contra " + inimigoAtual.getNome());
                break;
            }
        }

        System.out.println("\n=== Resultados das Batalhas ===");
        for(String resultado : resultados) {
            System.out.println(resultado);
        }

        sc.close();
    }
}
