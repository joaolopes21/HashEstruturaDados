import java.util.Random;

public class criadorRegistro {
    Random random;

    public criadorRegistro() {
        this.random = new Random(12345);
    }

    public Registro gerarRegistro() {
        return new Registro(this.random.nextInt(100000000, 999999999));
    }
}
