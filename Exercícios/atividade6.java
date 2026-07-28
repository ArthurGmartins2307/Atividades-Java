public class atividade6 {
    public static void main(String[] args) {
        Pessoa arthur = new Pessoa("Arthur");
        arthur.mostrarNome();
        Pessoa ana = new Pessoa("Ana");
        ana.mostrarNome();
        Pessoa joao = new Pessoa("João");
        joao.mostrarNome();

        System.out.println("Pessoas: " + Pessoa.quantidadePessoas);
    }
}

class Pessoa{
    String nome;
    static int quantidadePessoas;

    public Pessoa(String nome){
        this.nome = nome;
        quantidadePessoas++;
    }
    public void mostrarNome(){
        System.out.println("Nome: " + nome);
    }
}