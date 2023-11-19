package veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando uma moto");
    }

    @Override
    public void frear() {
        System.out.println("Freando uma moto");
    }
}
