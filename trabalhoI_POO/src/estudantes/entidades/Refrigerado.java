package estudantes.entidades;

public class Refrigerado extends Perecivel {
    // Atributos da classe
    private int temperaturaIdeal;

    // Construtor da classe Refrigerado que chama o construtor da classe Alimenticio
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
