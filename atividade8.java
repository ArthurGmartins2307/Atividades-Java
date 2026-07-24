public class atividade8 {
    public static void main(String[] args){
        Produto notebook = new Produto("Notebook", 5000);
        notebook.mostrarProduto();
        Produto mouse = new Produto("Mouse", 80);
        mouse.aumentarPreco(10);
        mouse.mostrarProduto();
        Produto teclado = new Produto("Teclado", 120);
        teclado.mostrarProduto();
        Produto.mostrarQuantidade();
    };
}

class Produto{
    String nome;
    double preco;
    static int quantidadeProdutos;

    public Produto(String nome, double preco){
        this.nome = nome;
        if(preco > 0){
            this.preco = preco;
            quantidadeProdutos++;
        }else{
            System.out.println("Preço inválido. Produto não contabilizado.");
        }
        
    }

    public void mostrarProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }

    public static void mostrarQuantidade(){
        System.out.println("Quantidade de produtos cadastrados: " + quantidadeProdutos);
    }

    public void aumentarPreco(double porcentagem){
        if (porcentagem > 0) {
            preco += ((porcentagem / 100) * preco);
        }else{
            System.out.println("Não foi possível aumentar o preço do produto.");
        }
    }
}