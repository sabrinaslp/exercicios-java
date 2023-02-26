/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas 
de crescimento. */
package ex04;

public class Ex04 {

    public static void main(String[] args) {

        // Declaração das variáveis da população de cada país
        int populacaoA = 80000;
        int populacaoB = 200000;

        // Declaração das variáveis da taxa de porcentagem de crescimento
        double porcentagemA = 3;
        double porcentagemB = 1.5;

        // Declaração da variável de ano para ser utilizada como contador
        int anos = 0;

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
