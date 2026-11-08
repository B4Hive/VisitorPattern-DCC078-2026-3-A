package b4hive;

public class GrafoLista implements Grafo {
    @Override 
    public String accept(GrafoVisitor visitor) {
        return visitor.exibirLista(this);
    }
}
