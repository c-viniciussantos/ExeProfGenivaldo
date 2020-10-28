package entidades;

import java.text.ParseException;
import java.util.Scanner;

public class Menus extends ContaLuz{

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
		System.out.println("- 3 - Consultar mes de menor consumo");
		System.out.println("- 4 - Consultar mes de maior consumo");
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
		case 3:
			menuMenor();
			break;
		case 4:
			menuMaior();
			break;
		case 0:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opcao invalida!");
			break;
			}
		}while(op != 0);
		
		}
		
			public void menuCadastro() throws ParseException {
				
				System.out.println("----------------------------------");
				System.out.println("          Menu Cadastro           ");
				System.out.println("----------------------------------");
				System.out.println();
				cadastrarConta();
				menuInicio();
				
			}
			
			public void menuConsulta() {
					
				System.out.println("----------------------------------");
				System.out.println("        Menu Total de contas      ");
				System.out.println("----------------------------------");
				System.out.println();
				
			}
			
			public void menuMenor() {
				
				System.out.println("----------------------------------");
				System.out.println("   Menu Mes de Menor Consumo	  ");
				System.out.println("----------------------------------");
				System.out.println();
				
			}
			
			public void menuMaior() {
			
				System.out.println("----------------------------------");
				System.out.println("   Menu Mes de Maior Consumo	  ");
				System.out.println("----------------------------------");
				System.out.println();
				
		}
	}		
		
