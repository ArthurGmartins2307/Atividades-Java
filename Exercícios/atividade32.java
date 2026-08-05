void main() {
    Pessoa32 pessoa = new Pessoa32("Arthur", 18);
    Cachorro doguinho = new Cachorro("Plutão", "Labrador", pessoa);
    doguinho.mostrarInformacoes();
}

class Pessoa32{
    String nome;
    int idade;

    public Pessoa32(String n, int i){
        this.nome = n;
        this.idade = i;
    }
}

class Cachorro{
    String nome;
    String raca;
    Pessoa32 dono;

    public Cachorro(String n, String r, Pessoa32 dono){
        this.nome = n;
        this.raca = r;
        this.dono = dono;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do cachorro: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Nome do dono: " + dono.nome);
        System.out.println("Idade do dono: " + dono.idade);
    }
}

