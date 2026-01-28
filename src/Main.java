package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.IniciarFormulario();
        form.LerFormulario();
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (true){


            System.out.println("1. Cadastrar um novo pet");
            System.out.println("2. Alterar os dados do pet cadastrado");
            System.out.println("3. Deletar um pet cadastrado");
            System.out.println("4. Listar todos os pets cadastrados");
            System.out.println("5. Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6. Sair");

            System.out.print("Digite qual ação deseja fazer: ");
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException exception){
                System.out.println("É necessário que você digite um número! ");
                System.out.println(" ");
                scanner.nextLine();
                continue;
            }

            if (input == 6){
                break;
            }

        }

    }
}
