package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code her
	    
	 // perguntar e receber nome do arquivo do usuário
        Scanner nomeArquivo = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo: (.txt)");
        String arquivoComTxt = nomeArquivo.nextLine();
	    
	// chamar método com nome do arquivo fornecido como parametro
        pesquisarArquivo(arquivoComTxt);



    }

    public static ArrayList<String> pesquisarArquivo(String arquivoComTxt) {
        try {
	    // inicializar ArrayList para salvar os dados e string para servir como buffer
	    // para reduzir workload da arraylist e tornar mais rápido.
		
            ArrayList<String> dadosColetados = new ArrayList<>();
            String dadosColetadosPorLinha = null;
	    
	    // com o parametro fornecido pelo user,
	    // um novo scanner irá ler o documento ( caso o caminho esteja errado,
	    // o programa criará um erro.
            File documentoTxt = new File(arquivoComTxt);
            Scanner leituraDeArquivo = new Scanner(documentoTxt);
		
	    // afim de numerar cada linha processada, iniciamos um contador para ser introduzido no começo de cada elemento da arraylist
            int numeroDeLinhas = 0;
            while (leituraDeArquivo.hasNextLine()) {
                dadosColetadosPorLinha = numeroDeLinhas + "; " + leituraDeArquivo.nextLine();
                dadosColetados.add(dadosColetadosPorLinha);
                numeroDeLinhas++;
            }
            leituraDeArquivo.close();

            return classificarDados(dadosColetados);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<String> classificarDados ( ArrayList<String> dadosColetados) {
        int quantidadeDeEntradas = dadosColetados.size();
        //Collections.sort(dadosColetados);
        for (String i : dadosColetados) {
            
        }
        System.out.println(dadosColetados);

        return null;
    }


    // abrir arquivo txt
    // transformar tudo em array list
    // separar em data/nome/local
    //
    }
