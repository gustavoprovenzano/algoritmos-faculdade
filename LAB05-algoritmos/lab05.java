import javax.swing.JOptionPane;

public class User {
    public String nome;
    public int senha;

    public User() {
    }

}

public class Busca {
    public int n;
    public User[] lista; // lista de usuarios ou vetor de usuários
    public int pos;

    public Busca(int n) {
        this.n = n;
        lista = new User[this.n];
        this.pos = -1;
    }

    public void newLinha(String usuario, int codigo) {
        if (this.pos == this.n - 1)
            return; // filtro para não estourar o vetor

        pos++; // pos = pos + 1
        lista[pos] = new User();
        lista[pos].nome = usuario;
        lista[pos].senha = codigo;
    }

    public void listar() {
        String saida = "";
        for (int i = 0; i <= pos; i++) {
            saida += lista[i].nome + " - " + lista[i].senha + "\n";
        }

        JOptionPane.showMessageDialog(null, saida);
    }

    public void bubblesort() {
    }

    public int buscaBinNome() {
        return -1;
    }

    public int buscaBinSenha() {
        return -1;
    }

    public static void main(String[] args) {

        String strn = JOptionPane.showInputDialog(null, "Qts Usuários:");
        Busca b1 = new Busca(Integer.parseInt(strn));

        while (true) {
            String stritem = JOptionPane.showInputDialog(null, "\n1 Inserir\n2 listar\n3 sair:");

            switch (stritem) {
                case "1":
                    String nome = JOptionPane.showInputDialog(null, "Nome:");
                    String strSenha = JOptionPane.showInputDialog(null, "Senha:");
                    b1.newLinha(nome, Integer.parseInt(strSenha));

                    break;

                case "2":
                    b1.listar();
                    break;

                case "3":
                    System.exit(0);
                    break;
            }
        }

    }
}