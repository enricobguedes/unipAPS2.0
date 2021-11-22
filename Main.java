public class App {
        public static void main(String[] args) throws FileNotFoundException {
    
            
            // perguntar e receber nome do arquivo do usuário
            Scanner nomeArquivo = new Scanner(System.in);
            System.out.println("Entre com o nome do arquivo: (.txt)");
            String arquivoComTxt = nomeArquivo.nextLine();
            
            
            //perguntar e receber a maneira que quer que seja feito a ordenação
            Scanner escolherOrdenacao = new Scanner(System.in);
            System.out.println("Escreva: 1 para String e Collections Sort "
                    + "ou 2 para Stack");
            Integer codigo = Integer.parseInt(nomeArquivo.nextLine());

            escolherOrdenacao.close();
            nomeArquivo.close();
            
            // chamar método com nome do arquivo fornecido como parametro de acordo
            // com ordenação escolhida
            if (codigo == 1) {
                pesquisarArquivo(arquivoComTxt);
            } else {
                criarStack(arquivoComTxt);
            }
    
    
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
            Collections.sort(dadosColetados);
            System.out.println(dadosColetados);
    
            return null;
        }
        public static Stack<String> criarStack (String arquivoComTxt) {
            try {
                // inicializar Stack para salvar os dados e string para servir como buffer
                // para reduzir workload da Stack e tornar mais rápido.
            
                Stack<String> dadosColetados = new Stack<>();
                String dadosColetadosPorLinha = null;
            
                // com o parametro fornecido pelo user,
                // um novo scanner irá ler o documento ( caso o caminho esteja errado,
                // o programa criará um erro.
                File documentoTxt = new File(arquivoComTxt);
                Scanner leituraDeArquivo = new Scanner(documentoTxt);
            
                // afim de numerar cada linha processada, iniciamos um contador para ser introduzido no começo de cada elemento Stack
                int numeroDeLinhas = 0;
                while (leituraDeArquivo.hasNextLine()) {
                    dadosColetadosPorLinha = numeroDeLinhas + "; " + leituraDeArquivo.nextLine();
                    dadosColetados.push(dadosColetadosPorLinha);
                    numeroDeLinhas++;
                }
                leituraDeArquivo.close();
    
                return classificarStack(dadosColetados);
    
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado");
                e.printStackTrace();
            }
            return null;
        }
        
        //pop do stack hard-coded.
        public static Stack<String> classificarStack ( Stack<String> dadosColetados) {
            for (int i = 0 ; i < 1648; i++) {
                String popDadosColetados = dadosColetados.pop();
                System.out.println(popDadosColetados);
            }
            return null;
        }
    }
