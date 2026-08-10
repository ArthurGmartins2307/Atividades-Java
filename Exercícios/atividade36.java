public class atividade36 {
    public static void main(String[] args) {
        Escola escola = new Escola(5);

        Aluno arthur = new Aluno("Arthur", 18);
        Aluno ana = new Aluno("Ana", 18);
        Aluno joao = new Aluno("João", 19);

        escola.cadastrarAluno(arthur);
        escola.cadastrarAluno(ana);
        escola.cadastrarAluno(joao);

        escola.listarAlunos();
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
        System.out.println("-----------" );
    }
}

class Escola{
    Aluno[] alunos;
    int quantidadeAlunos;

    public Escola(int quantidadeAlunos){
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeAlunos++;
    };

    void cadastrarAluno(Aluno aluno){
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    void listarAlunos(){
        for(int i = 0; i < quantidadeAlunos; i++){
            alunos[i].mostrarAluno();
        }
    }
}