public class atividade3{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        calc.somar(10, 5);
        calc.mostrarResultado();

        calc.multiplicar(8, 4);
        calc.mostrarResultado();

        calc.dividir(50, 10);
        calc.mostrarResultado();

        calc.limpar();
        calc.mostrarResultado();
    }
}

class Calculadora{
    double resultado;
    public Calculadora(){
        resultado = 0;
    }
    public double somar(double a, double b){
        resultado = a + b;
        return resultado;
    }
    public double subtrair(double a, double b){
        resultado = a - b;
        return resultado;
    }
    public double multiplicar(double a, double b){
        resultado = a * b;
        return resultado;
    }
    public double dividir(double a, double b){
        if (b != 0) {
            resultado = a / b;
            return resultado;
        }else{
            System.out.println("Erro!");
            return Double.NaN;
        }
    }

    public void limpar(){
        resultado = 0;
    }

    public void mostrarResultado(){
        System.out.println("Resultado: " + resultado);
    }
}
