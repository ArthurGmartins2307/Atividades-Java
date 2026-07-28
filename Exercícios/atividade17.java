public class atividade17{
    public static void main(String[] args) {
        int[] numeros = {
            45,
            80,
            20,
            117,
            79
        };
        int maior = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior número: " + maior);
    }
}