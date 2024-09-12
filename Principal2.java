/* public class Principal {
    public static void main( ){
        Cachorro meuDog;
        meuDog= newCachorro( );
        meuDog.nome= "Teobaldo";
        meuDog.raca= "vira-lata caramelo";
        meuDog.idade= 13;
        meuDog.botas= false;
        meuDog.latir( ); //mostra: Auau!
    }
} */

/*
  public class Cachorro{
    public String nome;
    public String raca;
    public int idade;
    public boolean botas;
    public void latir( ){
    System.out.println("Auau!");
    }
} */

/*
  public class Pessoa{
    public String nome;
    public int idade;
    
    public Pessoa( String nome, int idade ){
        this.nome = nome;
        this.idade = idade;
    }
} */

// Uso do construtor explícito
/* 
public class Pessoa{
    public String nome;
    public int idade;
    public Pessoa( String nome, int idade ){
        this.nome = nome;
        this.idade = idade;
    }
}

public class Principal{
    public static void main( ){
        Pessoa p = new Pessoa( "Jean", 21 );
    }
}
*/

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