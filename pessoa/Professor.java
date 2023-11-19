package pessoa;

public class Professor extends Pessoa {
    
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    String imprimirDadosPessoa() {
        super.imprimirDadosPessoa();
        return "Você  é professor";
    }
}
