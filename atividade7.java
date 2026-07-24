public class atividade7 {
    public static void main(String[] args) {
        Carro carroArthur = new Carro("Jeep", "Renegade");
        carroArthur.acelerar();
        carroArthur.frear();
        carroArthur.mostrarVelocidade();
    }
}

class Carro{
    String marca;
    String modelo;
    int velocidade;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        velocidade = 0;
    }

    public void acelerar(){
        this.velocidade += 10;
    }
    public void frear(){
        if (velocidade >= 10) {
            velocidade -= 10;
        }else{
            System.out.println("O carro já está parado.");
        }
    }

    public void mostrarVelocidade(){
        System.out.println("Velocidade: " + velocidade + "km/h");
    }
}
