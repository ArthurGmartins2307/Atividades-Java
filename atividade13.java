public class atividade13 {
    public static void main(String[] args) {
        ContaBancaria arthur = new ContaBancaria("Arthur", 0);
        ContaBancaria ana = new ContaBancaria("Ana", 1);
        arthur.depositar(500); 
        arthur.transferir(ana, 200);
        ana.sacar(50);
        arthur.sacar(1000);
        ana.depositar(-70);
        arthur.transferir(ana, 10000);
        arthur.mostrarConta();
        ContaBancaria.mostrarQuantidadeContas();
    }
}

class ContaBancaria{
    String titular;
    int numeroConta;
    double saldo;
    static int quantidadeContas;

    public ContaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        saldo = 0.00;
        quantidadeContas++;
    }

    public void depositar(double valor){
        if (valor > 0) {
            System.out.println("Depósito realizado.");
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double saldo){
        if (saldo <= this.saldo) {
            System.out.println("Saque realizado.");
            this.saldo -= saldo;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(ContaBancaria destino, double valor){
        if (valor > 0 && this.saldo >= valor) {
            System.out.println("Transferência realizada.");
            this.saldo -= valor;
            destino.saldo += valor;
        }else{
            System.out.println("Valor inválido para transferir.");
        }
    }

    public void mostrarConta(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
    public static void mostrarQuantidadeContas(){
        System.out.println("Quantidade de contas registradas" + ContaBancaria.quantidadeContas);
    }
}