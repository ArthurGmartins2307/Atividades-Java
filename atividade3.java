class Animal{
    String nome;
    String especie;

    void emitirSom(){
        System.out.println("Meu nome é " + nome + " e eu sou um " + especie);
    }
}

public class atividade3{
    public static void main(String[] args){
        Animal spike = new Animal();
        spike.nome = "Spike";
        spike.especie = "cachorro";
        spike.emitirSom();
    }
}