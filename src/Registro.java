public class Registro {
    private int cod;
    private  Registro proximo;

    public Registro(int cod){
        this.cod = cod;
        this.proximo = null;
    }

    public int getCod() {
        return cod;
    }

    public Registro getProximo() {
        return proximo;
    }

    public void setProximo(Registro proximo) {
        this.proximo = proximo;
    }
}
