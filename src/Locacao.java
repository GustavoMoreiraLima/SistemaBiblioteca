import java.util.ArrayList;

public class Locacao {
    Usuario usuario;
    ArrayList<Livros> livros;
    public Locacao(Usuario usuario){
        this.usuario = usuario;
        livros = new ArrayList<Livros>();
    }
    public void addLivros(Livros livro){
        livros.add(livro);
    }
    public void mostrarLivros(){
        System.out.println("O usuario: " + usuario.getNome());
        System.out.println("Possui: ");
        for (int x = 0; x < livros.size(); x++){
            System.out.println(livros.get(x).getNome());
        }
    }
}
