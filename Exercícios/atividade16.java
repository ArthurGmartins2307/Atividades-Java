public class atividade16 {
    public static void main(String[] args) {
        Pessoa16[] nome = new Pessoa16[5];
        nome[0] = new Pessoa16("Arthur");
        nome[1] = new Pessoa16("Ana");
        nome[2] = new Pessoa16("João");
        nome[3] = new Pessoa16("Gabriel");
        nome[4] = new Pessoa16("Maria");

        for(int i = 0; i < nome.length; i++){
            nome[i].mostrarNome();
        }
    }
}

class Pessoa16{
    String nome;

    public Pessoa16(String nome){
        this.nome = nome;
    }
    public void mostrarNome(){
        System.out.println("Nome: " + nome);
    }
}