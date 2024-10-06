package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Limpeza, uma extensão da classe Produto.
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

public class Limpeza extends Produto {
    
    /**
     * Método construtor de Limpeza, utiliza o construtor da classe Produto.
     *
     * @param codigo O código do produto, herdado da classe Produto.
     * @param nome O nome do produto, herdado da classe Produto.
     * @param fabricante O fabricante do produto, herdado da classe Produto.
     * @param peso O peso do produto, herdado da classe Produto.
     */
    // Construtor da classe Limpeza que chama o construtor da classe Produto
    public Limpeza(int codigo, String nome, String fabricante, int peso) {
        super(codigo, nome, fabricante, peso);
    }

    // Não é necessário sobrescrever os métodos getters, hashCode e equals
    // pois a classe Produto já os fornece

    @Override
    public String toString() {
        return "Limpeza: " + super.toString();
    }

    // hashCode e equals já herdados de Produto, podem ser mantidos, pois não há novos atributos.
}


//  * 4) ter um JavaDoc útil e completo. PENDENTE

