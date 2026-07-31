public class atividade29 {
    public static void main(String[] args) {
        Aluno29[] alunos = {
                new Aluno29("Arthur", 18),
                new Aluno29("Ana", 15),
                new Aluno29("Isaac", 17),
                new Aluno29("Henrique", 17),
                new Aluno29("Gabriela", 19),
        };


        int maisNovo = alunos[0].idade;
        String maisNovoNome = alunos[0].nome;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade < maisNovo) {
                maisNovo = alunos[i].idade;
                maisNovoNome = alunos[i].nome;
            }
        }
        System.out.println("Aluno(a) mais novo(a): " + maisNovoNome + " Idade: " + maisNovo);
    }
}

class Aluno29{
    String nome;
    int idade;

    public Aluno29(String n, int i){
        this.nome = n;
        this.idade = i;
    }
}
