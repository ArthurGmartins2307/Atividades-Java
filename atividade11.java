public class atividade11 {
    public static void main(String[] args) {
        Curso java = new Curso("Java", 16);
        Aluno arthur = new Aluno("Arthur", 18, java);
        arthur.mostrarAluno();
    }
}
//lembrar de perguntar se pode ter ``
class Aluno{
    String nome;
    int idade;
    Curso curso; //Parte mais importante do exercício;

    public Aluno(String nome, int idade, Curso nomeCurso){
        this.nome = nome;
        this.idade = idade;
        this.curso = nomeCurso;
    }

    public void mostrarAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Curso: " + this.curso.nome);
        System.out.println("Carga horária: " + this.curso.cargaHoraria);
    }
}

class Curso{
    String nome;
    int cargaHoraria;

    public Curso(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void mostrarCurso(){
        System.out.println("Curso: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
    }
}
