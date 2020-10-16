package entities;

import java.util.ArrayList;
import java.util.List;

public class Contas {

	private String nome;
	private Integer idConta;
	private Double saldoAtual;
	
	List<String> listSaques = new ArrayList<String>();
	List<String> listDepositos = new ArrayList<String>();
	
	public Contas(){
	}

	public Contas(String nome, Integer idConta, Double saldoAtual) {
		super();
		this.nome = nome;
		this.idConta = idConta;
		this.saldoAtual = saldoAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public void sacar(Double valor) {
		
		if(valor <= saldoAtual ) {
			saldoAtual -= valor;
		listSaques.add("Saque realizado de "+ String.format("%.2f", valor));
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(Double valor) {
		saldoAtual += valor;
		listDepositos.add("Deposito realizado de "+ String.format("%.2f", valor));
	}
	
	public void gerarExtrato() {
		System.out.println("Gerando extrato...");
		System.out.println("-------------------");
		System.out.println("Extratos de depositos:");
		for (int i = 0; i < listDepositos.size(); i++) {
			String deposito = listDepositos.get(i);
			System.out.println(listDepositos);
		}
		
		for (int i = 0; i < listSaques.size(); i++) {
			System.out.println("Extratos de saques:");
			String saque = listSaques.get(i);
			System.out.println(listSaques);
		}
		
	}
}
