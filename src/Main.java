import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        Random buscaAleatoria = new Random();

        criadorRegistro conjunto = new criadorRegistro();

        HashDivisao hashmap = new HashDivisao(70);
        HashDivisao hashmap2 = new HashDivisao(700);
        HashDivisao hashmap3 = new HashDivisao(7000);
        HashDivisao hashmap4 = new HashDivisao(70000);
        HashDivisao hashmap5 = new HashDivisao(700000);

        main.medirTempoInserir(hashmap5, conjunto);
        main.medirTempoBuscar(hashmap5, conjunto);

    }

    public void medirTempoBuscar(HashDivisao hashmap, criadorRegistro conjunto){
        long tempoInicio = System.nanoTime();

        hashmap.buscar(new Registro(129830826));
        

        long tempoFim = System.nanoTime();
        long duracao = tempoFim - tempoInicio;
        System.out.println("O tempo gasto para buscar 5 elementos foi de " + duracao + " nanossegundos");
        System.out.println("Foram necessárias " + hashmap.getComparacoes() + "  comparações");

    }
    public void medirTempoInserir(HashDivisao hashmap, criadorRegistro conjunto) {
        long tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < 70; i++) {
            var registroNovo = conjunto.gerarRegistro();
            hashmap.inserir(registroNovo);
        }

        long tempoFim = System.currentTimeMillis();
        long duracao = tempoFim - tempoInicio;
        System.out.println("O tempo gasto para inserir foi de " + duracao + "ms");
    }
}
