package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Higiene, uma extensão da classe Cuidados Pessoais.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo,<br>
 * 2) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 3) ter um JavaDoc útil.
 * <br><br>
 * 
 * @author Emilly e Eric
 * @version 1.0
 */

public class Higiene extends CuidadosPessoais {

    /**
     * Método construtor de Higiene, utiliza o construtor da classe CuidadosPessoais.
     *
     * @param codigo O código do produto, herdado da classe CuidadosPessoais.
     * @param nome O nome do produto, herdado da classe CuidadosPessoais.
     * @param fabricante O fabricante do produto, herdado da classe CuidadosPessoais.
     * @param peso O peso do produto, herdado da classe CuidadosPessoais.
     * @param validade A validade do produto, herdado da classe CuidadosPessoais.
     * @param fragrancia A fragrancia do produto, herdado da classe CuidadosPessoais.
     */
    // Construtor da classe Higiene que chama o construtor da classe CuidadosPessoais
    public Higiene(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);
    }

    // Não é necessário sobrescrever os métodos hashCode e equals
    // pois a classe CuidadosPessoais já os fornece

    @Override
    public String toString() {
        return "Higiene: " + super.toString();
    }

    // hashCode e equals já herdados de CuidadosPessoais, podem ser mantidos.
}

