public interface BookListTAD {

    void inserirInicio(int id);
    void inserirFim(int id);
    void inserirPosicao(int id, int pos);

    int removerInicio();
    int removerFim();
    int removerPosicao(int pos);

    int buscar(int id);

    boolean estaVazia();
    boolean estaCheia();

    int tamanho();

    void exibir();
}