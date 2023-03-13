package seguro;

import java.io.Serializable;
import java.time.LocalDate;

public class Registro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6968025180054859145L;
	private Pagamento pagamento;
	private LocalDate dataPagamento;
	
	public Registro() {
		
	}
	
	public Registro(Pagamento pagamento, LocalDate dataPagamento) {
		this.pagamento = pagamento;
		this.dataPagamento = dataPagamento;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
