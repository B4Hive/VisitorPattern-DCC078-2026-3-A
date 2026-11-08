package b4hive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void testExibirMatriz() {
        GrafoVisitor visitor = new GrafoVisitor();
        GrafoMatriz grafoMatriz = new GrafoMatriz();
        String resultado = visitor.exibir(grafoMatriz);
        assertEquals("Exibindo Grafo Matriz", resultado);
    }

    @Test 
    public void testExibirLista() {
        GrafoVisitor visitor = new GrafoVisitor();
        GrafoLista grafoLista = new GrafoLista();
        String resultado = visitor.exibir(grafoLista);
        assertEquals("Exibindo Grafo Lista", resultado);
    }

}
