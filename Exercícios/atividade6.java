public class atividade6 {
    public static void main(String[] args) {
        Pessoa6 arthur = new Pessoa6("Arthur");
        arthur.mostrarNome();
        Pessoa6 ana = new Pessoa6("Ana");
        ana.mostrarNome();
        Pessoa6 joao = new Pessoa6("João");
        joao.mostrarNome();

        System.out.println("Pessoa6s: " + Pessoa6.quantidadePessoas);
    }
}

class Pessoa6{
    String nome;
    static int quantidadePessoas;

    public Pessoa6(String nome){
        this.nome = nome;
        quantidadePessoas++;
    }
    public void mostrarNome(){
        System.out.println("Nome: " + nome);
    }
}