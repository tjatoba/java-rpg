package defesa;

import java.util.Random;

public class EscudoEsquiva extends Defesa {
    private int reducao;
    private int chance;

    public EscudoEsquiva(int reducao, int chance) {
        this.reducao = reducao;
        if (chance < 0) {
            chance = 0;
        }
        if (chance > 100) {
            chance = 100;
        }
        this.chance = chance;
    }

    @Override
    public int danoReduzido(int danoOriginal) {
        Random rd = new Random();
        int sorteio = rd.nextInt(0, 100);
        if (sorteio < chance) {
            System.out.println("O inimigo esquivou do seu ataque!");
            return 0;
        }
        // Se não esquivou, aplica redução do escudo
        if (reducao > danoOriginal) {
            return 0;
        }
        return danoOriginal - reducao;
    }
}
