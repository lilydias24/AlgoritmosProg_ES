package estudantes.entidades;

public class Papelaria extends Produto {
    
    // Construtor da classe Papelaria que chama o construtor da classe Produto
    public Papelaria(int codigo, String nome, String fabricante, int peso) {
        super(codigo, nome, fabricante, peso);
    }

    // Não é necessário sobrescrever os métodos getters, hashCode e equals
    // pois a classe Produto já os fornece

    @Override
    public String toString() {
        return "Papelaria: " + super.toString();
    }

    // hashCode e equals já herdados de Produto, podem ser mantidos, pois não há novos atributos.
}


//  * 4) ter um JavaDoc útil e completo. PENDENTE

