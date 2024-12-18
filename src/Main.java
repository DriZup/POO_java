import poo.Computador;
import poo.Desktop;
import poo.Notebook;

public class Main {
    public static void main(String[] args) {


        Computador desktop = new Desktop("Dell", "xxxxx", false);
        desktop.exibirDetalhes();
        desktop.configurarComputador();

        System.out.println();

        Computador notebook = new Notebook("MAC", "11111", 0.9);
        notebook.exibirDetalhes();
        notebook.configurarComputador();

        System.out.println();
    }
}
