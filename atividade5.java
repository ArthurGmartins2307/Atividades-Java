public class atividade5 {
    public static void main(String[] args) {
        Celular celularNovo = new Celular("Samsung", "Galaxy S24");
        celularNovo.ligar();
        celularNovo.mostrarEstado();
    }
}

class Celular{
    String marca;
    String modelo;
    boolean ligado;
    
    public Celular(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        ligado = false;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ligado: " + ligado);
    }
}