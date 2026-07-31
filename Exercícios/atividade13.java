public class atividade13 {
    public static void main(String[] args) {
        ContaBancaria13 arthur = new ContaBancaria13("Arthur", 0);
        ContaBancaria13 ana = new ContaBancaria13("Ana", 1);
        arthur.depositar(500); 
        arthur.transferir(ana, 200);
        ana.sacar(50);
        arthur.sacar(1000);
        ana.depositar(-70);
        arthur.transferir(ana, 10000);
        arthur.mostrarConta();
        ContaBancaria13.mostrarQuantidadeContas();
    }
}

class ContaBancaria13{
    String titular;
    int numeroConta;
    double saldo;
    static int quantidadeContas;

    public ContaBancaria13(String titular, int numeroConta){
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

    public void transferir(ContaBancaria13 destino, double valor){
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarConta(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
    public static void mostrarQuantidadeContas(){
        System.out.println("Quantidade de contas registradas" + ContaBancaria13.quantidadeContas);
    }
}