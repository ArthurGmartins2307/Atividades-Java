public class atividade28 {
    public static void main(String[] args) {
        Aluno28 alunos[] = new Aluno28[5];
        alunos[0] = new Aluno28("Arthur", 18);
        alunos[1] = new Aluno28("Ana", 15);
        alunos[2] = new Aluno28("Isaac", 17);
        alunos[3] = new Aluno28("Henrique", 17);
        alunos[4] = new Aluno28("Gabriela", 19
        );

        int maisVelho = alunos[0].idade;
        String maisVelhoNome = alunos[0].nome;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade > maisVelho) {
                maisVelho = alunos[i].idade;
                maisVelhoNome = alunos[i].nome;
            }
        }
        System.out.println("Aluno mais velho: " + maisVelhoNome + " Idade: " + maisVelho);
    }
}

class Aluno28{
    String nome;
    int idade;

    public Aluno28(String n, int i){
        this.nome = n;
        this.idade = i;
    }
}
