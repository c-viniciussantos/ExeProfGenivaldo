package entities;

import java.util.Scanner;

public class MenuContas extends Contas{
	
	public int op;
	
	Scanner sc = new Scanner(System.in);

	public void menuInicio() {
		
		do {
		System.out.println("----------------------------------");
		System.out.println("Seja bem vindo Sr Gerente");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("-----O que vamos fazer hoje?------");
		System.out.println("- 1 - Cadastrar uma novo cliente");
		System.out.println("- 2 - Consultar extratos do cliente");
		System.out.println("- 3 - Realizar saque manual p/ cliente");
		System.out.println("- 4 - Realizar deposito p/ cliente");
		System.out.println("- 5 - Consultar saldo p/ cliente");
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
			menuExtrato();
			break;
		case 3:
			menuSaque();
			break;
		case 4:
			menuDeposito();
			break;
		case 5:
			menuSaldoAtual();
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
	
	public void menuCadastro() {
		System.out.println("----------------------------------");
		System.out.println("         Menu de cadastro         ");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.print("Informe o nome do titular: ");
		setNome(sc.nextLine());
		sc.nextLine();
		System.out.println();
		System.out.print("Informe o numero da conta c/ 4 digitos: ");
		setIdConta(sc.nextInt());
		System.out.println();
		System.out.print("Informe o saldo inicial da conta: R$");
		setSaldoAtual(sc.nextDouble());
		System.out.println();
		System.out.println("Conta criada com sucesso para "+ getNome()+"!!!");
		System.out.println("Voltando para o menu...");
		menuInicio();
		
	}
	
	public void menuExtrato() {
		System.out.println("----------------------------------");
		System.out.println("         Menu de extrato         ");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.print("Informe o numero da conta do cliente: ");
		int test = sc.nextInt();
		if(test == getIdConta()) {
			System.out.println("Extrato de "+getNome()+" localizado:");
			gerarExtrato();
			System.out.println();
			System.out.println("Voltando para o menu...");
			menuInicio();
		} else {
			System.out.println("Conta invalida...");
			System.out.println("Voltando para o menu...");
			menuInicio();
		}
		
	}
	
	public void menuSaque() {
		System.out.println("----------------------------------");
		System.out.println("         Menu de saque         ");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.print("Informe o numero da conta do cliente: ");
		int test = sc.nextInt();
		if(test == getIdConta()) {
			System.out.print("Quanto deseja sacar: R$");
			sacar(sc.nextDouble());
			System.out.println("");
			System.out.println("Saque realizado para "+getNome()+" com sucesso!");
			System.out.println();
			System.out.println("Voltando para o menu...");
			menuInicio();
		} else {
			System.out.println("Conta invalida...");
			System.out.println("Voltando para o menu...");
			menuInicio();
		}
		
	}
	
	public void menuDeposito() {
		System.out.println("----------------------------------");
		System.out.println("         Menu de deposito         ");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.print("Informe o numero da conta do cliente: ");
		int test = sc.nextInt();
		if(test == getIdConta()) {
			System.out.print("Quanto deseja depositar: R$");
			depositar(sc.nextDouble());
			System.out.println();
			System.out.println("Deposito realizado para "+getNome()+" com sucesso!");
			System.out.println();
			System.out.println("Voltando para o menu...");
			menuInicio();
		} else {
			System.out.println("Conta invalida...");
			System.out.println("Voltando para o menu...");
			menuInicio();
		}
	}
	
	public void menuSaldoAtual() {
		System.out.println("----------------------------------");
		System.out.println("         Menu de Saldo         ");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.print("Informe o numero da conta do cliente: ");
		int test = sc.nextInt();
		if(test == getIdConta()) {
			System.out.println();
			System.out.println("Gerando saldo...");
			System.out.println("-------------------");
			System.out.println("Saldo atual de "+getNome()+" eh de: "+ String.format("%.2f", getSaldoAtual()));
		} else {
			System.out.println("Conta invalida...");
			System.out.println("Voltando para o menu...");
			menuInicio();
		}
	}
}
