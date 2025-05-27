package Penalidades;

public class Simulador {
    public static void main(String[] args) {
        Jogador messi = new Jogador("Messi", 1);
        Jogador neymar = new Jogador("Neymar", 2);

        messi.chuta();
        messi.fazGol();
        messi.chuta();
        neymar.chuta();
        neymar.fazGol();
        neymar.chuta();

        neymar.imprimeDados();
        messi.imprimeDados();
    }
}