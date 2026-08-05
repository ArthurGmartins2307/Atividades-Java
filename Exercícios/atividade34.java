public class atividade34 {
    public static void main(String[] args) {
        Professor carlos = new Professor("Carlos", 15.000);
        Disciplina fisica = new Disciplina("Física", carlos);
        fisica.mostrarDisciplina();
    }
}

class Professor{
    String nome;
    double salario;

    public Professor(String n, double s){
        this.nome = n;
        this.salario = s;
    }
}

class Disciplina{
    String nome;
    Professor professorDisciplina;

    public Disciplina(String n, Professor professorDisciplina){
        this.nome = n;
        this.professorDisciplina = professorDisciplina;
    }

    public void mostrarDisciplina() {
    System.out.println("Disciplina: " + this.nome);
    System.out.println("Professor: " + professorDisciplina.nome);
    System.out.println("Salário: " + professorDisciplina.salario);
    }
}