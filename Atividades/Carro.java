package Atividades;

/* Propriedades do Equals : 
 * 1) Reflexiva 
 * a.equals(a) = true
 * 2) Simétrica 
 * a.equals(b) = e é true
 * b.equals(a) = é true
 * 3) Transitiva
 * x = y | y = z | x = z
 * 4) Consistente
 * a = b é true
 * tempo sem modificações em a e b
 * a = b é true
 * 5) Qualquer coisa é diferente de null
 * a.equals(null) = é false
 * 6) Se dois objetos são iguais pelo equals o #code deles deve ser igual
 */

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public String placa;
    
    @Override
    public boolean equals(Object outro){
        //qualquer coisa é diferente de NULL
        if(outro == null){
            return false;
        }
        //propriedade REFLEXIVA
        if(this == outro){
            return true;
        }
        //objetos de classes diferentes nunca são iguais
        if(this.getClass() != outro.getClass()){
            return false;
        }
        //conversão explícita para acessar os atributos do outro carro
        Carro outroCarro = (Carro) outro;
        //verifica se todos os atributos são iguais
        if(this.cor.equals(outroCarro.cor) &&
                this.marca.equals(outroCarro.marca) &&
                this.modelo.equals(outroCarro.modelo) &&
                this.placa.equals(outroCarro.placa)){
            return true;
        }else{
            return false;
        }
    }
}