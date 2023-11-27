package Livraria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                LIVRARIA                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Livros                         ");
			System.out.println("            2 - Listar todos os Livros             ");
			System.out.println("            3 - Buscar livro por ID             ");
			System.out.println("            4 - Atualizar Livros            ");
			System.out.println("            5 - Apagar Livros                         ");
			System.out.println("            6 - Sair                               ");
			
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 6) {
				System.out.println("Volte Sempre!\n");
				sobre();
				break;
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Cadastrar Livro\n");
				keyPress();
				break;
			case 2:
				System.out.println("\n Listar todos os Livros\n");
				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar Livro por ID\n");
				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar Livro\n");
				keyPress();
				break;
			case 5:
				System.out.println("\n Deletar Livro\n");
				keyPress();
				break;
			default:
				System.out.println("\n Opção inválida\n");
				keyPress();
				break;	
			}

		}

	}
      
	private static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Pressione enter, por favor");
		}
		
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Carolina Dias");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/carolinasdias/conta_bancaria");
		System.out.println("*********************************************************");
	}
}