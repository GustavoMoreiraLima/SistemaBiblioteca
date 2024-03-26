public class Usuario {
    String nome;
    String endereco;
    String contato;
    String cpf;

    public Usuario(String nome, String endereco, String contato, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void atualizarContato(String info, String atualizacao){
        if (info == "nome"){
            this.nome = atualizacao;
        } else if (info == "endereco"){
            this.endereco = atualizacao;
        } else if (info == "contato"){
            this.contato = atualizacao;
        } else if (info == "cpf"){
            this.cpf = atualizacao;
        }
    }
}