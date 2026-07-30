public class atividade25 {
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
        int menor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Menor número: " + menor);
    }
}
