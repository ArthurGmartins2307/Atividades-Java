public class atividade12 {
    public static void main(String[] args){
        Cliente arthur = new Cliente("Arthur", "42223437818");
        Cliente ana = new Cliente("Ana", "123345678910");
        Pedido arthurPedido = new Pedido(67, 50.00, arthur);
        Pedido arthurPedido2 = new Pedido(72, 15.50, arthur);
        Pedido anaPedido = new Pedido(69, 30.00, ana);
        arthurPedido.mostrarPedido();
        arthurPedido2.mostrarPedido();
        anaPedido.mostrarPedido();
        System.out.println("Quantidade de pedidos: " + Pedido.quantidadePedidos);
    }
}

class Cliente{
    String nome;
    String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}

class Pedido{
    int numeroPedido;
    double valor;
    Cliente cliente;
    static int quantidadePedidos;

    public Pedido(int numeroPedido, double valor, Cliente cliente){
        this.numeroPedido = numeroPedido;
        this.valor = valor;
        this.cliente = cliente;
        quantidadePedidos++;
    }
    public void mostrarPedido(){
       System.out.println("Pedido: " + this.numeroPedido);
       System.out.println("Valor: " + this.valor);
       System.out.println("Cliente: " + this.cliente.nome);
       System.out.println("CPF: " + cliente.cpf);
    }
}