public class atividade9 {
    public static void main(String[] args){
        Livro9 livro1 = new Livro9("A revolução dos bichos", "George Orwel");
        Livro9 livro2 = new Livro9("1984", "George Orwel");
        Livro9 livro3 = new Livro9("Batman", "Matt Fraction");
        livro1.emprestar(); 
        livro1.emprestar();
        livro1.devolver();
        livro1.devolver();
        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
        livro3.mostrarInformacoes();
        Livro9.mostrarQuantidadeLivros();
    }
    
}

class Livro9{
    String titulo;
    String autor;
    boolean emprestado;
    static int quantidadeLivros;

    public Livro9(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        emprestado = false;
        quantidadeLivros++;
    }
        
    public void emprestar(){
        if (emprestado == false) {
            System.out.println("Livro emprestado com sucesso!");
            emprestado = true;
        }else{
            System.out.println("Este livro já está emprestado.");
        }
    }
    public void devolver(){
        if (emprestado == true) {
            System.out.println("Livro devolvido.");
            emprestado = false;
        }else{
            System.out.println("Este livro já estava disponível.");
        }
    }
    public void mostrarInformacoes(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Emprestado: " + emprestado);
    }
    public static void mostrarQuantidadeLivros(){
        System.out.println("Quantidade de livros cadastrados: " + quantidadeLivros);
    }
}