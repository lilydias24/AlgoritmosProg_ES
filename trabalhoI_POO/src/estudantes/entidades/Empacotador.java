package estudantes.entidades;

import professor.entidades.Caixa;
import professor.entidades.Fiscal;

/**
 * Classe que traz a lógica do algoritmo de "ensacolamento" dos produtos.
 * <br><br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento empacotamento de produtos, 
 * mas esses <strong>atributos e métodos devem ser todos privados</strong>. 
 * O único método público deve ser "agir".
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
public class Empacotador {
    
    public int proximoCaixa = 1; //usada para saber para onde o empacotador deve ir
    
    /**
     * Executa a lógica de empacotamento e troca de caixa.
     * Esse método é o único método de controle invocado durante a simulação 
     * do supermercado.
     * <br><br>
     * Aqui podem ser feitas todas as verificações sobre os produtos no monte e
     * nas sacolas do caixa em que o empacotador está. A partir dessas informações,
     * você pode colocar produtos do monte daquele caixa em sacolas e despachar
     * sacolas para o fiscal.
     * <br><br>
     * O atributo "proximoCaixa" é usado pelo simulador para mover o empacotador
     * para outro caixa (ou permanecer no mesmo se ele quiser), ou seja, o
     * empacotador sempre vai para o caixa do número indicado nesse atributo 
     * após um ciclo de simulação.
     * <br><br>
     * <strong>O empacotador não pode levar produtos com ele</strong> de um  
     * caixa para outro, ou seja, você não deve criar atributos com vetores, 
     * matrizes ou coleções (ArrayList, HashSet etc.) de produtos.
     * @param caixa o caixa onde está o empacotador
     * @param fiscal fiscal que pode ser consultado sobre as sacolas despachadas
     */

    // Instruções : 
    // acomodar todas as compras, não extrapole o peso de cada sacola, otimize o uso das sacolas 
    // e respeite as regras de dispensa de produtos do supermercado.
    // atender simultaneamente cinco caixas do supermercado, pegando produtos de um monte e colocando em sacolas. 
    // pegar um produto de um monte do caixa (não está em ordem) e colocar em uma sacola aberta naquele caixa
    // dispensar uma sacola para o fiscal transportar para o caminhão, liberando o espaço 
    // para uma nova sacola vazia naquele caixa que será reposta apenas quando ele trocar de caixa.
    // produtos dos montes repostos apenas quando todos os caixas estiverem sem produtos nos montes.
    // produtos de cuidados pessoais não podem ser colocados com produtos alimentícios/perecivel/nãoPerecivel/Refrigerado.
    // produtos de limpeza não podem dividir a sacola com produtos alimentícios/perecivel/nãoPerecivel/Refrigerado, eletroeletrônicos ou cuidados pessoais/higiente/cosmeticos. 
    // produtos refrigerados só podem ser colocados junto de outros produtos refrigerados (+-15 graus de diferença)
    // Cada caixa do supermercado pode manter até cinco sacolas abertas para colocação de compras pelo empacotador.
    // cada sacola suporta, no máximo, 5 quilos (5000 gramas) de produtos. 
    // Colocar peso acima do limite faz com que a sacola rasgue, a sacola é imediatamente substituída por outra vazia.
    // É esperado que nenhuma sacola seja dispensada com menos de 1 quilo (1000 gramas) de produtos dentro.  

    public void agir(Caixa caixa, Fiscal fiscal){
        
    }
    
}
