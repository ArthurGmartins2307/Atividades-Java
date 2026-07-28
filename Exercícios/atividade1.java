 // Classepublic 
class atividade1{
    // Método
    public static void main(String[] args) {

        // Criando um objeto da classe Pessoa
        Pessoa arthur = new Pessoa();

        // Atribuindo um valor ao atributo nome 
        arthur.nome= "Arthur";

        // Chamando o método apresentar()
        arthur.apresentar();
    }
}

// Classe
class Pessoa {

    // Atributo
    String nome;

    // Método
    public void apresentar(){
        System.out.println("Olá! Meu nome é "+ this.nome);
    }
}