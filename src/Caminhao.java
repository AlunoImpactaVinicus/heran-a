public class Caminhao extends Veiculos{
    public Caminhao(String cor, String marca, String modelo, int ano){
        super(cor, marca,modelo,ano);
    }
    @Override
    public void mover(){
        System.out.println(modelo + " está se movendo");
    }
}