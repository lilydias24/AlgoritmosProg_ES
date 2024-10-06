package estudantes.entidades;

/**
 * Classe que define um produto no supermercado.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) ter um JavaDoc útil e completo.
 * <br><br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
public class Produto {
    // Atributos da classe produto
    private int codigo;
    private String nome;
    private String fabricante;
    private int peso;

    // Método construtor da classe produto
    public Produto(int codigo, String nome, String fabricante, int peso){
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.peso = peso;
    }

    // Getters para acessar atributos privados
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public int getPeso() {
        return peso;
    }

    // Método toString para armazenamento dos dados em String
    @Override
    public String toString() {
        return "Produto{" + "Codigo:" + codigo + ", Nome:'" + nome + '\'' +
                ", Fabricante:" + fabricante + ", Peso:" + peso +'}';
    }
        
    // Método hashCode para registro do produto em INT
    @Override
    public int hashCode() {
        int result = Integer.hashCode(codigo);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (fabricante != null ? fabricante.hashCode() : 0);
        result = 31 * result + Integer.hashCode(peso);
        return result;
    }

    // Método equals para comparação da estrutura dos objetos
    @Override
    public boolean equals(Object o){
        // Qualquer coisa é diferente de NULL
        if(o == null){
            return false;
        }
        // Propriedade REFLEXIVA
        if(this == o){
            return true;
        }
        // Objetos de classes diferentes nunca são iguais
        if(this.getClass() != o.getClass()){
            return false;
        }
        // Conversão explícita para acessar os atributos do outro objeto
        Produto outroProd = (Produto) o;
        // Verifica se todos os atributos são iguais
        // Atributos do tipo String comparados com equals e do tipo int com == (tipo primitivo)
        if(this.codigo == outroProd.codigo &&
                this.nome.equals(outroProd.nome) &&
                this.fabricante.equals(outroProd.fabricante) &&
                this.peso == outroProd.peso){
            return true;
        }else{
            return false;
        }
    }
}

//  * 4) ter um JavaDoc útil e completo. PENDENTE

