public class Cliente  {
    //Atributos de Armazenamento
    private String nome;
    private int idade;
    private String cpf;
    private String email;

    public Cliente(){}
    public Cliente(String nome, int idade, String cpf, String email){this.nome=nome; this.idade=idade; this.cpf=cpf; this.email=email;}
    public void setNome (String nome) {this.nome=nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setEmail(String email) {this.email = email;}

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}