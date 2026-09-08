import java.swing.JOpationPane;

public class Principal{
    public static void main(String[]args){

    String [] nomes = new String[5];
    int[] senhas = new int[5];

    int opcao = 0;
    int contador = 0;

    do{
        String input = JOpationPane(

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
        opcao = Integer.parseInt(input);

        switch(opcao){
            case 1:
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
            case 2:
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
            case 3:
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
            case 4:
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Programa finalizado!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha um opção  valida!");
        }
    }while (opcao != 7);

    int controleNome = 0;
    int controleSenha = 0;
        if (controleNome == nomes[0]){

        }
    
    }
}