package seguro;

import java.io.*;

public class Dinheiro extends Pagamento implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7912715786545131126L;

	public Dinheiro() {
		
	}

	public Dinheiro(String tipoPagamento) {
		super(tipoPagamento);
		
	}

	@Override
	public String toString() {
		return "Pagamento [tipoPagamento=" + tipoPagamento + "]";
	}


}