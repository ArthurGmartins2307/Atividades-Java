class atividade2 {
    public static void main(String[] args){
        Pessoa2 arthur = new Pessoa2();
        arthur.nome= "Arthur";
        arthur.apresentar();
        Pessoa2.mostrarMensagem();
    }
}

class Pessoa2{

    String nome;

    public void apresentar(){
        System.out.println("Olá! Meu nome é "+ this.nome);
    }
    public static void mostrarMensagem(){
        System.out.println("Bem-vindo ao programa!");
    }
}