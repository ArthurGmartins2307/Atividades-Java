public class atividade36 {
    public static void main(String[] args) {
        Escola escola = new Escola(5);

        Aluno36 arthur = new Aluno36("Arthur", 18);
        Aluno36 ana = new Aluno36("Ana", 18);
        Aluno36 joao = new Aluno36("João", 19);

        escola.cadastrarAluno(arthur);
        escola.cadastrarAluno(ana);
        escola.cadastrarAluno(joao);

        escola.listarAlunos();
    }
}

class Aluno36{
    String nome;
    int idade;

    public Aluno36(String n, int i){
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
    Aluno36[] alunos;
    int quantidadeAlunos;

    public Escola(int capacidade){
        this.alunos = new Aluno36[capacidade];
    }

    void cadastrarAluno(Aluno36 aluno){
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    void listarAlunos(){
        for(int i = 0; i < quantidadeAlunos; i++){
            alunos[i].mostrarAluno();
        }
    }
}