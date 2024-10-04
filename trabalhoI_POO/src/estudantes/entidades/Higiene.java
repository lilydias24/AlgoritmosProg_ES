package estudantes.entidades;

public class Higiene extends CuidadosPessoais {

    // Construtor da classe Higiene que chama o construtor da classe CuidadosPessoais
    public Higiene(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);
    }

    // Não é necessário sobrescrever os métodos getters, hashCode e equals
    // pois a classe CuidadosPessoais já os fornece

    @Override
    public String toString() {
        return "Higiene: " + super.toString();
    }

    // hashCode e equals já herdados de CuidadosPessoais, podem ser mantidos.
}

