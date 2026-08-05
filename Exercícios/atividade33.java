public class atividade33 {
    public static void main(String[] args) {
        Motor motorNovo = new Motor(80.00 , 20);
        Carro carroNovo = new Carro("BYD", motorNovo);
        System.out.println("Modelo: " + carroNovo.modelo);
        System.out.println("Potência: " + carroNovo.motor.potencia);
        System.out.println("Combustível: " + carroNovo.motor.combustivel);
    }
}

class Motor{
    double potencia;
    double combustivel;

    public Motor(double potencia, double combustivel){
        this.potencia = potencia;
        this.combustivel = combustivel;
    }
}

class Carro{
    String modelo;
    Motor motor;

    public Carro(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }
}