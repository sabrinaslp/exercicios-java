// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação. 
package ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Declaração das variáveis da população de cada país
        int populacaoA = 80000;
        int populacaoB = 200000;

        // Declaração da variável de ano para ser utilizada como contador
        int anos = 0;

        // Solicitação das variáveis da taxa de porcentagem de crescimento
        double porcentagemA;
        double porcentagemB;

        do {
            System.out.println("Insira a taxa de porcentagem de crescimento do país A: ");
            porcentagemA = leia.nextDouble();

            System.out.println("Insira a taxa de porcentagem de crescimento do país B: ");
            porcentagemB = leia.nextDouble();
        } while (porcentagemA < 0.0 || porcentagemB < 0.0);

        do {
            anos += 1;
            populacaoA *= porcentagemA;
            populacaoB *= porcentagemB;
        } while (populacaoA < populacaoB);

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);

        System.out.println("Será necessário " + anos + " anos para que a população do país A iguale ou ultrapasse a quantidade habitantes do país B. ");

    }

}
