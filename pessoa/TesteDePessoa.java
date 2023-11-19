package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ivanildo");
        pessoa.setIdade(21);
        pessoa.setCpf("80078918903");

        System.out.println(pessoa.imprimirDadosPessoa());

        Professor professor1 = new Professor();
        professor1.setCpf("80078918903");
        professor1.setIdade(19);
        professor1.setNome("Marcos");
        professor1.setSalario(2000);
    }
}
