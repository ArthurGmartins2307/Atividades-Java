public class atividade27 {
    public static void main(String[] args) {
        Aluno27 alunos[] = new Aluno27[5];
        alunos[0] = new Aluno27("Arthur", 18);
        alunos[1] = new Aluno27("Ana", 15);
        alunos[2] = new Aluno27("Isaac", 17);
        alunos[3] = new Aluno27("Henrique", 17);
        alunos[4] = new Aluno27("Gabriela", 15);

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i].nome);
        }
    }
}

class Aluno27{
    String nome;
    int idade;

    public Aluno27(String n, int i){
        this.nome = n;
        this.idade = i;
    }
}
