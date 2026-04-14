public class Main {
    public static void main(String[] args) {

        BookList lista = new BookList(10);

        lista.inserirFim(10);
        lista.inserirFim(20);
        lista.inserirInicio(5);
        lista.inserirPosicao(15, 2);

        lista.exibir(); // 5 10 15 20

        lista.removerInicio();
        lista.exibir(); // 10 15 20

        lista.removerPosicao(1);
        lista.exibir(); // 10 20

        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Tamanho: " + lista.tamanho());
    }
}