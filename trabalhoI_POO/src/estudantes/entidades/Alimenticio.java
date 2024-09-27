package trabalhoI_POO.src.estudantes.entidades;

public class Alimenticio extends Produto {
    // Atributos da classe 
    private long validade;

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
    public boolean equals(Object outro) {
        // Verifica se o objeto passado é nulo ou de outra classe
        if (outro == null) {
            return false;
        }
        // Verifica se é igual ao próprio objeto
        if (this == outro) {
            return true;
        }
        // Objetos de classes diferentes nunca são iguais
        if(this.getClass() != outro.getClass()){
            return false;
        }
        // Chama o equals da superclasse Produto
        if (!super.equals(outro)) {
            return false;
        }
        // Conversão explícita para acessar os atributos do outro objeto
        Alimenticio outroAlimenticio = (Alimenticio) outro;
        // Compara o atributo =
        return validade == outroAlimenticio.validade;
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

