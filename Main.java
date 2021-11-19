package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code her
        Scanner nomeArquivo = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo: (.txt)");
        String arquivoComTxt = nomeArquivo.nextLine();

        pesquisarArquivo(arquivoComTxt);



    }

    public static ArrayList<String> pesquisarArquivo(String arquivoComTxt) {
        try {
            ArrayList<String> dadosColetados = new ArrayList<>();
            String dadosColetadosPorLinha = null;

            File documentoTxt = new File(arquivoComTxt);
            Scanner leituraDeArquivo = new Scanner(documentoTxt);

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
