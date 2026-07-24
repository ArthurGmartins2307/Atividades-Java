class atividade2 {
    public static void main(String[] args){
        Pessoa arthur = new Pessoa();
        arthur.nome= "Arthur";
        arthur.apresentar();
        Pessoa.mostrarMensagem();
    }
}

class Pessoa{

    String nome;

    public void apresentar(){
        System.out.println("Olá! Meu nome é "+ this.nome);
    }
    public static void mostrarMensagem(){
        System.out.println("Bem-vindo ao programa!");
    }
}