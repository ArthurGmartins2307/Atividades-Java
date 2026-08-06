public class atividade35 {
    public static void main(String[] args) {
        Cachorro35[] cachorros = {
            new Cachorro35("Spike", "Fox paulista"),
            new Cachorro35("Bel", "Bulldog"),
            new Cachorro35("Alfredo", "Pugg"),
            new Cachorro35("Bonnie", "Golden"),
            new Cachorro35("Tody", "Pitbull"),
        };
        for(int i = 0; i < cachorros.length; i++){
            cachorros[i].mostrarCachorro();
        }
    }
}

class Cachorro35{
    String nome;
    String raca;

    public Cachorro35(String n, String r){
        this.nome = n;
        this.raca = r;
    }

    public void mostrarCachorro(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("------------------");
    }
}