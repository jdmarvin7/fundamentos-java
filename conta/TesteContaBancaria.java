package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumero("12345678");
        conta.setTitular("Marvin");;
        
        conta.depositar(500.10);
        conta.sacar(300 );
    }
}
