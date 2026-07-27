public class atividade15 {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno("Arthur", 18);
        alunos[1] = new Aluno("Ana", 18);
        alunos[2] = new Aluno("João", 19);

        for(int i = 0; i < alunos.length; i++){
            alunos[i].mostrarAluno();
        }
    }
}

class Aluno{
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}