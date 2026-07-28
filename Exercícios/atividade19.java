public class atividade19 {
    public static void main(String[] args) {
        int[] numeros = {18, 16, 3, 19, 1, 8, 41, 7, 38, 28};
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("Soma: " + soma);
    }
}
