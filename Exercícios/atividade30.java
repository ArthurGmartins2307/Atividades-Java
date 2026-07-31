public class atividade30 {
    public static void main(String[] args) {
        Aluno30[] alunos = {
                new Aluno30("Arthur", 18),
                new Aluno30("Ana", 15),
                new Aluno30("Isaac", 17),
                new Aluno30("Henrique", 17),
                new Aluno30("Gabriela", 19),
        };

        String procurar = "Henrique";
        for (int i = 0; i < alunos.length; i++) {
            if (procurar == alunos[i].nome) {
                System.out.println("Aluno encontrado.");
            }else{
                System.out.println("Aluno não encontrado.");
            }
        }
    }
}

class Aluno30{
    String nome;
    int idade;

    public Aluno30(String n, int i){
        this.nome = n;
        this.idade = i;
    }
}
