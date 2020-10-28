package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sun.javafx.binding.StringFormatter;

public class ContaLuz {
	
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	List<String> list = new ArrayList<String>();
	

	private Date dataLeitura;
	private Integer numeroLeitura;
	private Integer qtdKwGasto;
	private Double valorPagar;
	private Date dataPagamento;
	private Double mediaConsumo;

	public ContaLuz() {
	}

	public ContaLuz(Date dataLeitura, Integer numeroLeitura, Integer qtdKwGasto, Double valorPagar,
			Date dataPagamento, Double mediaConsumo) {
		super();
		this.dataLeitura = dataLeitura;
		this.numeroLeitura = numeroLeitura;
		this.qtdKwGasto = qtdKwGasto;
		this.valorPagar = valorPagar;
		this.dataPagamento = dataPagamento;
		this.mediaConsumo = mediaConsumo;
	}

	public Date getDataLeitura() {
		return dataLeitura;
	}

	public void setDaLeitura(Date dataLeitura) {
		this.dataLeitura = dataLeitura;
	}

	public Integer getNumeroLeitura() {
		return numeroLeitura;
	}

	public void setNumeroLeitura(Integer numeroLeitura) {
		this.numeroLeitura = numeroLeitura;
	}

	public Integer getQtdKwGasto() {
		return qtdKwGasto;
	}

	public void setQtdKwGasto(Integer qtdKwGasto) {
		this.qtdKwGasto = qtdKwGasto;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getMediaConsumo() {
		return mediaConsumo;
	}

	public void setMediaConsumo(Double mediaConsumo) {
		this.mediaConsumo = mediaConsumo;
	}

	public void cadastrarConta() {
		System.out.print("Quantas contas quer cadastrar?: ");
		int op = sc.nextInt();

		for (int i = 1; i <= op; i++) {
			System.out.print("Informe a data da leitura: (DD/MM/YYYY): ");
			try {
				dataLeitura = sdf1.parse(sc.next());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			list.add(String.format("Data de leitura: ", getDataLeitura()));
			
			System.out.println();
			System.out.print("Informe o numero da leitura: ");
			numeroLeitura = sc.nextInt();
			list.add(String.format("Numero de leitura", getNumeroLeitura()));
			
			System.out.println();
			System.out.print("Informe o Kw gasto: ");
			qtdKwGasto = sc.nextInt();
			list.add(String.format("Quantidade Kw Gasto", getQtdKwGasto()));
			
			System.out.println();
			System.out.print("Informe o valor a pagar: R$");
			valorPagar = sc.nextDouble();
			list.add(String.format("Valor a pagar R$", getValorPagar()));
			
			System.out.println();
			System.out.print("Digite a data de pagamento (DD/MM/YYYY): ");
			try {
				dataPagamento = sdf2.parse(sc.next());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			list.add(String.format("Data de pagamento: ", getDataPagamento()));
			
			System.out.println();
			System.out.println("Processando " + i + " novas contas...");
		}

		System.out.println();
		System.out.println("Contas cadastradas com sucesso!!!");
		System.out.println("Voltando para o menu...");
		
		
	}

	public Date verificaMesMenorConsumo() {
		return null;
	}

	public Date varificaMesMaiorConsumo() {
		return null;
	}
	
	public void mediaConsumo() {
		
	}

}
