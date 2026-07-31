public class atividade31{
    public static void main(String[] args){
        Produto31[] produtos = {
                new Produto31("Fone",80.00),
                new Produto31("Teclado",90.00),
                new Produto31("Mouse",85.00),
                new Produto31("Monitor",799.99),
                new Produto31("Controle",119.99),
        };
        for (int i = 0; i < produtos.length; i++){
            System.out.println("Nome: " + produtos[i].nome + " Preço: " + produtos[i].preco);
        }
    }
}

class Produto31{
    String nome;
    double preco;

    public Produto31(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}