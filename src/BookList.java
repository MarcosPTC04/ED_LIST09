public class BookList implements BookListTAD {

    private int[] lista;
    private int tamanho;

    public BookList(int capacidade) {
        lista = new int[capacidade];
        tamanho = 0;
    }

    @Override
    public void inserirInicio(int id) {
        if (estaCheia()) return;

        for (int i = tamanho; i > 0; i--) {
            lista[i] = lista[i - 1]; // SHIFT
        }

        lista[0] = id;
        tamanho++;
    }

    @Override
    public void inserirFim(int id) {
        if (estaCheia()) return;

        lista[tamanho] = id;
        tamanho++;
    }

    @Override
    public void inserirPosicao(int id, int pos) {
        if (estaCheia() || pos < 0 || pos > tamanho) return;

        for (int i = tamanho; i > pos; i--) {
            lista[i] = lista[i - 1]; // SHIFT
        }

        lista[pos] = id;
        tamanho++;
    }

    @Override
    public int removerInicio() {
        if (estaVazia()) return -1;

        int removido = lista[0];

        for (int i = 0; i < tamanho - 1; i++) {
            lista[i] = lista[i + 1]; // SHIFT
        }

        tamanho--;
        return removido;
    }

    @Override
    public int removerFim() {
        if (estaVazia()) return -1;

        return lista[--tamanho];
    }

    @Override
    public int removerPosicao(int pos) {
        if (estaVazia() || pos < 0 || pos >= tamanho) return -1;

        int removido = lista[pos];

        for (int i = pos; i < tamanho - 1; i++) {
            lista[i] = lista[i + 1]; // SHIFT
        }

        tamanho--;
        return removido;
    }

    @Override
    public int buscar(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i] == id) return i;
        }
        return -1;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean estaCheia() {
        return tamanho == lista.length;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }
}