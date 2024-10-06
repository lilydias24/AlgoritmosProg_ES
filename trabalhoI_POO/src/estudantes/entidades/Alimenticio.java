package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Alimenticio, uma extensão da classe Produto.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) ter um JavaDoc útil.
 * <br><br>
 * 
 * @author Emilly e Eric
 * @version 1.0
 */

public class Alimenticio extends Produto {
    // Atributos da classe 
    private long validade;

    /**
     * Método construtor de Alimenticio, utiliza o construtor da classe Produto.
     *
     * @param codigo O código do produto, herdado da classe Produto.
     * @param nome O nome do produto, herdado da classe Produto.
     * @param fabricante O fabricante do produto, herdado da classe Produto.
     * @param peso O peso do produto, herdado da classe Produto.
     * @param validade A validade do produto, pertencente a classe Alimenticio.
     */
    // Construtor de Alimenticio que chama o construtor da classe Produto
    public Alimenticio(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso);
        this.validade = validade;
    }

    // Getter para acessar atributos privados
    public long getValidade() {
        return validade;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return super.toString() + ", validade: " + validade;
    }

    // Método hashCode para registro em INT
    @Override
    public int hashCode() {
        int result = super.hashCode(); // Chama o hashCode da superclasse Produto
        result = 31 * result + Long.hashCode(validade); // Adiciona validade ao cálculo do hash
        return result;
    }

    // Método equals para comparação da estrutura dos objetos
    @Override
    public boolean equals(Object o) {
        // Verifica se o objeto passado é nulo ou de outra classe
        if (o == null) {
            return false;
        }
        // Verifica se é igual ao próprio objeto
        if (this == o) {
            return true;
        }
        // Objetos de classes diferentes nunca são iguais
        if(this.getClass() != o.getClass()){
            return false;
        }
        // Chama o equals da superclasse Produto
        if (!super.equals(o)) {
            return false;
        }
        // Conversão explícita para acessar os atributos do outro objeto
        Alimenticio outroAlimenticio = (Alimenticio) o;
        // Compara o atributo =
        return validade == outroAlimenticio.validade;
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

