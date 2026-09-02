import javax.swing.JOptionPane;

public class CadCliente {
    public static void main(String args[]) {

        String nome = JOptionPane.showInputDialog(null, "Digite o nome:");

        String cpfstr = JOptionPane.showInputDialog(null, "Digite o CPF:");

        String idadestr = JOptionPane.showInputDialog(null,"Digite a Idade:");
        int idade = Integer.parseInt(idadestr);

        String emailstr = JOptionPane.showInputDialog(null, "Digite o E-mail:");

        Cliente a2;
        a2 = new Cliente(nome, idade, cpfstr, emailstr);
        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
    }
}
