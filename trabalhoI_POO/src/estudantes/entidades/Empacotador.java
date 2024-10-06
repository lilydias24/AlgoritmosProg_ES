package estudantes.entidades;

import professor.entidades.Caixa;
import professor.entidades.Fiscal;
import professor.entidades.Sacola;

/**
 * Classe que implementa a lógica do algoritmo de "ensacolamento" dos produtos.
 * 
 * @author Emilly e Eric
 * @version 2.0
 * @since 2024
 */
public class Empacotador {

    /**
     * Define o caixa em que o empacotador deve empacotar produtos.
     */
    public int proximoCaixa = 1; // Usada para saber para onde o empacotador deve ir

    /**
     * Verifica se o produto respeita as regras de compatibilidade e limite de peso para que seja adicionado a sacola.
     *
     * @param sacola A sacola onde o produto será adicionado.
     * @param novoProduto O produto que será adicionado à sacola.
     * @return {@code true} se o produto foi adicionado com sucesso, {@code false} caso contrário.
     */
    // Verifica se o produto pode ser adicionado à sacola respeitando as regras
    private boolean AdicionarProduto(Sacola sacola, Produto novoProduto) {
        Produto[] produtosNaSacola = sacola.getArrayDaSacola();

        for (Produto produtoExistente : produtosNaSacola) {
            // Verificação de incompatibilidade de tipos de produtos
            if (produtoExistente instanceof Alimenticio) {
                if (novoProduto instanceof CuidadosPessoais) {
                    return false; // Produtos de cuidados pessoais não podem ser adicionados com alimentos
                }
                if (novoProduto instanceof Limpeza) {
                    return false; // Produtos de limpeza não podem ser adicionados com alimentos
                }
            }

            if (produtoExistente instanceof CuidadosPessoais) {
                if (novoProduto instanceof Alimenticio) {
                    return false; // Alimentos não podem ser adicionados com produtos de cuidados pessoais
                }
                if (novoProduto instanceof Limpeza) {
                    return false; // Produtos de limpeza não podem ser adicionados com produtos de cuidados pessoais
                }
            }

            if (produtoExistente instanceof Limpeza) {
                if (novoProduto instanceof Alimenticio || novoProduto instanceof CuidadosPessoais) {
                    return false; // Produtos de limpeza não podem ser misturados com alimentos ou cuidados pessoais
                }
            }

            // Verificação de temperatura para produtos refrigerados
            if (produtoExistente instanceof Refrigerado && novoProduto instanceof Refrigerado) {
                Refrigerado novoRefrigerado = (Refrigerado) novoProduto;
                Refrigerado existenteRefrigerado = (Refrigerado) produtoExistente;
                if (Math.abs(novoRefrigerado.getTemperaturaIdeal() - existenteRefrigerado.getTemperaturaIdeal()) > 15) {
                    return false; // Diferença de temperatura entre refrigerados maior que 15 graus
                }
            }
        }

        // Verifica se o produto excede o peso máximo da sacola (5000g)
        int pesoAtual = 0;
        for (Produto p : produtosNaSacola) {
            pesoAtual += p.getPeso();
        }
        if (pesoAtual + novoProduto.getPeso() > 5000) {
            return false; // Excede o limite de peso da sacola
        }

        return true; // Produto pode ser adicionado à sacola
    }

    // Método privado para escolher uma sacola disponível ou abrir uma nova, se necessário
    private Sacola escolherOuCriarSacola(Sacola[] sacolas, Produto produto) {
        for (Sacola sacola : sacolas) {
            if (sacola != null && AdicionarProduto(sacola, produto)) {
                return sacola; // Encontrou uma sacola válida
            }
        }
        // Se não encontrar uma sacola válida, retornamos null (não há sacolas disponíveis)

        return null;
    }

    /**
     * Executa a lógica de empacotamento e troca de caixa.
     * 
     * @param caixa o caixa onde está o empacotador
     * @param fiscal fiscal que pode ser consultado sobre as sacolas despachadas
     */
    public void agir(Caixa caixa, Fiscal fiscal) {
        // Obter sacolas abertas
        Sacola[] sacolasAbertas = new Sacola[Caixa.QUANTIDADE_DE_SACOLAS_NO_CAIXA];
        for (int i = 1; i <= Caixa.QUANTIDADE_DE_SACOLAS_NO_CAIXA; i++) {
            sacolasAbertas[i - 1] = caixa.getSacola(i);
        }

        // Processar os produtos do monte
        Produto[] produtosNoMonte = caixa.getArrayDoMonte();
        for (Produto produto : produtosNoMonte) {
            Sacola sacola = escolherOuCriarSacola(sacolasAbertas, produto);
            if (sacola != null) {
                caixa.pegarProdutoDoMonte(produto); // Remove o produto do monte
                sacola.colocarProdutoNaSacola(produto); // Adiciona o produto à sacola
            }
        }

        // Despachar sacolas que atingem os critérios
        for (int i = 1; i <= Caixa.QUANTIDADE_DE_SACOLAS_NO_CAIXA; i++) {
            Sacola sacola = caixa.getSacola(i);
            if (sacola != null) {
                int pesoTotal = 0;
                for (Produto p : sacola.getArrayDaSacola()) {
                    pesoTotal += p.getPeso();
                }
                // Apenas despachar sacolas com pelo menos 1kg e até 5kg
                if (pesoTotal >= 1000 && pesoTotal <= 5000) { 
                    caixa.despacharSacola(i); // Despacha a sacola para o fiscal
                }
            }
        }

        // Repor sacolas após o despacho
        caixa.reporSacolas();

        // Definir o próximo caixa a atender
        proximoCaixa = calcularProximoCaixa();
    }

    // Método para calcular o próximo caixa a ser atendido
    private int calcularProximoCaixa() {
        // Simplesmente ir para o próximo caixa em sequência
        return (proximoCaixa % 5) + 1;
    }
}

