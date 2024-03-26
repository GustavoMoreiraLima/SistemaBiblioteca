public class Main {
    public static void main(String[] args) {
        Livros l1 = new Livros("The Walking Dead", "Ação e Terror");
        Livros l2 = new Livros("The Chronicles of Narnia", "Fantasia, Aventura");
        Aluno u1 = new Aluno("Pedrinho", "Senador Canedo", "99999-9999","777777777-77","I.A", "5249893121");
        Locacao loc1 = new Locacao(u1);
        loc1.addLivros(l1);
        loc1.addLivros(l2);
        loc1.mostrarLivros();

        System.out.println("\n---- OUTRO CLIENTE ----\n");

        Livros l3 = new Livros("1984", "Ficção científica e política");
        Professor p1 = new Professor("Cleiton", "Goiânia", "99999-9999", "999999999-99","D1", "Ensinar", "Programação");
        Locacao loc2 = new Locacao(p1);
        loc2.addLivros(l3);
        loc2.mostrarLivros();
    }
}