import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[]args){

    String [] nomes = new String[5];
    int[] senhas = new int[5];

    String opcao = "0";
    int contador = 0;

    do{
        String input = JOptionPane.showInputDialog(

        "--- MENU ---\n" +
        "1 - Ler nome e senha\n" +
        "2 - Listar nomes e senhas\n" +
        "3 - Buscar nome\n" +
        "4 - Buscar senha\n" +
        "5 - Classificar por nome (Bubble Sort)\n" +
        "6 - Classificar por senha (Bubble Sort)\n" +
        "7 - Finalizar\n\n" +
        "Escolha uma opção:"

        );

        if (input == null) {
            opcao = "7";
        } else {
            opcao = input;
        }

        switch(opcao){
            case "1":
                if (contador < 5){
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    nomes[contador] = nome;

                    String senhaInput = JOptionPane.showInputDialog("Digite a senha:");
                    int senha = Integer.parseInt(senhaInput);
                    senhas[contador] = senha;

                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "Limite de nomes e senhas atingido!");
                }
                break;
            case "2":
                if (contador > 0) {
                    String lista = "Nomes e Senhas:\n";
                    for (int i = 0; i < contador; i++) {
                        lista += "Nome: " + nomes[i] + ", Senha: " + senhas[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum nome e senha cadastrado!");
                }
                break;
            case "3":
                String nomeBusca = JOptionPane.showInputDialog("Digite o nome a ser buscado:");
                boolean encontrado = false;
                for (int i = 0; i < contador; i++) {
                    if (nomes[i].equals(nomeBusca)) {
                        JOptionPane.showMessageDialog(null, "Nome encontrado!\nPosição: " + i + "\nSenha: " + senhas[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Nome não encontrado!");
                }
                break;
            case "4":
                String senhaBusca = JOptionPane.showInputDialog("Digite a senha a ser buscada:");
                int senhaInt = Integer.parseInt(senhaBusca);
                encontrado = false;
                for (int i = 0; i < contador; i++) {
                    if (senhas[i] == senhaInt) {
                        JOptionPane.showMessageDialog(null, "Senha encontrada!\nPosição: " + i + "\nNome: " + nomes[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Senha não encontrada!");
                }
                break;
            case "5":
                if (contador > 0){
                    bubbleSort(nomes, senhas);
                    listarNomes(nomes, senhas, contador);
                    }
                break;
            case "6":
                if (contador > 0){
                    bubbleSort(nomes, senhas);
                    listarSenhas(nomes, senhas, contador);
                    }
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "Programa finalizado!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha um opção  valida!");
        }
    }while (opcao != 7);

    }

    public static void bubbleSort(String [] nomes, int [] senhas) {
        String auxNome;
        int auxSenha;
        boolean troca = true;
        int contador = nomes.length;
        while (troca){
            troca = false;
            for (int j=0; j<=contador-2; j++){
                if (nomes[j].compareToIgnoreCase(nomes[j+1]) > 0){
                    auxNome = nomes [j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = auxNome;
                    auxSenha = senhas[j];
                    senhas[j] = senhas[j+1];
                    senhas[j+1] = auxSenha;
                    troca= true;
                }
            }
        }
    }

    public static void listarNomes (String [] nomes, int [] senhas, int contador){
        String resultado = "-- NOMES CLASSIFICADOS --\n";
        for (int i = 0; i < contador; i++){
            resultado += nomes[i] + "\n";
           }
           JOptionPane.showMessageDialog(null, resultado);
        }


    public static void listarSenhas (String [] nomes, int [] senhas, int contador){
        String resultado = "-- Senhas CLASSIFICADOS --\n";
            for (int i = 0; i < contador; i++){
                resultado += senhas[i] + "\n";
               }
               JOptionPane.showMessageDialog(null, resultado);
            }
}