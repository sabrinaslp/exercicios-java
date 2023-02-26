// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. 
package ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um nome de usuário: ");
        String usuario = leia.nextLine();

        System.out.print("Informe uma senha: ");
        String senha = leia.nextLine();

        if (usuario.equals(senha)) {
            System.out.println("Erro. Você não pode colocar a senha igual ao nome de usuário.");

            System.out.println("Por favor, informe novamente o nome de usuário: ");
            usuario = leia.nextLine();

            System.out.println("Por favor, informe novamente a senha: ");
            senha = leia.nextLine();
        }

        System.out.print("Usuário registrado. ");
    }

}
