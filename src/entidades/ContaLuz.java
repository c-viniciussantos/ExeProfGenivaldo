package entidades;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DB;

public class ContaLuz {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);

	private Date dataLeitura;
	private Integer numeroLeitura;
	private Integer qtdKwGasto;
	private Double valorPagar;
	private Date dataPagamento;
	private Double mediaConsumo;

	public ContaLuz() {
	}

	public ContaLuz(Date dataLeitura, Integer numeroLeitura, Integer qtdKwGasto, Double valorPagar, Date dataPagamento,
			Double mediaConsumo) {
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

	public String setDaLeitura(Date dataLeitura) {
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
	
	Connection conn = null;
	PreparedStatement st = null;
	
	try {
		conn = DB.getConnection();
		
		st = conn.prepareStatement( "INSERT INTO conta_de_luz "
				+" (dataLeitura, numLeitura, kwGasto, valorPagamento, dataPagamento, media consumo) "
				+" VALUES "
				+"(?, ?, ?, ?, ?)");
		
		st.setDate(1, new java.sql.Date(sdf.parse(setDaLeitura(dataLeitura)).getTime()));
		
		
			} catch() { 
				
			}
	}
}
		

		public void cadastrarConta() {
			System.out.print("Quantas contas quer cadastrar?: ");
			int op = sc.nextInt();
	
			for (int i = 1; i <= op; i++) {
				System.out.print("Informe a data da leitura: (DD/MM/YYYY): ");
				rs = st.executeQuery(sql)
				System.out.println();
				System.out.print("Informe o numero da leitura: ");
				numeroLeitura = sc.nextInt();
	
				System.out.println();
				System.out.print("Informe o Kw gasto: ");
				qtdKwGasto = sc.nextInt();
	
				System.out.println();
				System.out.print("Informe o valor a pagar: R$");
				valorPagar = sc.nextDouble();
	
				System.out.println();
				System.out.print("Digite a data de pagamento (DD/MM/YYYY): ");
	
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
	
	catch() {
		
	}

}
