package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Refrigerado, uma extensão da classe Perecivel.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo, <br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) ter um JavaDoc útil.
 * <br><br>
 * 
 * @author Emilly e Eric
 * @version 1.0
 */

public class Refrigerado extends Perecivel {
    // Atributos da classe
    private int temperaturaIdeal;

    /**
     * Método construtor de Refrigerado, utiliza o construtor da classe Perecivel.
     *
     * @param codigo O código do produto, herdado da classe Perecivel.
     * @param nome O nome do produto, herdado da classe Perecivel.
     * @param fabricante O fabricante do produto, herdado da classe Perecivel.
     * @param peso O peso do produto, herdado da classe Perecivel.
     * @param validade A validade do produto, herdado da classe Perecivel.
     * @param temperaturaIdeal A temperatura Ideal do produto, pertencente a classe Refrigerado.
     */
    // Construtor da classe Refrigerado que chama o construtor da classe Perecivel
    public Refrigerado(int codigo, String nome, String fabricante, int peso, long validade, int temperaturaIdeal) {
        super(codigo, nome, fabricante, peso, validade);
        this.temperaturaIdeal = temperaturaIdeal;
    }

    // Getter para acessar atributos privados
    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return super.toString() + ", temperaturaIdeal: " + temperaturaIdeal;
    }

    // Método hashCode para registro em INT
    @Override
    public int hashCode() {
        int result = super.hashCode(); // Chama o hashCode da superclasse Produto
        result = 31 * result + temperaturaIdeal; // Adiciona o atributo ao cálculo do hash
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
        if (this.getClass() != o.getClass()) {
            return false;
        }
        // Chama o equals da superclasse Produto
        if (!super.equals(o)){
            return false;
        }
        // Conversão explícita para acessar os atributos do outro objeto
        Refrigerado outroRefri = (Refrigerado) o;
        // Compara o atributo =
        return temperaturaIdeal == outroRefri.temperaturaIdeal;
    }
}

// * 4) ter um JavaDoc útil e completo. PENDENTE
