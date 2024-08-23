public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Preto","Honda","Civic",2020);
        Moto moto = new Moto("Vermelho","Honda","CG 160",2022);
        Caminhao caminhao = new Caminhao("Azul","Volvo", "VM",2023);
        carro.mover();
        moto.mover();
        caminhao.mover();
    }
}