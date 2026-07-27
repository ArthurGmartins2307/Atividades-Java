public class atividade14{
    public static void main(String[] args) {
        String[] linguagens = new String[5];
        linguagens[0] = "Java";
        linguagens[1] = "JavaScript";
        linguagens[2] = "Python";
        linguagens[3] = "kotlin";
        linguagens[4] = "C#";

        int[] notas = new int[5];

        notas[0] = 10;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 7;
        notas[4] = 6;

        System.out.println("Exercício 1 -------");
        System.out.println(linguagens[0]);
        System.out.println(linguagens[1]);
        System.out.println(linguagens[2]);
        System.out.println(linguagens[3]);
        System.out.println(linguagens[4]);
        System.out.println("Exercício 2 -------");
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);
        System.out.println("Exercício 3 -------");
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
