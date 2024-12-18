package poo;

public class Notebook extends Computador {

    private double peso;

    public Notebook(String marca, String modelo, double peso) {
        super(marca, modelo);
        this.peso = peso;

    }
    @Override
    public void configurarComputador() {
        System.out.println("Configurando computador");
        System.out.println("O peso do computador: " + peso);
    }
}
