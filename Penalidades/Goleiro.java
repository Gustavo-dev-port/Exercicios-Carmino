package Penalidades;

public class Goleiro {
    private String nome;
    private int quantidadeDefesas, tipoDefesa, quantTentativas;
    private boolean seAdiantou;

    public Goleiro(String nome) {
        this.nome = nome;
        this.quantidadeDefesas = 0;
        this.quantTentativas = 0;
        this.seAdiantou = false;
        this.tipoDefesa = 0; // 0 = meio, 1 = esquerda, 2 = direita
    }

    public int gettipoDefesa() {
        return tipoDefesa;
    }

    public boolean getSeAdiantou() {
        return seAdiantou;
    }

    public void pula() {
        this.quantTentativas++;
    }

    public void defendeu() {
        quantidadeDefesas++;
    }

    public void prepara() {
        switch (tipoDefesa) {
            case 0 -> {
                seAdiantou = true; // se adiantou
                tipoDefesa = 1; // muda para esquerda
            }
            case 1 -> {
                seAdiantou = false; // não se adiantou
                tipoDefesa = 2; // muda para direita
            }
            default -> {
                seAdiantou = false; // se adiantou
                tipoDefesa = 0; // volta para meio
            }
        }
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Defesas: " + quantidadeDefesas);
        System.out.println("Quantidade de Tentativas: " + quantTentativas);
        System.out.println("Tipo de Defesa: " + tipoDefesa);
        System.out.println("Se adiantou: " + seAdiantou);
    }
}
