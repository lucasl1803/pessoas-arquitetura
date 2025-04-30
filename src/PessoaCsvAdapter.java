import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PessoaCsvAdapter implements RepositorioDePessoas {
    private String caminhoCsv;

    public PessoaCsvAdapter(String caminhoCsv) {
        this.caminhoCsv = caminhoCsv;
    }

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoCsv))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    String nome = dados[0].trim();
                    int idade = Integer.parseInt(dados[1].trim());
                    String email = dados[2].trim();
                    pessoas.add(new Pessoa(nome, idade, email));
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler CSV: " + e.getMessage());
        }

        return pessoas;
    }
}