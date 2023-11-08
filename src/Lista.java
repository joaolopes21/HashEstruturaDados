public class Lista {
    private Registro primeiro;

    public void inserir(Registro registro) {
        if (primeiro == null) {
            primeiro = registro;
        } else {
            Registro atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(registro);
        }
    }

    public Registro getPrimeiro() {
        return this.primeiro;
    }
}