public class atividade27 {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[5];
        alunos[0] = new Aluno("Arthur", 18);
        alunos[1] = new Aluno("Ana", 15);
        alunos[2] = new Aluno("Isaac", 17);
        alunos[3] = new Aluno("Henrique", 17);
        alunos[4] = new Aluno("Gabriela", 15);

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i].nome);
        }
    }
}

class Aluno{
    String nome;
    int idade;

    public Aluno(String n, int i){
        this.nome = n;
        this.idade = i;
    }
}
