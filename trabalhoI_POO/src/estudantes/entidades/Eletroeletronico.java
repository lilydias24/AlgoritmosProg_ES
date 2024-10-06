package estudantes.entidades;

public class Eletroeletronico extends Produto {
    // Atributos da classe 
    private short tensao;

    // Construtor de Eletronico que chama o construtor da classe Produto
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

