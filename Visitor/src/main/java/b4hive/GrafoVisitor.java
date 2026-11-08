package b4hive;

public class GrafoVisitor {
    public String exibir(Grafo g) {
        return g.accept(this);
    }
    public String exibirLista(GrafoLista g) {
        return "Exibindo Grafo Lista";
    }
    public String exibirMatriz(GrafoMatriz g) {
        return "Exibindo Grafo Matriz";
    }
}
