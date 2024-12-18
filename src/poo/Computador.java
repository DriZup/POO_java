package poo;

public abstract  class Computador {

    private String marca;
    private String modelo;

    //construtor com parametros
    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo concreto
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public abstract void configurarComputador();

}
