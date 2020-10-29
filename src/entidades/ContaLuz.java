package entidades;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DB;
import db.DbException;

public class ContaLuz implements Serializable {

	private static final long serialVersionUID = 1L;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);

	private String dataLeitura;
	private Integer numeroLeitura;
	private Integer qtdKwGasto;
	private Double valorPagar;
	private String dataPagamento;

	public ContaLuz() {
	}

	public ContaLuz(String dataLeitura, Integer numeroLeitura, Integer qtdKwGasto, Double valorPagar,
			String dataPagamento) {
		super();
		this.dataLeitura = dataLeitura;
		this.numeroLeitura = numeroLeitura;
		this.qtdKwGasto = qtdKwGasto;
		this.valorPagar = valorPagar;
		this.dataPagamento = dataPagamento;
	}

	public String getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(String dataLeitura) {
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

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void insert() {
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			st = conn.prepareStatement(
					"INSERT INTO conta_de_luz " + " (dataLeitura, numLeitura, kwGasto, valorPagamento, dataPagamento) "
							+ " VALUES " + "(?, ?, ?, ?, ?)",
					+Statement.RETURN_GENERATED_KEYS);

			st.setString(1, getDataLeitura());
			st.setInt(2, getNumeroLeitura());
			st.setInt(3, getQtdKwGasto());
			st.setDouble(4, getValorPagar());
			st.setString(5, getDataPagamento());

			int linhasAfetadas = st.executeUpdate();

			if (linhasAfetadas > 0) {
				System.out.println();
				System.out.println("Sucesso!! Linhas afetadas: " + linhasAfetadas);

			} else {
				System.out.println();
				throw new DbException("Erro inesperado!, nenhuma linha afetada!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
	public void select() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM conta_de_luz;");
			
			while(rs.next()) {
				System.out.println(rs.getInt("idConta") + ", "
						+ rs.getString("dataLeitura")+ ", "
						+ rs.getInt("numLeitura")+ ", "
						+ rs.getInt("kwGasto")+ ", "
						+ rs.getDouble("valorPagamento")+ ", "
						+ rs.getString("dataPagamento"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

	public void cadastrarConta() {

		System.out.print("Informe a data da leitura(DD/MM/YYYY): ");
		setDataLeitura(sc.nextLine());
		System.out.println();
		System.out.print("Informe o numero da leitura: ");
		setNumeroLeitura(sc.nextInt());

		System.out.println();
		System.out.print("Informe a quantidade de Kw gasto: ");
		setQtdKwGasto(sc.nextInt());

		System.out.println();
		System.out.print("Informe o valor a pagar: R$");
		setValorPagar(sc.nextDouble());
		sc.nextLine();
		System.out.println();
		System.out.print("Informe a data de pagamento: (DD/MM/YYYY)");
		setDataPagamento(sc.nextLine());
		
		System.out.println();
		System.out.println("Cadastrando dados no banco de dados...");
		System.out.println();
		insert();
	}
}
