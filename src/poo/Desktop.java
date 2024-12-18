package poo;

public class Desktop extends Computador{

    private boolean temCabinete;




    public Desktop(String marca, String modelo,boolean temCabinete) {
        super(marca, modelo);
        this.temCabinete = temCabinete;
    }

    @Override
   public void configurarComputador() {
        System.out.println("Configurando computador...");
        if(temCabinete){
            System.out.println(" Incluindo Gabinete");
        }else{
            System.out.println("Nao tem Gabinete");
        }

    }

}
