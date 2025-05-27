package Penalidades;

public class Jogador {
    private String nome;
    private int quantidadeGols, quantidadeChutes, tipoDeChute;

    public Jogador(String nome, int tipoDeChute) {
        this.nome = nome;
        this.tipoDeChute = tipoDeChute; // 0 = meio, 1 = esquerda, 2 = direita
        this.quantidadeGols = 0;
        this.quantidadeChutes = 0;
    }

    public int gettipoDeChute() {
        return tipoDeChute;
    }

    public void chuta() {
        this.quantidadeChutes++;
    }

    public void fazGol() {
        quantidadeGols++;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Gols: " + quantidadeGols);
        System.out.println("Quantidade de Chutes: " + quantidadeChutes);
        System.out.println("Tipo de Chute: " + tipoDeChute);
    }
}
