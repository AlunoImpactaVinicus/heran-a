public class Moto extends Veiculos{
    public Moto(String cor, String marca, String modelo, int ano){
        super(cor, marca,modelo,ano);
    }
    @Override
    public void mover(){
        System.out.println(modelo + " está se movendo");
    }
}