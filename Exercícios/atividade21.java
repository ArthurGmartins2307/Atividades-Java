// |-/
public class atividade21 {
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
        int maior = 0;
        int menor = 0;
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] >= 10) {
                maior++;
            }else{
                menor++;
            }
        }
        System.out.println("Números maiores ou iguais a 10: " + maior);
        System.out.println("Números menores que 10: " + menor);
    }
}
