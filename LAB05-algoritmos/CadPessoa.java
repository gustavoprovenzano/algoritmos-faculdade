/*
1 Ler Nome, email e RG
2 Exibir tudo lado a lado
3 classificar por nome usando Selection Sort
4 classificar por nome usando Insert Sort
5 Classificar por RG usando Selection Sort
6 Classificar por RG usando Insert Sort
7 Buscar um RG usando busca binÃ¡ria
8 buscar um nome usando busca binÃ¡ria
9 finalizar programa. 
 */

import javax.swing.JOptionPane;



      public class CadPessoa {

        public int n = 5;
        public Pessoa[] lista = new Pessoa[n]; // nossa lista de pessoas
        public int pos = -1;

        public CadPessoa() {
        }

        public void ler() {
            if (pos == n - 1) {
                return;
            }
            pos++;
            this.lista[pos] = new Pessoa();

            this.lista[pos].nome = JOptionPane.showInputDialog(null, "Digite o nome:");
            this.lista[pos].email = JOptionPane.showInputDialog(null, "Digite o Email:");
            this.lista[pos].rg = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite o RG")
            );
        }

        public void listar() {
            String saida = "";
            for (int i = 0; i <= pos; i++) {
                saida += lista[i].nome + " - " + lista[i].email + " - " + lista[i].rg + "\n";
            }
            JOptionPane.showMessageDialog(null, saida);
        }

        public void nomeSelectionSort() {

            for (int i = 0; i <= pos; i++) {
                int indiceMenor = i;
                for (int j = i + 1; j <= pos; j++) {
                    if (lista[j].nome.compareToIgnoreCase(lista[indiceMenor].nome) < 0) {
                    }
                }
                if (indiceMenor != i) {
                    Pessoa auxiliar = lista[i];
                    lista[i] = lista[indiceMenor];
                    lista[indiceMenor] = auxiliar;
                }

            }
        }


        public void nomeInsertSort(){

            for(int i = 1; i<=pos;i++){
                Pessoa posicao = lista[i];
                int j = i - 1;
                    while(j >= 0 && lista[j].nome.compareToIgnoreCase(posicao.nome) > 0){
                        lista[j+1] = lista[j];
                        j--;
            }

            lista[j+1] = posicao;
        }

    }

        public void RGSelectionSort(){
            for(int i = 0; i <= pos;i++){
                int indiceMenor = i;
                for(int j = i +1;j<= pos;j++){
                    if(lista[j].rg < lista[indiceMenor].rg){
                        indiceMenor = j;
                        }      
                    }
                if (indiceMenor != j){
                    Pessoa auxiliar = lista[i];
                    lista[i] = lista[indiceMenor];
                    lista[indiceMenor] = auxiliar;
                }

            }

        }

        public void RGInsertSort(){
            for(int i = 1; i<=pos;i++){
                Pessoa posicao = lista[i];
                int j = i-1;
                while(j>=0 && lista[j].rg > posicao.rg){
                        lista[j+1] = lista[j];
                        j--;
                }
            }
        }



    public void menu() {
        String menu_ = "*** Menu de Controle da Estrutura ***\n1 Ler dados \r\n"
                + //
                "2 Listar \r\n"
                + //
                "3 classificar por nome usando Selection Sort\r\n"
                + //nomeSelectionSort
                "4 classificar por nome usando Insert Sort\r\n"
                + //nomeInsertSort
                "5 Classificar por RG usando Selection Sort\r\n"
                + //RGSelectionSort
                "6 Classificar por RG usando Insert Sort\r\n"
                + //
                "7 Buscar um RG usando busca binÃ¡ria\r\n"
                + //
                "8 buscar um nome usando busca binÃ¡ria\r\n"
                + //
                "9 finalizar programa. ";
        do {
            String item = JOptionPane.showInputDialog(null, menu_);

            switch (item) {
                case "1":
                    ler();
                    break;
                case "2":
                    listar();
                    break;
                case "3":
                    nomeSelectionSort();
                    break;
                case "4":
                    nomeInsertSort();
                    break;
                case "9":
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OpÃ§Ã£o InvÃ¡lida!");
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        CadPessoa cad1 = new CadPessoa();
        cad1.menu();
    }
}
