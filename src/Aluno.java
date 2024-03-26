public class Aluno extends Usuario{
    String curso;
    String matricula;
    String periodo;

    public Aluno(String nome, String endereco, String contato, String cpf, String curso, String matricula) {
        super(nome, endereco, contato, cpf);
    }
}
