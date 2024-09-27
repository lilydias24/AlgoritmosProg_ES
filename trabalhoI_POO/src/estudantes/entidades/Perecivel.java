package trabalhoI_POO.src.estudantes.entidades;

public class Perecivel extends Alimenticio {

    // Construtor da classe Perecivel que chama o construtor da classe Alimenticio
    public Perecivel(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso, validade);
    }

    // Não é necessário sobrescrever os métodos getters, hashCode e equals
    // pois a classe Alimenticio já os fornece

    @Override
    public String toString() {
        return "Perecível: " + super.toString();
    }

    // hashCode e equals já herdados de Alimenticio, podem ser mantidos.
}

