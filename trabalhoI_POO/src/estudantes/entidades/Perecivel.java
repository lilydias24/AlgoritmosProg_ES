package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Perecível, uma extensão da classe Alimenticio.
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

public class Perecivel extends Alimenticio {

    /**
     * Método construtor de Perecivel, utiliza o construtor da classe Alimenticio.
     *
     * @param codigo O código do produto, herdado da classe Alimenticio.
     * @param nome O nome do produto, herdado da classe Alimenticio.
     * @param fabricante O fabricante do produto, herdado da classe Alimenticio.
     * @param peso O peso do produto, herdado da classe Alimenticio.
     * @param validade A validade do produto, herdado da classe Alimenticio.
     */
    // Construtor da classe Perecivel que chama o construtor da classe Alimenticio
    public Perecivel(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso, validade);
    }

    // Não é necessário sobrescrever os métodos getters, hashCode e equals
    // pois a classe Alimenticio já os fornece

    @Override
    public String toString() {
        return "Perecível: " + super.toString();
    }

    // hashCode e equals já herdados de Alimenticio, podem ser mantidos.
}

