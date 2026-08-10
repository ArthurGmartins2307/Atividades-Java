public class atividade36 {
    public static void main(String[] args) {
        
    }
}

class Aluno{
    String nome;
    int idade;

    public Aluno(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    void mostrarAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}

class Escola{
    Aluno[] alunos;
    int quantidadeAlunos;

    public Escola(int quantidadeAlunos){
        this.quantidadeAlunos = quantidadeAlunos;
    };

    void cadastrarAluno(Aluno aluno){
        
    }
}