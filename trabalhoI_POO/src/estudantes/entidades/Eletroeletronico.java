package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Eletroeletronico, uma extensão da classe Produto.
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

public class Eletroeletronico extends Produto {
    // Atributos da classe 
    private short tensao;

    /**
     * Método construtor de Eletroeletronico, utiliza o construtor da classe Produto.
     *
     * @param codigo O código do produto, herdado da classe Produto.
     * @param nome O nome do produto, herdado da classe Produto.
     * @param fabricante O fabricante do produto, herdado da classe Produto.
     * @param peso O peso do produto, herdado da classe Produto.
     * @param tensao A tensao do produto, pertencente a classe Eletroeletronico.
     */
    // Construtor de Eletroeletronico que chama o construtor da classe Produto
    public Eletroeletronico(int codigo, String nome, String fabricante, int peso, short tensao) {
        super(codigo, nome, fabricante, peso);
        this.tensao = tensao;
    }

    // Getter para acessar atributos privados
    public long getTensao() {
        return tensao;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return super.toString() + ", tensao: " + tensao;
    }

    // Método hashCode para registro em INT
    @Override
    public int hashCode() {
        int result = super.hashCode(); // Chama o hashCode da superclasse Produto
        result = 31 * result + Long.hashCode(tensao); // Adiciona tensao ao cálculo do hash
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
        Eletroeletronico outroEletro = (Eletroeletronico) o;
        // Compara o atributo 
        return tensao == outroEletro.tensao;
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

