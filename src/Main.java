import javax.management.DescriptorAccess;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        Random buscaAleatoria = new Random();

        criadorRegistro conjunto = new criadorRegistro();

        HashMapSubtracao hashmap = new HashMapSubtracao(70);
        HashMapSubtracao hashmap2 = new HashMapSubtracao(700);
        HashMapSubtracao hashmap3 = new HashMapSubtracao(7000);
        HashMapSubtracao hashmap4 = new HashMapSubtracao(70000);
        HashMapSubtracao hashmap5 = new HashMapSubtracao(700000);

        main.medirTempoInserir(hashmap5, conjunto);
        main.medirTempoBuscar(hashmap5, conjunto);

    }


    public void medirTempoBuscar(HashMapSubtracao hashmap, criadorRegistro conjunto){
        long tempoInicio = System.nanoTime();

        hashmap.buscar(new Registro(129830826));
        hashmap.buscar(new Registro(231681644));
        hashmap.buscar(new Registro(180902084));
        hashmap.buscar(new Registro(937881439));
        hashmap.buscar(new Registro(410954351));

        long tempoFim = System.nanoTime();
        long duracao = tempoFim - tempoInicio;
        System.out.println("O tempo gasto para buscar 5 elementos foi de " + duracao + " nanossegundos");
        System.out.println("Foram necessárias " + hashmap.getComparacoes() + "  comparações");

    }
    public void medirTempoInserir(HashMapSubtracao hashmap, criadorRegistro conjunto) {
        long tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < 7000000; i++) {
            var registroNovo = conjunto.gerarRegistro();
            hashmap.inserir(registroNovo);
        }

        long tempoFim = System.currentTimeMillis();
        long duracao = tempoFim - tempoInicio;
        System.out.println("O tempo gasto para inserir foi de " + duracao + "ms");
    }
}
