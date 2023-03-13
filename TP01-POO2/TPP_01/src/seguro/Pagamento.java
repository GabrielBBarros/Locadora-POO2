package seguro;

import java.io.*;

public abstract class Pagamento implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3509142964168573607L;
	protected String tipoPagamento;

	public Pagamento(){
	}
	
	public Pagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}