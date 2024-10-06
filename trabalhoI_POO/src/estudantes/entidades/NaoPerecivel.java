package estudantes.entidades;

public class NaoPerecivel extends Alimenticio {
    // Atributos da classe Eletronico
    private String tipoDeArmazenamento;

    // Construtor de NaoPerecivel que chama o construtor da classe Produto
    public NaoPerecivel(int codigo, String nome, String fabricante, int peso, long validade, String tipoDeArmazenamento) {
        super(codigo, nome, fabricante, peso, validade);
        this.tipoDeArmazenamento = tipoDeArmazenamento;
    }

    // Getter para acessar atributos privados
    public String getTipoDeArmazenamento() {
        return tipoDeArmazenamento;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return super.toString() + ", tipoDeArmazenamento: " + tipoDeArmazenamento;
    }

    // Método hashCode para registro em INT
    @Override
    public int hashCode() {
        int result = super.hashCode(); // Chama o hashCode da superclasse Produto
        result = 31 * result + (tipoDeArmazenamento != null ? tipoDeArmazenamento.hashCode() : 0);
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
        // Chama o equals da superclasse Alimenticio
        if (!super.equals(o)) {
            return false;
        }
        // Conversão explícita para acessar os atributos do outro objeto
        NaoPerecivel outroNPerecivel= (NaoPerecivel) o;
        // Compara o atributo 
        if(this.tipoDeArmazenamento.equals(outroNPerecivel.tipoDeArmazenamento)){
            return true;
        }else{
            return false;
        }
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

