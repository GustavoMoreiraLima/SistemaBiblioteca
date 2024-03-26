public class Funcionario extends Usuario{
    String departamento;
    String funcao;
    public Funcionario(String nome, String endereco, String contato, String cpf, String departamento, String funcao) {
        super(nome, endereco, contato, cpf);
    }
}
