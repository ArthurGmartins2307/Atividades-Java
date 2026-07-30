public class atividade24 {
    public static void main(String[] args) {
        int[] numeros = {
            15,
            63,
            53,
            4,
            7,
            3,
            21,
            67,
            89,
            14,
            563,
            6,
            78,
            9,
            2,
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
