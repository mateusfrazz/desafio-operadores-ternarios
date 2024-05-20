package desafios;

import java.util.Scanner;

public class desafio_operadores_ternarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean respostaAluno = true;

        while (respostaAluno) {
            System.out.print("Você deseja calcular as suas notas desse semestre? (true/false): ");
            respostaAluno = entrada.nextBoolean();
            entrada.nextLine(); // Limpar o buffer do scanner

            if (respostaAluno) {
                System.out.print("Você deseja ver a média de todas as matérias ou apenas uma? Responda com 'todas' ou 'apenas uma': ");
                String respostaAlunoMateria = entrada.nextLine();

                if (respostaAlunoMateria.equalsIgnoreCase("todas")) {
                    System.out.print("Qual foi a sua média final na Disciplina de Português? ");
                    double notaPortugues = entrada.nextDouble();
                    System.out.print("Qual foi a sua média final na Disciplina de História? ");
                    double mediaHistoria = entrada.nextDouble();
                    System.out.print("Qual foi a sua média final na Disciplina de Matemática? ");
                    double mediaMatematica = entrada.nextDouble();
                    System.out.print("Qual foi a sua média final na Disciplina de Geografia? ");
                    double mediaGeografia = entrada.nextDouble();
                    double calcMedia = (notaPortugues + mediaHistoria + mediaMatematica + mediaGeografia) / 4;
                    String resultadoFinalMediaGeral = calcMedia >= 6.0 ? "aprovado" : "Recuperação";

                    System.out.println("Sua média final das disciplinas é: " + calcMedia + ". Nesse caso, você foi " + resultadoFinalMediaGeral);

                } else if (respostaAlunoMateria.equalsIgnoreCase("apenas uma")) {
                    System.out.print("Informe qual a matéria que você deseja: ");
                    String materiaUnicaString = entrada.next();
                    entrada.nextLine(); // Limpar o buffer do scanner

                    if (materiaUnicaString.equalsIgnoreCase("geografia")) {
                        System.out.print("Qual foi a sua média do primeiro período na Disciplina de Geografia? ");
                        double mediaGeografia1 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do segundo período? ");
                        double mediaGeografia2 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do terceiro período? ");
                        double mediaGeografia3 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do último período? ");
                        double mediaGeografia4 = entrada.nextDouble();
                        double calcMedia = (mediaGeografia1 + mediaGeografia2 + mediaGeografia3 + mediaGeografia4) / 4;
                        String resultadoFinalMediaGeo = calcMedia >= 6.0 ? "aprovado" : "Recuperação";
                        System.out.println("Sua média final da Disciplina de Geografia é: " + calcMedia + ". Nesse caso, você foi " + resultadoFinalMediaGeo);

                    } else if (materiaUnicaString.equalsIgnoreCase("portugues")) {
                        System.out.print("Qual foi a sua média do primeiro período na Disciplina de Português? ");
                        double mediaPortugues1 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do segundo período? ");
                        double mediaPortugues2 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do terceiro período? ");
                        double mediaPortugues3 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do último período? ");
                        double mediaPortugues4 = entrada.nextDouble();
                        double calcMedia = (mediaPortugues1 + mediaPortugues2 + mediaPortugues3 + mediaPortugues4) / 4;
                        String resultadoFinalMediaPort = calcMedia >= 6.0 ? "aprovado" : "Recuperação";
                        System.out.println("Sua média final da Disciplina de Português é: " + calcMedia + ". Nesse caso, você foi " + resultadoFinalMediaPort);

                    } else if (materiaUnicaString.equalsIgnoreCase("matematica")) {
                        System.out.print("Qual foi a sua média do primeiro período na Disciplina de Matemática? ");
                        double mediaMatematica1 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do segundo período? ");
                        double mediaMatematica2 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do terceiro período? ");
                        double mediaMatematica3 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do último período? ");
                        double mediaMatematica4 = entrada.nextDouble();
                        double calcMedia = (mediaMatematica1 + mediaMatematica2 + mediaMatematica3 + mediaMatematica4) / 4;
                        String resultadoFinalMediaMat = calcMedia >= 6.0 ? "aprovado" : "Recuperação";
                        System.out.println("Sua média final da Disciplina de Matemática é: " + calcMedia + ". Nesse caso, você foi " + resultadoFinalMediaMat);

                    } else if (materiaUnicaString.equalsIgnoreCase("historia")) {
                        System.out.print("Qual foi a sua média do primeiro período na Disciplina de História? ");
                        double mediaHistoria1 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do segundo período? ");
                        double mediaHistoria2 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do terceiro período? ");
                        double mediaHistoria3 = entrada.nextDouble();
                        System.out.print("Qual foi a sua média do último período? ");
                        double mediaHistoria4 = entrada.nextDouble();
                        double calcMedia = (mediaHistoria1 + mediaHistoria2 + mediaHistoria3 + mediaHistoria4) / 4;
                        String resultadoFinalMediaHist = calcMedia >= 6.0 ? "aprovado" : "Recuperação";
                        System.out.println("Sua média final da Disciplina de História é: " + calcMedia + ". Nesse caso, você foi " + resultadoFinalMediaHist);
                    }
                }
            }
        }
        System.out.println("Programa encerrado. Obrigado por utilizar o sistema.");
        entrada.close();
    }
}