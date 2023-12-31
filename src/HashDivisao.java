public class HashDivisao {
    private Lista[] tabela;
    private int numeroColisoes = 0;

    private int comparacoes = 0;
    private int tamanho;


    public HashDivisao(int tamanho) {
        tabela = new Lista[tamanho];
        this.tamanho = tamanho;

        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new Lista();
        }
    }

    private int calcularIndice(int codigo) {
        int indice = codigo % tamanho;
        return Math.abs(indice);
    }

    public void inserir(Registro registro) {
        int indice = calcularIndice(registro.getCod());
        if (this.tabela[indice].getPrimeiro() == null) {
            this.tabela[indice].inserir(registro);
        } else {
            this.tabela[indice].inserir(registro);
            numeroColisoes ++;
        }
    }
    public int getComparacoes() {
        return comparacoes;
    }
    public void buscar(Registro registro) {
        int indice = calcularIndice(registro.getCod());

        boolean achou = false;
        var atual = this.tabela[indice].getPrimeiro();

        while (!achou) {
            comparacoes++;

            if (atual.getCod() == registro.getCod()) {
                achou = true;
                break;
            }
            else atual = atual.getProximo();
        }

    }
}
