import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepositorioDePessoas repositorio = new PessoaCsvAdapter("pessoas.csv");
        List<Pessoa> pessoas = repositorio.listarPessoas();

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println("-----------------------");
        }
    }
}