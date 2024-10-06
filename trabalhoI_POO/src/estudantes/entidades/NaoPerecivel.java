package estudantes.entidades;

/**
 * Classe que define um produto no supermercado como Não perecível, extensão da classe Alimenticio.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo, <br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) ter um JavaDoc útil e completo.
 * <br><br>
 * 
 * @author Emilly e Eric
 * @version 1.0
 */

public class NaoPerecivel extends Alimenticio {
    // Atributos da classe 
    private String tipoDeArmazenamento;

    // Construtor de NaoPerecivel que chama o construtor da classe Alimenticio
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

