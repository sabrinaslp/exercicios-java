//  Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.          
package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe uma nota de 0 a 10: ");
        int nota = leia.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.print("Valor inválido! Informe a nota novamente: ");
            nota = leia.nextInt();
        }

    }

}
