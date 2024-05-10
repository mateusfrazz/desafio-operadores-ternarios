package desafios;

import java.util.Scanner;

public class desafio_operadores_ternarios {
    public static void main(String[] args) {

        //obtendo as medias das materias
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá aluno, esse é o sistema de medias, informe as suas notas para calcularmos a media final");
        System.out.println("Qual foi a sua media final na Disciplina de Português? ");
        double mediaPortugues = scanner.nextDouble();
        System.out.println("Qual foi a sua media final na Disciplina de Historia? ");
        double mediaHistoria = scanner.nextDouble();
        System.out.println("Qual foi a sua media final da Disciplina de Matematica? ");
        double mediaMatematica = scanner.nextDouble();
        System.out.println("Qual foi a sua media final na Disciplina de Geografia? ");
        double mediaGeografia = scanner.nextDouble();

        //calculando as medias
        double mediaFinal = mediaPortugues * mediaHistoria * mediaMatematica / 2;

        //Condicionando a variavel resultadoMedias
        String resultadoMedias = mediaFinal >= 6.0 ? "aprovado" : "Recuperação";

        //Exibindo o resultado final do aluno com base no calculo de Medias
        System.out.println("O seu resultado Final é " + resultadoMedias);
    }
}