package b4hive;

public class GrafoMatriz implements Grafo {
    
    @Override
    public String accept(GrafoVisitor visitor) {
        return visitor.exibirMatriz(this);
    }
}
