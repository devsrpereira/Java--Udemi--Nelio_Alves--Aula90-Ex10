package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nQuantos alunos serão digitados: ");
        int n = sc.nextInt();
        String[] nomeAluno = new String[n];
        double[] n1Aluno = new double[n];
        double[] n2Aluno = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome, primeria e segunda nota do %do aluno:%n",(i+1));
            sc.nextLine();
            nomeAluno[i] = sc.nextLine();
            n1Aluno[i] = sc.nextDouble();
            n2Aluno[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        double media = 0;

        for (int i = 0; i < n; i++) {
            media = (n1Aluno[i] + n2Aluno[i])/2;
            if(media >= 6){
                System.out.println(nomeAluno[i]);
            }
        }


        System.out.println();
        sc.close();
    }
}
