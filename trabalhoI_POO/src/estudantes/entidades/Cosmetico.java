package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como de Cosmético, uma extensão da classe Cuidados Pessoais.
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

public class Cosmetico extends CuidadosPessoais {
    // Atributos da classe 
    private char tipoDePele;

    /**
     * Método construtor de Cosmético, utiliza o construtor da classe CuidadosPessoais.
     *
     * @param codigo O código do produto, herdado da classe CuidadosPessoais.
     * @param nome O nome do produto, herdado da classe CuidadosPessoais.
     * @param fabricante O fabricante do produto, herdado da classe CuidadosPessoais.
     * @param peso O peso do produto, herdado da classe CuidadosPessoais.
     * @param validade A validade do produto, herdada da classe CuidadosPessoais.
     * @param fragrancia A fragrancia do produto, herdada da classe CuidadosPessoais.
     * @param tipoDePele O tipo de pele do produto, pertencente a classe Cosmetico.
     */
    // Construtor de Cosmetico que chama o construtor da classe CuidadosPessoais
    public Cosmetico(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia, char tipoDePele) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);
        this.tipoDePele = tipoDePele;
    }

    // Getters para acessar atributos privados
    public char getTipoDePele() {
        return tipoDePele;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return super.toString() + ", tipoDePele: " + tipoDePele;
    }

    // Método hashCode para registro em INT
    @Override
    public int hashCode() {
        int result = super.hashCode(); // Chama o hashCode da superclasse Produto
        result = 31 * result + (int) tipoDePele; // Adiciona tipoDePele ao cálculo de hashCode
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
        Cosmetico outroCosmetico = (Cosmetico) o;
        // Compara o atributo 
        if(this.tipoDePele == outroCosmetico.tipoDePele){
            return true;
        }else{
            return false;
        }
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

