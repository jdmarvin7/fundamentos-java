package execoes;

public class Execoes {
    // Checked exceptions


    // Unchecked exceptions

    public static void main(String[] args) {
        try {
            validarNumero();
        } catch(Exception err) {
            System.out.println(err);
        }
    }

    public static void validarNumero() throws Exception {
        int numero = 10;

        if (numero < 100) {
            throw new Exception("O numero é menor que 100");
        }
    }
}
