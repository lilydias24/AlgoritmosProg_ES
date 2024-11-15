/**
* @author Luiza Figueiredo luizavelasque.aluno@unipampa.edu.br
* @author Emilly Dias emillydias.aluno@unipampa.edu.br
 * @author Douglas Siqueira douglasisrael.aluno@unipampa.edu.br
 * @author Eduardo eduardodf.aluno@unipampa.edu
 * @author Laura Manuela Davi de Carvalho lauracarvalho.aluno@unipampa.edu.br
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teclado {
    // Mapeamento do teclado
    private static final Map<Character, String> mapeamento = new HashMap<>();
    static {
        mapeamento.put('0', " ");
        mapeamento.put('2', "ABC");
        mapeamento.put('3', "DEF");
        mapeamento.put('4', "GHI");
        mapeamento.put('5', "JKL");
        mapeamento.put('6', "MNO");
        mapeamento.put('7', "PQRS");
        mapeamento.put('8', "TUV");
        mapeamento.put('9', "WXYZ");
        mapeamento.put('*', "SHIFT");
        mapeamento.put('#', ".!?");
    }

    private boolean shift = false; 
    private String protocolo; 

    public Teclado(String protocolo) {
        this.protocolo = protocolo;
    }

   
    public String textoParaTecla(String mensagem) {
        StringBuilder resultado = new StringBuilder();
        char ultimaTeclaUsada = '\0';

        for (char c : mensagem.toCharArray()) {
        
            if (Character.isUpperCase(c) && !shift) {
                resultado.append("*");
                shift = true;
            } else if (Character.isLowerCase(c) && shift) {
                resultado.append("*");
                shift = false;
            }

            for (Map.Entry<Character, String> entry : mapeamento.entrySet()) {
                int posicao = entry.getValue().indexOf(Character.toUpperCase(c));
                if (posicao != -1) {
                    char teclaAtual = entry.getKey();
                    
                    if (teclaAtual == ultimaTeclaUsada) {
                        resultado.append("_");
                    }

                    resultado.append(String.valueOf(teclaAtual).repeat(posicao + 1));
                    
                    ultimaTeclaUsada = teclaAtual;
                    break;
                }
            }

            if (".!?".indexOf(c) != -1) {
                resultado.append("#");
                ultimaTeclaUsada = '#'; 
            }
        }
        return resultado.toString();
    }

    public String teclaParaTexto(String sequencia) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;

        while (i < sequencia.length()) {
            char tecla = sequencia.charAt(i);

            if (tecla == '*') {
                shift = !shift;
                i++;
                continue;
            } else if (tecla == '#') {
                resultado.append(mapeamento.get('#').charAt(0));
                i++;
                continue;
            }

            int repete = 1;
            while (i + 1 < sequencia.length() && sequencia.charAt(i + 1) == tecla) {
                repete++;
                i++;
            }

            String letras = mapeamento.get(tecla);
            if (letras != null && repete <= letras.length()) {
                char letra = letras.charAt(repete - 1);
                resultado.append(shift ? Character.toUpperCase(letra) : Character.toLowerCase(letra));
            }
            i++;
        }
        return resultado.toString();
    }

    public String[] dividirMensagem(String mensagem) {
        int limite = protocolo.equalsIgnoreCase("GSM") ? 255 : 160;
        int partes = (int) Math.ceil((double) mensagem.length() / limite);
        String[] mensagensDivididas = new String[partes];

        for (int i = 0; i < partes; i++) {
            int inicio = i * limite;
            int fim = Math.min(inicio + limite, mensagem.length());
            mensagensDivididas[i] = mensagem.substring(inicio, fim);
        }

        return mensagensDivididas;
    }
    public String textoParaTeclaCDMA(String mensagem) {
        StringBuilder resultado = new StringBuilder();
        char ultimaTeclaUsada = '\0';
    
        for (char c : mensagem.toCharArray()) {
            if (Character.isUpperCase(c) && !shift) {
                resultado.append("*");
                shift = true;
            } else if (Character.isLowerCase(c) && shift) {
                resultado.append("*");
                shift = false;
            }
    
            for (Map.Entry<Character, String> entry : mapeamento.entrySet()) {
                int posicao = entry.getValue().indexOf(Character.toUpperCase(c));
                if (posicao != -1) {
                    char teclaAtual = entry.getKey();
                    
                    if (teclaAtual == ultimaTeclaUsada) {
                        resultado.append("-"); 
                    }
    
                    resultado.append(String.valueOf(teclaAtual).repeat(posicao + 1));
                    
                    ultimaTeclaUsada = teclaAtual;
                    break;
                }
            }
    
            if (".!?".indexOf(c) != -1) {
                resultado.append("#");
                ultimaTeclaUsada = '#';
            }
        }
        return resultado.toString();
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensagem;
        System.out.print("Informe uma palavra: ");
        mensagem = sc.nextLine();

        System.out.print("Informe o protocolo (GSM ou CDMA): ");
        String protocolo = sc.nextLine();

        Teclado teclado = new Teclado(protocolo);
        String sequenciaTeclas;

        if (protocolo.equalsIgnoreCase("CDMA")) {
            sequenciaTeclas = teclado.textoParaTeclaCDMA(mensagem);
        } else {
            sequenciaTeclas = teclado.textoParaTecla(mensagem);
        }

        System.out.println("Sequência de teclas: " + sequenciaTeclas);

        String mensagemConvertida = teclado.teclaParaTexto(sequenciaTeclas);
        System.out.println("Mensagem convertida: " + mensagemConvertida);

        String[] mensagensDivididas = teclado.dividirMensagem(mensagem);
        System.out.println("Mensagens divididas (" + protocolo.toUpperCase() + "):");
        for (String parte : mensagensDivididas) {
            System.out.println(parte);
        }

        sc.close();
    }
}