package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Cuidados Pessoais, uma extensão da classe Produto.
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

public class CuidadosPessoais extends Produto {
    // Atributos da classe 
    private long validade;
    private String fragrancia;

    /**
     * Método construtor de CuidadosPessoais, utiliza o construtor da classe Produto.
     *
     * @param codigo O código do produto, herdado da classe Produto.
     * @param nome O nome do produto, herdado da classe Produto.
     * @param fabricante O fabricante do produto, herdado da classe Produto.
     * @param peso O peso do produto, herdado da classe Produto.
     * @param validade A validade do produto, pertencente a classe CuidadosPessoais.
     * @param fragrancia A fragrancia do produto, pertencente a classe CuidadosPessoais.
     */
    // Construtor de CuidadosPessoais que chama o construtor da classe Produto
    public CuidadosPessoais(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso);
        this.validade = validade;
        this.fragrancia = fragrancia;
    }

    // Getters para acessar atributos privados
    public long getValidade() {
        return validade;
    }
    public String getFragrancia() {
        return fragrancia;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return super.toString() + ", validade: " + validade + ", fragrancia: " + fragrancia;
    }

    // Método hashCode para registro em INT
    @Override
    public int hashCode() {
        int result = super.hashCode(); // Chama o hashCode da superclasse Produto
        result = 31 * result + Long.hashCode(validade); // Adiciona validade ao cálculo do hash
        result = 31 * result + (fragrancia != null ? fragrancia.hashCode() : 0);
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
        CuidadosPessoais outroCuidado = (CuidadosPessoais) o;
        // Compara o atributo 
        if(this.validade == outroCuidado.validade && this.fragrancia.equals(outroCuidado.fragrancia)){
            return true;
        }else{
            return false;
        }
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

