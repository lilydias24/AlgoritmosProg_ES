package estudantes.entidades;

public class CuidadosPessoais extends Produto {
    // Atributos da classe 
    private long validade;
    private String fragrancia;

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
        CuidadosPessoais outroCuidado = (CuidadosPessoais) outro;
        // Compara o atributo 
        if(this.validade == outroCuidado.validade && this.fragrancia.equals(outroCuidado.fragrancia)){
            return true;
        }else{
            return false;
        }
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

