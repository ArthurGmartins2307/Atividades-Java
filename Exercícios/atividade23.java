public class atividade23 {
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
        System.out.println("Nuúmeros ímpares:");
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 1) {
                System.out.println(numeros[i]);
            }
        }
    }
}
