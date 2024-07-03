import java.io.*;
import java.nio.charset.StandardCharsets;

public class Arquivo {

    public static void main(String[] args) {
        String conteudo = "";
        String[] recuperados = null;

        //exemplo com texto
        String[] alunos = new String[4];
        alunos[0] = "Alan Turing";
        alunos[1] = "Ada Lovelace";
        alunos[2] = "John von Neumann";
        alunos[3] = "Emmy";

        //colocando a quantidade de linhas de texto que iremos armazenar
        conteudo = alunos.length + "\n";
        //colocando os alunos
        for (int i = 0; i < alunos.length; i++) {
            conteudo += alunos[i] + "\n";
        }

        //gravando
        try {
            Arquivo.gravarTexto(conteudo, "alunos.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //lendo
        try {
            recuperados = Arquivo.lerTexto("alunos.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //mostrando os lidos
        for (int i = 0; i < recuperados.length; i++) {
            System.out.println(recuperados[i]);
        }
    }

    public static void gravarTexto(String conteudo, String nomeArquivo) throws Exception {
        //abre o arquivo para escrita
        File arquivo = new File(nomeArquivo);
        FileWriter saida = new FileWriter(arquivo, StandardCharsets.UTF_8);
        BufferedWriter bufferDeSaida = new BufferedWriter(saida);

        //escreve no arquivo
        bufferDeSaida.write(conteudo);

        // fecha os streams
        bufferDeSaida.close();
        saida.close();
    }

    public static String[] lerTexto(String nomeArquivo) throws Exception {
        // declaração das variáveis        
        String[] textos;
        String linhaLida;
        int quantidadeDeLinhas, numeroDaLinha = 0;
        
        //abre o arquivo para leitura
        File arquivo = new File(nomeArquivo);
        FileReader entrada = new FileReader(arquivo, StandardCharsets.UTF_8);
        BufferedReader bufferDeEntrada = new BufferedReader(entrada);

        //lê a primeira linha do arquivo (numero de linhas)
        linhaLida = bufferDeEntrada.readLine();
        quantidadeDeLinhas = Integer.parseInt(linhaLida);
        textos = new String[quantidadeDeLinhas + 1];
        textos[numeroDaLinha++] = linhaLida;

        //lê as demais linhas do arquivo
        do {
            linhaLida = bufferDeEntrada.readLine();
            if (linhaLida != null) {
                textos[numeroDaLinha++] = linhaLida;
            }
        } while (linhaLida != null);

        //fecha os streams
        bufferDeEntrada.close();
        entrada.close();
        return textos;
    }
    
    public static void gravarObjetos(Object obj, String nomeArquivo) throws Exception {
        ObjectOutputStream output;
        output = new ObjectOutputStream(new FileOutputStream(new File(nomeArquivo)));
        output.writeObject(obj);
        output.close();
    }
    
    public static Object lerObjetos(String nomeArquivo) throws Exception {
        Object obj;
        ObjectInputStream input;
        input = new ObjectInputStream(new FileInputStream(new File(nomeArquivo)));
        obj = input.readObject();
        input.close();
        return obj;
    }
    
}

