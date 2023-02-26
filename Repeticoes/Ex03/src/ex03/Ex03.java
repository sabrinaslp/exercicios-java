/* 

Faça um programa que leia e valide as seguintes informações:
---> Nome: maior que 3 caracteres;
---> Idade: entre 0 e 150;
---> Salário: maior que zero;
---> Sexo: 'f' ou 'm';
---> Estado Civil: 's', 'c', 'v', 'd';  

 */
package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, salario;
        char genero, estadoCivil;

        do {
            System.out.println("Informe um nome: ");
            nome = leia.nextLine();
        } while (nome.length() < 3); // verifica se o tamanho da string (nome) é maior que 3

        do {
            System.out.println("Informe uma idade: ");
            idade = leia.nextInt();
        } while (idade < 0 | idade > 150); // verifica se a idade está entre 0 e 150

        do {
            System.out.println("Informe um salário: ");
            salario = leia.nextInt();
        } while (salario < 0); // verifica se o salario é maior que 0

        do {
            System.out.println("Informe o sexo (f ou m): ");
            genero = leia.next().charAt(0);
        } while (genero != 'f' && genero != 'm'); // verifica se gênero é valido

        do {
            System.out.println("Informe o estado civil (s/c/v/d): ");
            estadoCivil = leia.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
    }

}
