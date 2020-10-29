package entidades;

import java.text.ParseException;
import java.util.Scanner;

public class Menus extends ContaLuz {

	private static final long serialVersionUID = 1L;

	Scanner sc = new Scanner(System.in);

	int op;

	public void menuInicio() throws ParseException {

		do {
			System.out.println("----------------------------------");
			System.out.println("Acompanhamentos das Contas de Luz");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.println("-----O que vamos fazer hoje?------");
			System.out.println("- 1 - Cadastrar uma conta");
			System.out.println("- 2 - Consultar todas as contas");
			System.out.println("- 0 - Sair");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.print("Opcao desejada: ");
			op = sc.nextInt();
			switch (op) {

			case 1:
				menuCadastro();
				break;
			case 2:
				menuConsulta();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		} while (op != 0);

	}

	public void menuCadastro() throws ParseException {

		System.out.println("----------------------------------");
		System.out.println("          Menu Cadastro           ");
		System.out.println("----------------------------------");
		System.out.println();
		cadastrarConta();
		menuInicio();

	}

	public void menuConsulta() throws ParseException {

		System.out.println("----------------------------------");
		System.out.println("        Menu Total de contas      ");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Consultando...");
		select();
		System.out.println();
		System.out.println("Voltando para o menu...");
		menuInicio();
	}
}
