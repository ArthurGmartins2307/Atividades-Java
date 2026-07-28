public class atividade4 {
    public static void main(String[] args) {
       ContaBancaria arthur = new ContaBancaria("Arthur");
       arthur.depositar(100);
       arthur.depositar(250);
       arthur.mostrarSaldo();
    }
}

class ContaBancaria{
    String titular;
    double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        saldo = 0;
    };
    public void depositar(double valor){
        saldo += valor;
    };
    public void mostrarSaldo(){
        System.out.println("Titular: " + titular + 
                           "Saldo: " + saldo);
    }
}
